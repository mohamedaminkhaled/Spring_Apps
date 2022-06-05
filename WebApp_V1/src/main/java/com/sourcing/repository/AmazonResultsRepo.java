package com.sourcing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sourcing.models.AmazonResults;

@Repository
public interface AmazonResultsRepo extends MongoRepository<AmazonResults, String> {
	
}
