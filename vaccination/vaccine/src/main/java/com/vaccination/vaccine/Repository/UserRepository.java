package com.vaccination.vaccine.Repository;

import com.vaccination.vaccine.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails, Long> {

    
}