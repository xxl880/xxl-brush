package com.xxl.brush.tools;

import com.xxl.brush.constants.PhoneConstants;
import io.swagger.models.auth.In;
import net.sourceforge.tess4j.ITessAPI;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.Word;
import net.sourceforge.tess4j.util.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * todo ocr识别工具类
 *
 */
public class OcrTools {
    private static final Logger log = LoggerFactory.getLogger(OcrTools.class);

   public static ITesseract init(){
       // 图片和语言库的存放路径
       String path = "C:\\Program Files\\Tesseract-OCR\\tessdata";
       // 创建ITesseract对象
       ITesseract instance = new Tesseract();
       // 设置训练库的位置
       instance.setDatapath(path);
       // 根据需求选择语言库 chi_sim ：简体中文， eng
       instance.setLanguage("chi_sim");


       return instance;
   }


    /**
     * Test of getSegmentedRegions method, of class Tesseract.
     * 得到每一个划分区域的具体坐标
     * @throws java.lang.Exception
     */
    public static void getSegmentedRegions(String imagePath) {
        try {
            ITesseract instance = init();
            log.info("getSegmentedRegions at given TessPageIteratorLevel");
            File imageFile = new File(imagePath);
            BufferedImage bi = ImageIO.read(imageFile);
            int level = ITessAPI.TessPageIteratorLevel.RIL_SYMBOL;
            log.info("PageIteratorLevel: " + Utils.getConstantName(level, ITessAPI.TessPageIteratorLevel.class));
            java.util.List<Rectangle> result = instance.getSegmentedRegions(bi, level);
            for (int i = 0; i < result.size(); i++) {
                Rectangle rect = result.get(i);
                log.info(String.format("Box[%d]: x=%d, y=%d, w=%d, h=%d", i, rect.x, rect.y, rect.width, rect.height));
            }
        }catch (Exception e){}

    }


    /**
     * todo 获取文本信息
     * @param imagePath
     */
    public static void process(String imagePath){
        ITesseract instance = init();
        // 图片路径
        File file = new File(imagePath);
        System.out.println("本地文件路径：".concat(file.getPath()));

        String result = null;
        try {
            // 识别开始获取时间戳
            long startTime = System.currentTimeMillis();
            // 图片识别
            Rectangle rect = new Rectangle(130,0,400,1900);
            result =  instance.doOCR(file,rect);
            // 识别结束时间戳
            long endTime = System.currentTimeMillis();
            System.out.println("Time is：" + (endTime - startTime) + " 毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 识别信息
        System.out.println("result: ".concat(result));
    }


    public static void testDoOCR_BufferedImage(String imagePath) {
        try {
            ITesseract instance = init();
            log.info("doOCR on a buffered image of a PNG");
            File imageFile = new File(imagePath);
            BufferedImage bi = ImageIO.read(imageFile);

            String result = instance.doOCR(bi);
            log.info(result);
        }catch (Exception e){}
    }


  /*  public static void testGetWords(String imagePath){
        try {
            log.info("getWords");
            ITesseract instance = init();
            File imageFile = new File(imagePath);


            //按照每个字取词
            int pageIteratorLevel = ITessAPI.TessPageIteratorLevel.RIL_TEXTLINE;
            log.info("PageIteratorLevel: " + Utils.getConstantName(pageIteratorLevel, ITessAPI.TessPageIteratorLevel.class));
            BufferedImage bi = ImageIO.read(imageFile);
            java.util.List<Word> result = instance.getWords(bi, pageIteratorLevel);

            //print the complete result
            for (Word word : result) {
                log.info(word.toString());
                log.info(word.getBoundingBox().getY()+"");
            }
        }catch (Exception e){}
    }*/

    /**
     * todo 获取手机截图出现字符坐标
     * @param imagePath
     * @param banners
     * @return
     */
    public static Map<String, Integer> getWordsMap(String imagePath, java.util.List<String> banners){
        Map<String, Integer> map = new HashMap<>();
        try {
            ITesseract instance = init();
            File imageFile = new File(imagePath);
            //按照每个字取词
            int pageIteratorLevel = ITessAPI.TessPageIteratorLevel.RIL_TEXTLINE;
            log.info("PageIteratorLevel: " + Utils.getConstantName(pageIteratorLevel, ITessAPI.TessPageIteratorLevel.class));
            BufferedImage bi = ImageIO.read(imageFile);
            java.util.List<Word> result = instance.getWords(bi, pageIteratorLevel);

            //print the complete result
            for (Word word : result) {
                String bannerOcr = word.toString().replace(" ","");
                for(String banner:banners){
                    if(bannerOcr.contains(banner)){
                        int y = word.getBoundingBox().y+50;
                        log.info("OCR识别字段："+banner+" Y轴坐标："+y);
                        map.put(banner,y);
                    }
                }

            }
        }catch (Exception e){}
        return map;
    }


    /**
     * todo 获取手机截图出现单个字符坐标
     * @param banner
     * @return
     */
    public static Integer getWordsInt(String androidId, String banner){
        try {
            AdbTools.screencap(androidId);
            AdbTools.pull(androidId);
            ITesseract instance = init();
            File imageFile = new File("D:\\image\\"+androidId+".jpg");
            //按照每个字取词
            int pageIteratorLevel = ITessAPI.TessPageIteratorLevel.RIL_TEXTLINE;
            log.info("PageIteratorLevel: " + Utils.getConstantName(pageIteratorLevel, ITessAPI.TessPageIteratorLevel.class));
            BufferedImage bi = ImageIO.read(imageFile);
            java.util.List<Word> result = instance.getWords(bi, pageIteratorLevel);

            //print the complete result
            for (Word word : result) {
                String bannerOcr = word.toString().replace(" ","");
                //log.info("****原始OCR字段****"+bannerOcr+"***原始OCR坐标***"+word.getBoundingBox().y);
                  log.info("****原始OCR字段****"+bannerOcr);
                    if(bannerOcr.contains(banner)){
                        int y = word.getBoundingBox().y+50;
                        log.info("OCR识别字段："+banner+" Y轴坐标："+y);
                         return y;
                }

            }
        }catch (Exception e){}

        return null;
    }


    public static void main(String[] args) {
        getWordsInt("a64d4bd","11111111111111111111");
    }



}
