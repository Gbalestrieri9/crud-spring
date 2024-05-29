package com.angularspring.crudspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Setter;

@Setter
@Data
@Entity
public class Course {

	@Id
	@GeneratedValue
	@JsonProperty("_id")
	private long id;
	
	@Column(length = 200, nullable = false)
	private String name;
	
	@Column(length = 200, nullable = false)
	private String category;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
