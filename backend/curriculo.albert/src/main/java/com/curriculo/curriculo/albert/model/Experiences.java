package com.curriculo.curriculo.albert.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiences {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long experiencesId;
        @Column(name = "jobs")
        private String[] jobs;
        @Column(name = "courses")
        private String[] courses;
        @Column(name = "others")
        private String[] others;

        public Experiences(){
            super();
        }

        public Experiences(long experiencesId, String[] jobs, String[] courses, String[] others) {
            this.experiencesId = experiencesId;
            this.jobs = jobs;
            this.courses = courses;
            this.others = others;
        }

        public long getExperiencesId() {
            return experiencesId;
        }

        public void setExperiencesId(long experiencesId) {
            this.experiencesId = experiencesId;
        }

        public String[] getJobs() {
            return jobs;
        }

        public void setJobs(String[] jobs) {
            this.jobs = jobs;
        }

        public String[] getCourses() {
            return courses;
        }

        public void setCourses(String[] courses) {
            this.courses = courses;
        }

        public String[] getOthers() {
            return others;
        }

        public void setOthers(String[] others) {
            this.others = others;
        }

}
