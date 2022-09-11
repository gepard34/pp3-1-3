package ru.kata.spring.boot_security.demo.dao;

import org.springframework.security.core.userdetails.UserDetails;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {
    List<User> showUsers();

    User showById(long id);

    void saveUser(User user);

    void createUser(User user);

    void update(long id, User updatedUser);

    void delete(Long id);

    User findByUsername(String username);

}
