package com.sourcing.operations;

import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.aggregation.AggregationOperationContext;

public class SummarryRepoitrfutydru implements AggregationOperation{
	
	  private String jsonOperation;

	  public SummarryRepoitrfutydru(String jsonOperation) {
	    this.jsonOperation = jsonOperation;
	  }

	@Override
	  public org.bson.Document toDocument(AggregationOperationContext aggregationOperationContext) {
	    return aggregationOperationContext.getMappedObject(org.bson.Document.parse(jsonOperation));
	  }

}
