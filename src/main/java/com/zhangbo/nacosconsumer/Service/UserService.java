package com.zhangbo.nacosconsumer.Service;

import com.zhangbo.nacosconsumer.jpa.entity.User;
import com.zhangbo.nacosconsumer.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User queryById(String id){
        Optional<User> repository = userRepository.findById(String.valueOf(id));
        if(repository.isPresent()){
            return repository.get();
        }
        return null;
    }
}
