package com.isuru.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.isuru.domain.Announcement;
import com.isuru.domain.Student;

public class PrintObjectFunction implements RequestHandler<Student, Announcement>{

	public Announcement handleRequest(Student input, Context context) {
		Announcement announcement = new Announcement("This is a test message", "Warning", input);
		return announcement;
	}

}
