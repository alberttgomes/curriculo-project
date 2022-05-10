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
    @Column
    private int numberPhone;
    @Column
    private int numberHome;
    @Column
    private String email;
    @Column
    private String profession;

    public Information(){
        super();
    }

    public Information(long informationId, int numberPhone, int numberHome, String email, String profession) {
        this.informationId = informationId;
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
