package com.sourcing.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.sourcing.models.AmazonInput;

@Repository
public interface AmazonInputRepo extends MongoRepository<AmazonInput, String> {
	
	@Query(value = "{ItemName:'?0'}")
	List<AmazonInput> findByItemName(String name);
	
	@Query(value = "{'Status': ?0}")
	List<AmazonInput> findByStatus(int status);

}


















