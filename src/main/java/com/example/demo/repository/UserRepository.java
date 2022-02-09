package com.example.demo.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	
	@Query(value = "CALL validateSignIn (:email,:password);", nativeQuery = true)
	public User siginIn (@Param("email") String  email,@Param("password") int  password);
}
