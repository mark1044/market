package com.will.intent.data.mapping;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

/**
 * Created by marksmelendez on 1/26/17.
 */

@Document
public class MarketProfile {

    @Id
    private ObjectId id;

    private String userName;

    private UUID userId;

    private MarketMediaResource avatar;

    private boolean trusted;

    private int userRating;

    private String selfIntro;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public MarketMediaResource getAvatar() {
        return avatar;
    }

    public void setAvatar(MarketMediaResource avatar) {
        this.avatar = avatar;
    }

    public boolean isTrusted() {
        return trusted;
    }

    public void setTrusted(boolean trusted) {
        this.trusted = trusted;
    }

    public int getUserRating() {
        return userRating;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }

    public String getSelfIntro() {
        return selfIntro;
    }

    public void setSelfIntro(String selfIntro) {
        this.selfIntro = selfIntro;
    }


}
