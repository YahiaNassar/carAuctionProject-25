package com.example.caraucbackend.repos;

import com.example.caraucbackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepo extends JpaRepository<User, String> {

    User findUserByUsernameIsAndPasswordIs(String username, String password);

    User findUserByUsernameIs(String userName);

    List<User> findAll();

}
