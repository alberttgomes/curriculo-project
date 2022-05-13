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
        @Column(name = "time")
        private String[] time;
        @Column(name = "tracks")
        private String[] tracks;
        @Column(name = "others")
        private String[] others;

        public Experiences(){
            super();
        }

        public Experiences(long experiencesId, String[] jobs, String[] time, String[] tracks, String[] others) {
            this.experiencesId = experiencesId;
            this.jobs = jobs;
            this.time = time;
            this.tracks = tracks;
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

        public String[] getTime() {
            return time;
        }

        public void setTime(String[] time) {
            this.time = time;
        }

        public String[] getTracks() {
            return tracks;
        }

        public void setTracks(String[] tracks) {
            this.tracks = tracks;
        }

        public String[] getOthers() {
            return others;
        }

        public void setOthers(String[] others) {
            this.others = others;
        }
}
