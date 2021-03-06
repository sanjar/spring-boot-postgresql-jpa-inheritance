package com.example.postgresdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.postgresdemo.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long>{
	Pet findByAnimalId(Long animalId);

}
