package com.example.postgresdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.postgresdemo.model.Wild;

@Repository
public interface WildRepository extends JpaRepository<Wild, Long>{

	Wild findByAnimalId(Long animalId);
}
