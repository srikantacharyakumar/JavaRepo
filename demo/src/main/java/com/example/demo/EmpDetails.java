package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/springboot")
public class EmpDetails {
	
	private EmpDto empdto1;
	private EmpDto empdto2;
	
	@Autowired
	public void setEmpdto1(EmpDto empdto1) {
		this.empdto1 = empdto1;
	}
	@Autowired
	public void setEmpdto2(EmpDto empdto2) {
		this.empdto2 = empdto2;
	}
	@GetMapping(value="/empdtls", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<Integer,EmpDto> getEmpDetails() {
		empdto1.setId(1);
		empdto1.setName("Chinmay");
		empdto1.setAge(32);
		empdto1.setAddress("Miapur");
		empdto2.setId(2);
		empdto2.setName("Rantunga");
		empdto2.setAge(45);
		empdto2.setAddress("Srilanka");
		Map<Integer,EmpDto> map=new HashMap<>();
		map.put(1, empdto1);
		map.put(2, empdto2);
		return map;
	}
}
