package com.github.sh0hei.gyazo4j;

import java.io.File;
import java.util.Map;

import com.github.sh0hei.gyazo4j.model.Image;
import com.github.sh0hei.gyazo4j.model.ImagesList;

public class GyazoClient {
	
	private static final String API_HOST = "api.gyazo.com";
	
	private static final String UPLOAD_HOST = "upload.gyazo.com";
	
	public GyazoClient(String accessToken) {
		
	}
	
	public ImagesList list(Integer page, Integer parPage) {
		return null;
	}
	
	public Image upload(File image) {
		return null;
	}
	
	public Map<String, String> delete() {
		return null;
	}
	
	private String makeUrl(String host, String path) {
		return null;
	}
	
	private String getMimeType(File file) {
		return null;
	}
}
