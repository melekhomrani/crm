package tn.esprit.crm.repositories;

import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.crm.models.User;
import tn.esprit.crm.models.UserRole;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
    Optional<User> findByRole(UserRole role);
    Optional<User> findByEmailAndRole(@NonNull String email, UserRole role);
}