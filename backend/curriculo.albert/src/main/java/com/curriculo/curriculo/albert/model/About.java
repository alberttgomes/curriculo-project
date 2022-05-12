package com.curriculo.curriculo.albert.model;

import javax.persistence.*;

@Entity
public class About {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long aboutId;

        @Column(name = "aboutSelf", length = 255, nullable = false)
        private String aboutSelf;

        public About(){
            super();
        }

        public About(long aboutId, String aboutSelf) {
            this.aboutId = aboutId;
            this.aboutSelf = aboutSelf;
        }

        public long getAboutId() {
            return aboutId;
        }

        public void setAboutId(long aboutId) {
            this.aboutId = aboutId;
        }

        public String getAboutSelf() {
            return aboutSelf;
        }

        public void setAboutSelf(String aboutSelf) {
            this.aboutSelf = aboutSelf;
        }

}
