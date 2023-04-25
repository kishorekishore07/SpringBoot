package com.example.ProjectRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.ProjectRest.dao.MobilePhoneRepository;
import com.example.ProjectRest.model.MobilePhone;



@Service
	public class MobilePhoneService {
	@Autowired
	MobilePhoneRepository mr;
	
	public List<MobilePhone> getAllDetails(){
		 
		return mr.findAll();
	}
	public MobilePhone saveDetails(@RequestBody MobilePhone x) {
		
		return mr.save(x);
	}
	
	public MobilePhone saveupdate(@RequestBody MobilePhone y) {
		 
		return mr.save(y);
	}
	
	public void deleteDetails(@PathVariable String a) {
		
		mr.deleteById(a);
	}
 
	

}