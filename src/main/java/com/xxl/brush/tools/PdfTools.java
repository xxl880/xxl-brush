package com.xxl.brush.tools;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfSmartCopy;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PdfTools {
    public static void main(String[] args) {
                 try {
                       PdfReader.unethicalreading = true;
                      PdfReader reader = new PdfReader(new FileInputStream("E:/pdf/发票PBS2012310051.pdf"));//已加密的文件
                     PdfStamper stamper = new PdfStamper(reader, new FileOutputStream("E:/pdf/发票PBS2012310051.pdf"));
                      stamper.setEncryption(null, null, PdfWriter.ALLOW_COPY, false);
                         stamper.close();
                       reader.close();
                  } catch(Exception e) {
                      e.printStackTrace();
                  }
           }

}
