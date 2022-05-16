package com.curriculo.curriculo.albert.controller;

import com.curriculo.curriculo.albert.model.About;
import com.curriculo.curriculo.albert.repository.DAOAbout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class ControllerAbout {

        @Autowired
        DAOAbout daoAbout;

        @RequestMapping(value = "/about", method = RequestMethod.GET)
        public List<About> Get(){
            return daoAbout.findAll();
        }

        @RequestMapping(value = "/about/{aboutId}")
        public ResponseEntity<About> getAboutById(@PathVariable("aboutId") long aboutId){

            Optional<About> about = daoAbout.findById(aboutId);

            if(about.isPresent()){
                return new ResponseEntity<>(about.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

        }

        @RequestMapping(value = "/about", method = RequestMethod.POST, produces = "application/json")
        public About Post(@Validated @RequestBody About about) {
             return daoAbout.save(about);
        }

        @RequestMapping(value = "/about/{aboutId}", method = RequestMethod.PUT)
        public ResponseEntity<About> PUT(@PathVariable(value = "aboutId") long aboutId, @Valid @RequestBody About newAbout) {

                Optional<About> aboutOld = daoAbout.findById(aboutId);
                if(aboutOld.isPresent()) {

                    About informationAboutSelf = aboutOld.get();
                    informationAboutSelf.setAboutSelf(informationAboutSelf.getAboutSelf());
                    daoAbout.save(informationAboutSelf);

                    return new ResponseEntity<>(HttpStatus.OK);

                } else {
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }

        }

}
