package com.example.restskeleton.models;

import java.util.List;

/**
 * Responsible to represents a product.
 * 
 * @author madureira
 *
 */
public class Product {

	private Integer id;
	private String name;
	private String description;
	private List<String> keywords;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

}
