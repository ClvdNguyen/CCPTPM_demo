package com.t3h.day1.common;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result<T> {

	private int code;
	private String message;
	private Object T;
	
	
	public static Result createResult(Object obj, int code, String msg) {
		return new Result<>(code, msg, obj);
	}
	
}
