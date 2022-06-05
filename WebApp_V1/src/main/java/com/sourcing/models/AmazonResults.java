package com.sourcing.models;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Crawling_Results")
@Data
@NoArgsConstructor
public class AmazonResults {
	
	@Id
	@Field("_id")
	private ObjectId id;
	@Field("SourceName")
	private String sourceName;
	@Field("SourceID")
	private int sourceId;
	@Field("Item")
	private String item;
	@Field("Name")
	private String name;
	@Field("Price")
	private String price;
	@Field("Condition")
	private String condition;
	@Field("Rating")
	private String rating;
	@Field("Image_src")
	private String imageSrc;
	@Field("Item_URL")
	private String itemURL;
	@Field("Features")
	private List<Object> features;
	

}











