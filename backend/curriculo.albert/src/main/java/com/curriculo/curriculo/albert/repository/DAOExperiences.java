package com.curriculo.curriculo.albert.repository;

import com.curriculo.curriculo.albert.model.Experiences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAOExperiences extends JpaRepository <Experiences, Long> {
}
