package es;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication

public class RoomColliderInstancia {

    public static void main(String[] args) throws Exception {
    	
        SpringApplication.run(RoomColliderInstancia.class, args);
    }

	public RoomColliderInstancia() {
		super();
	}

}