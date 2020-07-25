package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="project")
public class project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="detalis")
	private String details;
	
	private boolean is_archive;
	

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

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public boolean isIs_archive() {
		return is_archive;
	}

	public void setIs_archive(boolean is_archive) {
		this.is_archive = is_archive;
	}

	public project(long id, String name, String details, boolean is_archive) {
		super();
		this.id = id;
		this.name = name;
		this.details = details;
		this.is_archive = is_archive;
	}
}
