package com.boardvision.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boardvision.workshopmongo.domain.User;
import com.boardvision.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public List<User> findlAll() {
		return repo.findAll();
	}
}