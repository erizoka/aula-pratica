package br.com.erizoka.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erizoka.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findUserByEmail(String email);
}
