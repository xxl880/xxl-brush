package com.xxl.brush.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 统一返回对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BaseResponse<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final String CODE_SUCCESS = "0";//请求成功
	private static final String MESSAGE_SUCCESS = "请求成功";

	private static final String CODE_FAILURE = "-1";//请求失败
	private static final String MESSAGE_FAILURE = "请求失败";

	/**
	 * 返回数据 数据可为单个对象，map,collection,分页对象 PageData,基本数据类型
	 */
	protected T data;
	
	/**
	 * 返回分页总条数
	 */
	protected long count;

	// 返回码
	private String code;

	// 返回描述
	private String message;

	// 默认构造方法
	public BaseResponse() {
	}

	public BaseResponse(String code, String message) {
		this.code = code;
		this.message = message;
	}

	@SuppressWarnings("rawtypes")
	public static BaseResponse newSuccess() {
		BaseResponse BaseResponse = new BaseResponse(CODE_SUCCESS, MESSAGE_SUCCESS);
		return BaseResponse;
	}

	/**
	 * 创建一个成功返回
	 */
	public static BaseResponse newSuccess(String code, String message) {
		BaseResponse BaseResponse = new BaseResponse(code, message);
		return BaseResponse;
	}

	/**
	 * 创建一个成功返回（可以指定返回数据）
	 */
	public static <T> BaseResponse<T> newSuccess(T data) {
		BaseResponse<T> baseResponse = new BaseResponse<T>(CODE_SUCCESS, MESSAGE_SUCCESS);
		baseResponse.setData(data);
		return baseResponse;
	}

	/**
	 * 创建一个带有分页形式成功返回（可以指定返回数据）
	 */
	public static <T> BaseResponse<T> newSuccess(T data, long count) {
		BaseResponse<T> baseResponse = new BaseResponse<T>(CODE_SUCCESS, MESSAGE_SUCCESS);
		baseResponse.setData(data);
		baseResponse.setCount(count);
		return baseResponse;
	}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
	public static BaseResponse newFailure() {
		BaseResponse BaseResponse = new BaseResponse(CODE_FAILURE, MESSAGE_FAILURE);
		return BaseResponse;
	}

	/**
	 * 创建一个失败返回
	 */
	public static BaseResponse newFailure(String code, String message) {
		BaseResponse BaseResponse = new BaseResponse(code, message);
		return BaseResponse;
	}

	/**
	 * 创建一个失败返回（不带返回数据）
	 */
	public static <T> BaseResponse<T> newFailure(T data) {
		BaseResponse<T> BaseResponse = new BaseResponse<T>(CODE_FAILURE, MESSAGE_FAILURE);
		BaseResponse.setData(data);
		return BaseResponse;
	}
	
	/**
	 * 创建一个失败分页条数返回（不带返回数据）
	 */
	public static <T> BaseResponse<T> newFailure(T data, long count) {
		BaseResponse<T> BaseResponse = new BaseResponse<T>(CODE_FAILURE, MESSAGE_FAILURE);
		BaseResponse.setData(data);
		BaseResponse.setCount(count);
		return BaseResponse;
	}

}
