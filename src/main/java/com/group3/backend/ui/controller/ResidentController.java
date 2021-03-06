package com.group3.backend.ui.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.group3.backend.service.ResidentService;
import com.group3.backend.ui.model.request.ResidentRequest;
import com.group3.backend.ui.model.response.ResidentResponse;

@RestController
@RequestMapping("resident")
public class ResidentController {
	
	@Autowired
	ResidentService residentService;
	
	//overwrites resident entity if it already exists(should we limit it to only create new?) - SK
	@PostMapping
	public ResidentResponse addResident(@RequestBody ResidentRequest residentRequest) {
		return residentService.createResident(residentRequest);
	}
	
	@PutMapping
	public ResidentResponse editResident(@RequestBody ResidentRequest residentRequest) {
		return residentService.editResident(residentRequest);
	}
	
	@DeleteMapping(produces="application/json")
	public Object deleteResident(@RequestParam long residentId) {
		return residentService.deleteResident(residentId);
	}
	
	@GetMapping(path="all")
    public ArrayList<ResidentResponse> getAllResidentsForHome(@RequestParam long careHomeId) {
        return residentService.getAllResidentsForHome(careHomeId);
    }
	
	@GetMapping
	public ResidentResponse getResident(@RequestParam long residentId) {
		return residentService.getResident(residentId);
	}
	
}