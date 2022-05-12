package com.curriculo.curriculo.albert.controller;

import com.curriculo.curriculo.albert.model.Experiences;
import com.curriculo.curriculo.albert.repository.DAOExperiences;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerExperiences {

        @Autowired
        DAOExperiences daoExperiences;

        @RequestMapping(value = "/experiences", method = RequestMethod.GET)
        public List<Experiences> Get(){
                return daoExperiences.findAll();
        }

        @RequestMapping(value = "/experiences/{experiencesId}")
        public ResponseEntity<Experiences> getExperiencesById(@PathVariable("experiencesId") long experiencesId){

                Optional<Experiences> experiences = daoExperiences.findById(experiencesId);

                if(experiences.isPresent()){
                        return new ResponseEntity<>(experiences.get(), HttpStatus.OK);
                } else {
                        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }

        }

        @RequestMapping(value = "/experiences", method = RequestMethod.POST, produces = "application/json")
        public Experiences Post(@Validated @RequestBody Experiences experiences){
                return daoExperiences.save(experiences);
        }

}
