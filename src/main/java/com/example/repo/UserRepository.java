package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


import com.example.model.User;

@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User,Long>{
	//@Query(value="select * from User where userName=?1 and password=?2", nativeQuery=true)
	@Query("SELECT u from User u WHERE u.userName = ?1 and u.password=?2")
	List<User> login(String userName,String password);

}
