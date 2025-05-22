package co.kr.boot.jpa.user.service;

import co.kr.boot.jpa.user.User;
import co.kr.boot.jpa.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        user.setId(null);  // 혹시 id가 넘어온다면 무시하고 새로 생성하도록 null 처리
        return userRepository.save(user);
    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void removeUser(User user) {
        userRepository.delete(user);
    }
}
