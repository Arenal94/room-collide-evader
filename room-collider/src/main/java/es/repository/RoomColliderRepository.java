package es.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import es.model.CoordinatesData;

public interface RoomColliderRepository extends MongoRepository<CoordinatesData, String> {
	
	
	
	

}
