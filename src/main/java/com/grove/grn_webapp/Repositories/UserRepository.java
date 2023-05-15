package com.grove.grn_webapp.Repositories;

import com.grove.grn_webapp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    List<User> findUserByLastName(String surname);
}
