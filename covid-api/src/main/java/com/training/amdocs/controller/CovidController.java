package com.training.amdocs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.amdocs.dao.CentreDAO;
import com.training.amdocs.pojo.CentrePOJO;

@RestController
public class CovidController 
{
	@Autowired
	CentreDAO centreDao;
	
	
	@GetMapping("/allCentres")
	public List<CentrePOJO> getAllCentres()
	{
		return centreDao.getAllCentres();
	}
	
	@GetMapping("/allCentres/{pin}")
	public CentrePOJO getAllCentres(@PathVariable int pin)
	{
		return centreDao.getAllCentres(pin);
	}
	
	@PostMapping("/covidCenter")
	public String addCentre(@ModelAttribute CentrePOJO centre)
	{
		centreDao.addCentre(centre);
		
		return "Done Added";
	}
	
}
