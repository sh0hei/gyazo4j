package com.github.sh0hei.gyazo4j.model;

import java.sql.Timestamp;

import org.codehaus.jackson.annotate.JsonProperty;

public class Image {
	@JsonProperty("image_id")
	private String imageId;
	@JsonProperty("permalink_url")
	private String permalinkUrl;
	@JsonProperty("thumb_url")
	private String thumbUrl;
	@JsonProperty("url")
	private String url;
	@JsonProperty("type")
	private String type;
	@JsonProperty("star")
	private String star;
	@JsonProperty("created_at")
	private Timestamp createdAt;
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getPermalinkUrl() {
		return permalinkUrl;
	}
	public void setPermalinkUrl(String permalinkUrl) {
		this.permalinkUrl = permalinkUrl;
	}
	public String getThumbUrl() {
		return thumbUrl;
	}
	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStar() {
		return star;
	}
	public void setStar(String star) {
		this.star = star;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
}
