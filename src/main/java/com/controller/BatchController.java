package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Batch;

@RestController
public class BatchController {
	
	
	

	@PostMapping("/addBatch")
	public String addBatch(@RequestBody Batch batch) {
		return "a batch is added" + batch.getName() ;

	}
	
	

	@GetMapping("/getBatchList")
	public List<String> getListofBatch() {
		
		List<String> list = new ArrayList<String>();
		list.add("priya");
		list.add("riya");
		
		return list;
	}
	
	

	@GetMapping("/getBatchDetails/{id}") ///input
	public String getListofBatch1(
			@PathVariable(value = "id") String id, @RequestParam (value="name") String name) {
		//processing
		return "List of batch displayed " + id + " "+ name;
	}
	
	
	@PutMapping("/updateBatch")
	public String updateBatch() {
		return "Batch updated";
	}
	
	

	@DeleteMapping("/deleteBatch")
	public String deleteBatch() {
		return "Batch deleted";
	}

}
