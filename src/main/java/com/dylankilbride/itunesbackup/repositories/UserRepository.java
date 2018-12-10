package com.dylankilbride.itunesbackup.repositories;

import com.dylankilbride.itunesbackup.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByEmailAndPassword(String email, String password);
	boolean existsByEmail(String email);
}

