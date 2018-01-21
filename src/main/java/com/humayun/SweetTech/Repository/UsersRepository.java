package com.humayun.SweetTech.Repository;


import com.humayun.SweetTech.Model.UserAuthenticationModel.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByName(String username);
}
