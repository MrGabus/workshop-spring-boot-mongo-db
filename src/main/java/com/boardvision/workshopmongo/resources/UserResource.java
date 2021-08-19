package com.boardvision.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boardvision.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User maria = new User("1", "Maria", "maria@gmail.com");
		User lucas = new User("2", "Lucas", "lucas@gmail.com");
		User luras = new User("3", "Luras", "luras@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, lucas, luras));
		
		return ResponseEntity.ok().body(list);
	}
}
