package com.curriculo.curriculo.albert.repository;

import com.curriculo.curriculo.albert.model.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAOAbout extends JpaRepository <About, Long> {
}
