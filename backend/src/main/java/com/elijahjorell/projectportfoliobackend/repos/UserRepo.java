package com.elijahjorell.projectportfoliobackend.repos;

import com.elijahjorell.projectportfoliobackend.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

    Optional<User> findFirstByUsernameIgnoreCase(String name);

}
