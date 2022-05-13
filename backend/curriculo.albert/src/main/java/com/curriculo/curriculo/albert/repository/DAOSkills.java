package com.curriculo.curriculo.albert.repository;

import com.curriculo.curriculo.albert.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAOSkills extends JpaRepository <Skills, Long> {
}
