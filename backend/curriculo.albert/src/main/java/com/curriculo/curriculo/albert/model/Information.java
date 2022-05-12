package com.curriculo.curriculo.albert.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Information {
    
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long informationId;
        @Column(name = "fullName", length = 40, nullable = false)
        private String fullName;
        @Column(name = "numberPhone", length = 11, nullable = false)
        private int numberPhone;
        @Column(name = "numberHome", length = 10)
        private int numberHome;
        @Column(name = "email", length = 25, nullable = false)
        private String email;
        @Column(name = "profession", length = 15, nullable = false)
        private String profession;

        public Information(){
            super();
        }

        public Information(long informationId, String fullName, int numberPhone, int numberHome, String email, String profession) {
            this.informationId = informationId;
            this.fullName = fullName;
            this.numberPhone = numberPhone;
            this.numberHome = numberHome;
            this.email = email;
            this.profession = profession;
        }

        public long getInformationId() {
            return informationId;
        }

        public void setInformationId(long informationId) {
            this.informationId = informationId;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public int getNumberPhone() {
            return numberPhone;
        }

        public void setNumberPhone(int numberPhone) {
            this.numberPhone = numberPhone;
        }

        public int getNumberHome() {
            return numberHome;
        }

        public void setNumberHome(int numberHome) {
            this.numberHome = numberHome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getProfession() {
            return profession;
        }

        public void setProfession(String profession) {
            this.profession = profession;
        }

}
