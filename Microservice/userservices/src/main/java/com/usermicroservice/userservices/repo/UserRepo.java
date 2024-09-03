package com.usermicroservice.userservices.repo;


import com.usermicroservice.userservices.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserModel, String> {
    //create custom crud method
}
