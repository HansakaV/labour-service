package com.eca.busdepot.labourservice.repository;

import com.eca.busdepot.labourservice.model.Labour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabourRepository extends JpaRepository<Labour, Long> {
}
