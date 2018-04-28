package com.resolvebug.app.common;

import com.resolvebug.app.beans.ResponseBean;

public class Utilities {

	public static ResponseBean createResponseEntity(String statusCode, String statusMessage, Object data) {
		// ResponseEntity<Object> response;
		/**
		 * uncomment following lines when you need header related information.
		 */
		// HttpHeaders headers;
		// headers = new HttpHeaders();
		// headers.add(Constants.HEADER_NAME_CONTENT_TYPE,
		// Constants.HEADER_VALUE_CONTENT_TYPE_JSON);
		// headers.set(Constants.HEADER_STATUS_MSG, statusMessage);
		// headers.add(Constants.HEADER_STATUS_CODE, statusCode);
		ResponseBean responseBean = new ResponseBean();
		responseBean.setStatusCode(statusCode);
		responseBean.setStatusMsg(statusMessage);
		responseBean.setData(data);
		// response = new ResponseEntity<Object>(responseBean, headers, HttpStatus.OK);
		// response = new ResponseEntity<Object>(responseBean, HttpStatus.OK);
		return responseBean;
	}

}
