package es.controller;

import java.util.List;

import es.model.CoordinatesData;

public interface RoomColliderController {
	
	void save();
	void delete();
	List<CoordinatesData> findAll();

}
