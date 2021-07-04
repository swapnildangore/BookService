package com.swapnil.learning.bookservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;


@Document(collection = "Publishers")
public class Publishers {
    @Id
    private BigInteger id;
    private int PublisherID;
    private String country;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public int getPublisherID() {
        return PublisherID;
    }

    public void setPublisherID(int publisherID) {
        PublisherID = publisherID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
