package com.will.intent.data.mapping;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.UUID;

/*
 * Created by marksmelendez on 1/15/17.
 */

@Document
public class MarketUser {

    @Id
    private ObjectId id;

    private UUID userId;

    private String userName;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Collection<MarketReview> reviewPool = new LinkedHashSet<MarketReview>();

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ObjectId getId() {
        return id;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public void setId(ObjectId id) {
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Collection<MarketReview> getReviewPool() {
        return reviewPool;
    }

    public void setReviewPool(Collection<MarketReview> reviewPool) {
        this.reviewPool = reviewPool;
    }


}
