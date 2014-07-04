package com.otpp.workflow.dataaccessor;

import org.camunda.bpm.engine.impl.persistence.entity.ExecutionEntity;

/**
 * Hello world!
 * 
 */
public class ProcessDataAccessor {
	ExecutionEntity execution = new ExecutionEntity();

	public Boolean getRecordsReview() {
		// if (execution.getVariable("RecordsReview") != null) {
		String key = ((String) execution.getVariable("RecordsReview"));
		if (key.equalsIgnoreCase("Y")) {
			return true;
		} else if (key.equalsIgnoreCase("N")) {
			return false;
		} else {
			return false;
		}
		// }
	}
}
