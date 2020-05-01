package com.example.postgresdemo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.model.Pet;
import com.example.postgresdemo.model.Question;
import com.example.postgresdemo.model.Wild;
import com.example.postgresdemo.repository.PetRepository;
import com.example.postgresdemo.repository.WildRepository;

@RestController
public class AnimalController {
	
	@Autowired
	private PetRepository petRepo;
	@Autowired
	private WildRepository wildRepo;
	
	
	@GetMapping("/pets")
    public Page<Pet> getPetAnimals(Pageable pageable) {
        return petRepo.findAll(pageable);
    }
	
	@GetMapping("/wilds")
    public Page<Wild> getWildAnimals(Pageable pageable) {
        return wildRepo.findAll(pageable);
    }
	
	@PostMapping("/pets")
    public Pet createPetAnimal(@Valid @RequestBody Pet pet) {
        return petRepo.save(pet);
    }
	
	@PostMapping("/wild")
    public Wild createWildAnimal(@Valid @RequestBody Wild wild) {
        return wildRepo.save(wild);
    }

}
