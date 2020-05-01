package com.example.postgresdemo.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="wild")
@PrimaryKeyJoinColumn(name = "wildId")
public class Wild extends Animal{
	
	private String name;
	private boolean isCarnivorous;
	
	public boolean isCarnivorous() {
		return isCarnivorous;
	}
	public void setCarnivorous(boolean isCarnivorous) {
		this.isCarnivorous = isCarnivorous;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
