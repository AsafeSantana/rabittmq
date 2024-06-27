package com.ms.user.services;

import com.ms.user.models.UserModel;
import com.ms.user.producers.UserProducer;
import com.ms.user.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    public UserService(UserProducer userProducer, UserRepository userRepository) {
        this.userProducer = userProducer;
        this.userRepository = userRepository;
    }

    final UserProducer userProducer;


    final UserRepository userRepository;

@Transactional
    public UserModel save(UserModel userModel){
    userModel= userRepository.save(userModel);
    userProducer.publishMessageEmail(userModel);
    return userModel;
}


}
