package com.curriculo.curriculo.albert.controller;

import java.util.List;

import com.curriculo.curriculo.albert.model.Information;
import com.curriculo.curriculo.albert.repository.DAOInformation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerInformation {
    
    @Autowired
    DAOInformation daoInformation;

    @RequestMapping(value = "/information", method = RequestMethod.GET)
    public List<Information> Get() {
        return daoInformation.findAll();
    }

}
