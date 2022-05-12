package com.curriculo.curriculo.albert;

import com.curriculo.curriculo.albert.model.About;
import com.curriculo.curriculo.albert.model.Experiences;
import com.curriculo.curriculo.albert.model.Information;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCurriculo {

    About about = new About();
    Experiences experiences = new Experiences();
    Information information = new Information();

    @BeforeEach
    public void AboutMocke(String setAboutSelf) {
         this.about.setAboutSelf(setAboutSelf);
    }

    @BeforeEach
    public void ExperiencesMocke(Experiences experiences){
         this.experiences = experiences;
    }

    @BeforeEach
    public void InformationMocke(Information information){
         this.information = information;
    }

    @Test
    public void AboutTest(){

        AboutMocke("My name is Albert, i have 26 years. Student of Systems of Internet at University Catolica of Pernambuco");

        String actual = about.getAboutSelf();
        String expected = about.getAboutSelf();

        assertEquals(expected, actual);
    
    }

    @Test
    public void ExperiencesTest(){

        ExperiencesMocke(experiences);

        String[] course = {"engineer of computer", "systems of internet"};
        String[] jobs = {"software intern", "developer jr"};
        String[] others = {"project initializer scientific area IA", "Resident Software at Porto Digital"};

        experiences.setCourses(course);
        experiences.setJobs(jobs);
        experiences.setOthers(others);

        String[] actual = experiences.getCourses();
        String[] actual1 = experiences.getJobs();
        String[] actual2 = experiences.getOthers();

        String[] expected = experiences.getCourses();
        String[] expected1 = experiences.getJobs();
        String[] expected2 = experiences.getOthers();

        assertEquals(actual, expected);
        assertEquals(actual1, expected1);
        assertEquals(actual2, expected2);

    }

}
