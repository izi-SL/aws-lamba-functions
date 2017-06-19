package com.isuru.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

class PrintFunction implements RequestHandler<String, String>{

	public String handleRequest(String input, Context context) {
		return input.toUpperCase();
	}
  
}
