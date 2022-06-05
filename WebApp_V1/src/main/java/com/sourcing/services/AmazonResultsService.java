package com.sourcing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.aggregation.TypedAggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import com.sourcing.models.AmazonResults;
import com.sourcing.operations.MongoOperations;

@Service
//@RequiredArgsConstructor  //Replaced @Autowired
public class AmazonResultsService { 
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public List<AmazonResults> getResults(String key, String value) {
		
//	    String query = "{$match: {'" + key + "': '" + value + "'}}";
//
//	    TypedAggregation<AmazonResults> aggregation = Aggregation.newAggregation(
//	    		AmazonResults.class,
//	        new MongoOperations(query)
//	    );
//
//	    AggregationResults<AmazonResults> results =
//	        mongoTemplate.aggregate(aggregation, AmazonResults.class);
//	    System.out.println(results.getMappedResults());
//		return results.getMappedResults();
		
		MatchOperation matchStage = Aggregation.match(new Criteria(key).is(value));
		        
		Aggregation aggregation = Aggregation.newAggregation(matchStage);

		AggregationResults<AmazonResults> output 
		  = mongoTemplate.aggregate(aggregation, "Crawling_Results", AmazonResults.class);
		
		System.out.println(output);
		
		return output.getMappedResults();
	}
}








