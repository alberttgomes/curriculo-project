package com.curriculo.curriculo.albert.controller;

import java.util.List;
import java.util.Optional;

import com.curriculo.curriculo.albert.model.Information;
import com.curriculo.curriculo.albert.repository.DAOInformation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerInformation {
    
        @Autowired
        DAOInformation daoInformation;

        @RequestMapping(value = "/information", method = RequestMethod.GET)
        public List<Information> Get() {
               return daoInformation.findAll();
        }

        @RequestMapping(value = "/information/{informationId}")
        public ResponseEntity<Information> getInformationById(@PathVariable("informationId") long informationId){

                Optional<Information> information = daoInformation.findById(informationId);

                if(information.isPresent()){
                        return new ResponseEntity<>(information.get(), HttpStatus.OK);
                } else {
                        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }

        }

        @RequestMapping(value = "/information", method = RequestMethod.POST, produces = "application/json")
        public Information Post(@Validated @RequestBody Information information){
                return daoInformation.save(information);
        }

}
