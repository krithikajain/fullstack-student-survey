// package com.example.studentsurvey.model;

// import jakarta.persistence.*;
// import lombok.Data;

// import java.util.List;

// @Entity
// @Table(name = "surveys")
// @Data
// public class Survey {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     private String firstName;
//     private String lastName;
//     private String streetAddress;
//     private String city;
//     private String state;
//     private String zip;
//     private String phoneNumber;
//     private String email;
//     private String dateOfSurvey;
//     @ElementCollection
//     private List<String> likedFeatures;
//     private String interestSource;
//     private String recommendationLikelihood;
//     private String additionalComments;
// }
package com.example.studentsurvey.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "surveys")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;
    private String dateOfSurvey;
    @ElementCollection
    private List<String> likedFeatures;
    private String interestSource;
    private String recommendationLikelihood;
    private String additionalComments;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfSurvey() {
        return dateOfSurvey;
    }

    public void setDateOfSurvey(String dateOfSurvey) {
        this.dateOfSurvey = dateOfSurvey;
    }

    public List<String> getLikedFeatures() {
        return likedFeatures;
    }

    public void setLikedFeatures(List<String> likedFeatures) {
        this.likedFeatures = likedFeatures;
    }

    public String getInterestSource() {
        return interestSource;
    }

    public void setInterestSource(String interestSource) {
        this.interestSource = interestSource;
    }

    public String getRecommendationLikelihood() {
        return recommendationLikelihood;
    }

    public void setRecommendationLikelihood(String recommendationLikelihood) {
        this.recommendationLikelihood = recommendationLikelihood;
    }

    public String getAdditionalComments() {
        return additionalComments;
    }

    public void setAdditionalComments(String additionalComments) {
        this.additionalComments = additionalComments;
    }
}

