package br.com.erizoka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.erizoka.entity.User;
import br.com.erizoka.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User findByEmail(String email) {
		return userRepository.findUserByEmail(email).get();
	}
	
	public User save(User user) {
		return userRepository.save(user);
	}
}
