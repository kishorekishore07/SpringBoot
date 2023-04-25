package com.example.ProjectRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjectRest.model.MobilePhone;
import com.example.ProjectRest.service.MobilePhoneService;

@RestController
public class ProjectRestController {
    @Autowired
	MobilePhoneService ms;

    @GetMapping("/fetch")
	public List<MobilePhone> getAllDetails(){
		
		return ms.getAllDetails();
	}
	
	@PostMapping("/save")
	public MobilePhone saveAll(@RequestBody MobilePhone s) {
		return ms.saveDetails(s);
	}
	@PutMapping("/put")
	public MobilePhone saveupdate(@RequestBody MobilePhone r) {
		return ms.saveDetails(r);
	}
	@DeleteMapping("/delete/{z}")
	public String delete(@PathVariable String z) {
		ms.deleteDetails(z);
		return "Deleted";
	}
	

}