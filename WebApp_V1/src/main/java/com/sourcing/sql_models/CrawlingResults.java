package com.sourcing.sql_models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CrawlingResults")
//@Data
//@NoArgsConstructor
public class CrawlingResults {

	public CrawlingResults() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "source_name", columnDefinition = "TEXT", length = 255)
	private String source_name;
	@Column(name = "source_id", columnDefinition = "TEXT", length = 255)
	private String source_id;
	@Column(name = "item", columnDefinition = "TEXT", length = 255)
	private String item;
	@Column(name = "name", columnDefinition = "TEXT", length = 255)
	private String name;
	@Column(name = "price", columnDefinition = "TEXT", length = 255)
	private String price;
	@Column(name = "condition", columnDefinition = "TEXT", length = 255)
	private String condition;
	@Column(name = "rating", columnDefinition = "TEXT", length = 255)
	private String rating;
	@Column(name = "image_src", columnDefinition = "TEXT", length = 2000)
	private String image_src;
	@Column(name = "itemurl", columnDefinition = "TEXT", length = 2000)
	private String itemurl;
	@Column(name = "feature_name", columnDefinition = "TEXT", length = 255)
	private String feature_name;
	@Column(name = "feature_value", columnDefinition = "TEXT", length = 255)
	private String feature_value;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSource_name() {
		return source_name;
	}
	public void setSource_name(String source_name) {
		this.source_name = source_name;
	}
	public String getSource_id() {
		return source_id;
	}
	public void setSource_id(String source_id) {
		this.source_id = source_id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getImage_src() {
		return image_src;
	}
	public void setImage_src(String image_src) {
		this.image_src = image_src;
	}
	public String getItemurl() {
		return itemurl;
	}
	public void setItemurl(String itemurl) {
		this.itemurl = itemurl;
	}
	public String getFeature_name() {
		return feature_name;
	}
	public void setFeature_name(String feature_name) {
		this.feature_name = feature_name;
	}
	public String getFeature_value() {
		return feature_value;
	}
	public void setFeature_value(String feature_value) {
		this.feature_value = feature_value;
	}
	

}






