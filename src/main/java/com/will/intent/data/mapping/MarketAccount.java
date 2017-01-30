package com.will.intent.data.mapping;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

/**
 * Created by marksmelendez on 1/26/17.
 */
@Document
public class MarketAccount {

    @Id
    private ObjectId id;

    private UUID userId;

    private String shipingAddress;

    private String phoneNumber;

    private String creditAddress;

    private boolean mainPaymentMethod;

    /*
     * Encrypted
     */
    private String creditCardNumber;

    /*
     * Encrypted
     */
    private String securityCode;

    /*
     * Encrypted
     */
    private String expirationDate;

    /*
     * Encrypted
     */
    private String nameOnCard;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getShipingAddress() {
        return shipingAddress;
    }

    public void setShipingAddress(String shipingAddress) {
        this.shipingAddress = shipingAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCreditAddress() {
        return creditAddress;
    }

    public void setCreditAddress(String creditAddress) {
        this.creditAddress = creditAddress;
    }

    public boolean isMainPaymentMethod() {
        return mainPaymentMethod;
    }

    public void setMainPaymentMethod(boolean mainPaymentMethod) {
        this.mainPaymentMethod = mainPaymentMethod;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }
}
