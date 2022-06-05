package com.sourcing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.TypedAggregation;
import org.springframework.stereotype.Service;

import com.sourcing.models.AmazonSummaryModel;
import com.sourcing.operations.MongoOperations;


@Service
public class SummaryService {
	
    @Autowired
    MongoTemplate mongoTemplate;

	public List<AmazonSummaryModel> getSummarry(){

	    String query = "{"
				+ "                $group: {"
				+ "                    '_id': {"
				+ "                        Status: '$Status',"
				+ "                        SourceName: '$SourceName'"
				+ "                    },"
				+ "                    count: {"
				+ "                        $sum: 1"
				+ "                    }"
				+ "                }"
				+ "            }, {"
				+ "					$project: {"
				+ "                    count: 1"
				+ "                    Status: '$_id.Status',"
				+ "                    SourceName: '$_id.SourceName',"
				+ "                    _id: 1,"
				+ "                    "
				+ "                }"
				+ "            }";

	    TypedAggregation<AmazonSummaryModel> aggregation = Aggregation.newAggregation(
	    		AmazonSummaryModel.class,
	        new MongoOperations(query)
	    );

	    AggregationResults<AmazonSummaryModel> results =
	        mongoTemplate.aggregate(aggregation, AmazonSummaryModel.class);
	    System.out.println(results.getMappedResults());
		return results.getMappedResults();
	}

}






