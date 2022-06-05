package com.sourcing.sql_repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sourcing.sql_models.CrawlingResults;

public interface CrawlingResultsRepo extends CrudRepository<CrawlingResults, Long>  {
	
	@Query(value = "SELECT * FROM crawling_results r WHERE r.item = ?1", nativeQuery = true)
	public List<CrawlingResults> findByItem(String item);
}
