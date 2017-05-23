package com.java.springbatch;

import org.joda.time.DateTime;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class PatientJobListner  implements JobExecutionListener{
	
	
	private DateTime startTime, stopTime;

	
			
	public void beforeJob(JobExecution jE) {
		startTime = new DateTime();
		System.out.println("ExamResult Job starts at :"+startTime);
		}
	
	
	
	public void afterJob(JobExecution jE) {
		stopTime = new DateTime();
		System.out.println("ExamResult Job stops at :"+stopTime);
		System.out.println("Total time take in millis :"+getTimeInMillis(startTime , stopTime));
		
		if(jE.getStatus() == BatchStatus.COMPLETED){
			System.out.println("patient record converted successfully");
			
		
		}else if(jE.getStatus() == BatchStatus.FAILED){
			System.out.println("patient record failed to convert with following exceptions ");
		}
	}

		private long getTimeInMillis(DateTime start, DateTime stop){
			return stop.getMillis() - start.getMillis();
		}
		
}
