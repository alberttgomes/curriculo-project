package com.curriculo.curriculo.albert.model;

import javax.persistence.*;


@Entity
public class Skills {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long skillsId;
        
        @Column(name = "SoftSkills", nullable = false)
        private String softSkills;
        
        @Column(name = "HardSkills", nullable = false)
        private String hardSkills;

        public Skills() {
            super();
        }

        public Skills(long skillsId, String softSkills, String hardSkills) {
            this.skillsId = skillsId;
            this.softSkills = softSkills;
            this.hardSkills = hardSkills;
        }

        public long getSkillsId() {
            return skillsId;
        }

        public void setSkillsId(long skillsId) {
            this.skillsId = skillsId;
        }

        public String getSoftSkills() {
            return softSkills;
        }

        public void setSoftSkills(String softSkills) {
            this.softSkills = softSkills;
        }

        public String getHardSkills() {
            return hardSkills;
        }

        public void setHardSkills(String hardSkills) {
            this.hardSkills = hardSkills;
        }

}
