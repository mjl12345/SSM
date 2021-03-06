package com.maiworld.api.vo;

import java.io.Serializable;

public class ResultVO<T> implements Serializable{
	
	private Integer code;
	
	private String msg;				//返回提示:成功。。。 失败。。。
	
	private T data;					//

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	

}
