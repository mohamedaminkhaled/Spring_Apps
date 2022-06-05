package com.sourcing.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document("Amazon")
@Data
@NoArgsConstructor
public class AmazonInput {
	
	@Id
	@Field("_id")
	private ObjectId id;
	@Field("ItemName")
	private String itemName;
	@Field("ItemID")
	private int itemId;
	@Field("SourceName")
	private String sourceName;
	@Field("SourceID")
	private int sourceId;
	@Field("SearchURL")
	private String searchUrl;
	@Field("Status")
	private int status;
	@Field("StatusCode")
	private int statusCode;
	@Field("Exception")
	private String exception;

}
