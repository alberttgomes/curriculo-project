package com.curriculo.curriculo.albert.controller;

import com.curriculo.curriculo.albert.model.Skills;
import com.curriculo.curriculo.albert.repository.DAOSkills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerSkills {

        @Autowired
        DAOSkills daoSkills;

        @RequestMapping(value = "/skills", method = RequestMethod.GET)
        public List<Skills> Get(){
            return daoSkills.findAll();
        }

        @RequestMapping(value = "/skills/{skillsId}")
        public ResponseEntity<Skills> getSkillsById(@PathVariable("skillsId") long skillsId){

            Optional<Skills> skills = daoSkills.findById(skillsId);

            if(skills.isPresent()){
                return new ResponseEntity<>(skills.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }

        @RequestMapping(value = "/skills", method = RequestMethod.POST, produces = "application/json")
        public Skills Post(@Validated @RequestBody Skills skills) {
            return daoSkills.save(skills);
        }

}
