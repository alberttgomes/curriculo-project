package com.curriculo.curriculo.albert;

import com.curriculo.curriculo.albert.model.About;
import com.curriculo.curriculo.albert.model.Experiences;
import com.curriculo.curriculo.albert.model.Information;
import com.curriculo.curriculo.albert.model.Skills;
import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCurriculo extends TestCase {

    About about = new About();
    Experiences experiences = new Experiences();
    Information information = new Information();
    Skills skills = new Skills();

    @BeforeEach
    public void InitializerTest() {
        System.out.println("Initializer tests");
    }

    @Test
    public void AboutTest(){

        String aboutSelf = "My name is Albert, i have 26 years. Student of Systems of Internet at University Catolica of Pernambuco";

        about.setAboutSelf(aboutSelf);

        String actual = aboutSelf;
        String expected = about.getAboutSelf();

        assertEquals(expected, actual);
    
    }

    @Test
    public void ExperiencesTest(){

        String[] jobs = {"software engineer intern", "developer jr"};
        String[] tracks = {"work at function of the application, support and infra", "developer systems with react and java"};
        String[] time = {"init 20/01/2017, end 30/12/2019", "init 01/01/2020, job actual"};
        String[] others = {"project initializer scientific area IA", "Resident Software at Porto Digital"};

        experiences.setJobs(jobs);
        experiences.setTracks(tracks);
        experiences.setTime(time);
        experiences.setOthers(others);

        String[] actual = jobs;
        String[] actual1 = tracks;
        String[] actual2 = time;
        String[] actual3 = others;

        String[] expected = experiences.getJobs();
        String[] expected1 = experiences.getTracks();
        String[] expected2 = experiences.getTime();
        String[] expected3 = experiences.getOthers();


        assertEquals(actual, expected);
        assertEquals(actual1, expected1);
        assertEquals(actual2, expected2);
        assertEquals(actual3, expected3);

    }

    @Test
    public void SkillsTest(){

            String[] soft = {"agile"};
            String[] hard = {"java"};

            skills.setSoftSkills(soft);
            skills.setHardSkills(hard);

            String[] actual = soft;
            String[] actual1 = hard;

            String[] expected = skills.getSoftSkills();
            String[] expected1 = skills.getHardSkills();

            assertArrayEquals(actual, expected, "This is ok");
            assertArrayEquals(actual1, expected1, "This is to ok");

    }

}
