package com.example.postgresdemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "animal")
public class Animal {
    @Id
    private long animalId;
    private String species;
    
	public long getAnimalId() {
		return animalId;
	}
	public void setAnimalId(long animalId) {
		this.animalId = animalId;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
 
     
}
