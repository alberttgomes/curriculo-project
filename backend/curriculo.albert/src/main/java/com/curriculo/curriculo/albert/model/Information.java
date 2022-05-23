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
        @Column(name = "numberPhone", length = 20, nullable = false)
        private String numberPhone;
        @Column(name = "numberHome", length = 20)
        private String numberHome;
        @Column(name = "email", length = 40, nullable = false)
        private String email;
        @Column(name = "profession", length = 25, nullable = false)
        private String profession;

        public Information(){
            super();
        }

        public Information(long informationId, String fullName, String numberPhone, String numberHome, String email, String profession) {
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

        public String getNumberPhone() {
            return numberPhone;
        }

        public void setNumberPhone(String numberPhone) {
            this.numberPhone = numberPhone;
        }

        public String getNumberHome() {
            return numberHome;
        }

        public void setNumberHome(String numberHome) {
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
