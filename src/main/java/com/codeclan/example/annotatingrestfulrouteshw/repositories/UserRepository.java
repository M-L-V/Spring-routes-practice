package com.codeclan.example.annotatingrestfulrouteshw.repositories;

import com.codeclan.example.annotatingrestfulrouteshw.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
}
