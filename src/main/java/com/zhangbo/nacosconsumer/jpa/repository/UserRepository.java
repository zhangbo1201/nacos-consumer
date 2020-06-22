package com.zhangbo.nacosconsumer.jpa.repository;
import com.zhangbo.nacosconsumer.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
