package com.gek.ptime.server.persistance.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Project {
	// default serialVersionUID
	private static final long serialVersionUID = 1L;

	// default constructor
    public Project() {
    	super();
    }
	// column names
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="project_seq")
	@SequenceGenerator(name="project_seq", sequenceName="project_seq", allocationSize=1)

	private Long id;

	@NotNull
	@Size(min=1, max=128)
	private String title;


	@Size(min=1, max=256)
	private String subTitle;

	@NotNull
	@Size(min=1, max=128)
	private String company;
	
	@NotNull
	@Size(min=1, max=10)
	private String colorCode;

	@NotNull
	private int priority;
	
	@NotNull
	private boolean active;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColorCode() {
		return colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}