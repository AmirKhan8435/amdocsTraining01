package com.training.amdocs.dao;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.amdocs.pojo.CentrePOJO;
import com.training.amdocs.repository.CentreRepo;


@Service
public class CentreDAO 
{
	@Autowired
	CentreRepo centreRepo;
	
	public List<CentrePOJO> getAllCentres()
	{
		CentrePOJO[] c_array = new CentrePOJO[] {new CentrePOJO(1, "Bharati", "Katraj", 30),
												new CentrePOJO(2, "Deenanath", "Deccan", 145),
												new CentrePOJO(3, "Mission", "Wai", 15)}; 
		List<CentrePOJO> list = Arrays.asList(c_array);
		
		return list;
	}
	
	public CentrePOJO  getAllCentres(int pin)
	{
		CentrePOJO[] c_array = new CentrePOJO[] {new CentrePOJO(1, "Bharati", "Katraj", 30),
												new CentrePOJO(2, "Deenanath", "Deccan", 145),
												new CentrePOJO(3, "Mission", "Wai", 15)}; 
		List<CentrePOJO> list = Arrays.asList(c_array);
		
		CentrePOJO found_centre = list.get(pin-1);
		
		return found_centre;
	}
	
	public void addCentre(CentrePOJO newCentre)
	{
		
		
	}
	
}
