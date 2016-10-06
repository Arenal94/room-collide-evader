package es.controller.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.controller.RoomColliderController;
import es.model.CoordinatesData;
import es.repository.RoomColliderRepository;

@RestController
public class RoomColliderControllerImpl implements RoomColliderController {
	@Autowired
	private RoomColliderRepository repository;

	public RoomColliderControllerImpl(RoomColliderRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	@RequestMapping(path = "/save", method = RequestMethod.GET)
	public void save() {
		Integer max = 20;
		Integer min = 0;
		Date fechaActual = new Date();
		this.repository.save(new CoordinatesData(Math.random() * (max - min) + min, Math.random() * (max - min) + min,
				Math.random() * (max - min) + min, Math.random() * (max - min) + min, fechaActual));
		System.out.println("Añadidas coordenadas");
	}

	@Override
	@RequestMapping(path = "/delete", method = RequestMethod.GET)
	public void delete() {
		this.repository.deleteAll();
		
		System.out.println("borrradas coordenadas");

	}

	@Override
	@RequestMapping(path = "/findAll", method = RequestMethod.GET)
	public List<CoordinatesData> findAll() {
		System.out.println("Devueltas coordenadas");
		return this.repository.findAll();
		
	}

}
