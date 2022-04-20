package com.uppgift.vning.sahraBile.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personRepository extends JpaRepository <PersonModel,Long> {
}
