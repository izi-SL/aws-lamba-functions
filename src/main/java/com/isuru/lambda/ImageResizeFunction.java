package com.isuru.lambda;

import java.util.List;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.event.S3EventNotification.S3EventNotificationRecord;

public class ImageResizeFunction implements RequestHandler<S3Event, List<S3EventNotificationRecord>>{

	public List<S3EventNotificationRecord> handleRequest(S3Event input, Context context) {
		return input.getRecords();
	}

}
