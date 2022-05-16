package com.curriculo.curriculo.albert.repository;

import com.curriculo.curriculo.albert.model.Information;

import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAOInformation extends JpaRepository <Information, Long> {

}