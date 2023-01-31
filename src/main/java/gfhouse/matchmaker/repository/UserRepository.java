package gfhouse.matchmaker.repository;

import gfhouse.matchmaker.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findByUserId(String userId);
    public Optional<User> findByPassword(String password);
}
