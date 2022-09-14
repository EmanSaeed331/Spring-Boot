package com.example.demo.model;

import org.springframework.data.annotation.Id;

public class User {
        @Id
        private String id;

        private String firstName;
        private String lastName;
        private String email;
        private String jobTitle;

        public User() {

        }

        public User(String firstName, String lastName,String email , String jobTitle ) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.jobTitle = jobTitle;
        }

        public String getId() {
            return id;
        }

        public String getfirstName() {
            return firstName;
        }

        public void setfirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setlastName(String lastName) {
            this.lastName = lastName;
        }

        public String getlastName() {
            return lastName;
        }

        public String getemail() {
            return email;
        }

        public void setemail(String email) {
            this.email = email;
        }

        public String getjobTitle() {
            return jobTitle;
        }

        public void setjobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }




        @Override
        public String toString() {
            return "Tutorial [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", jobTitle=" + jobTitle +"]";
        }
    }