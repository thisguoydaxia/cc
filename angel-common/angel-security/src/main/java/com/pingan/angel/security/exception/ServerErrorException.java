package com.pingan.angel.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.pingan.angel.security.component.AngelAuth2ExceptionSerializer;
import org.springframework.http.HttpStatus;

/**
 * @author lengleng
 * @date 2019/2/1
 */
@JsonSerialize(using = AngelAuth2ExceptionSerializer.class)
@SuppressWarnings("serial")
public class ServerErrorException extends AngelAuth2Exception {

	public ServerErrorException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "server_error";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.INTERNAL_SERVER_ERROR.value();
	}

}
