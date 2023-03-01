package tn.esprit.crm.Services.Interfaces;

import tn.esprit.crm.models.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<User> findAll();
    Optional<User> findById(Long id);
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
    User save(User user);
    User update(User user);
    void delete(Long id);

}
