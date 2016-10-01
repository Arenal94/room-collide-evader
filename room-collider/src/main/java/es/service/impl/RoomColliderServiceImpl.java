package es.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import es.service.RoomColliderService;

@Service
public class RoomColliderServiceImpl implements RoomColliderService {

	public String hello() {
		String query= "http://services.groupkt.com/country/get/all";
		//This rest web service will return a list countries in JSON format
		String camp=new RestTemplate().getForObject(query, String.class);
		return camp;
	}

}
