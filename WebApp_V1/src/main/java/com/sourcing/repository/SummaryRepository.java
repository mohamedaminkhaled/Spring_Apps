package com.sourcing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sourcing.models.AmazonSummaryModel;

@Repository
public interface SummaryRepository extends MongoRepository<AmazonSummaryModel, String> {

}
