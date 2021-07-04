package com.swapnil.learning.bookservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document(collection="Books")
public class Books {

    @Id
    private BigInteger id;
    private int BookID;
    private Authors Authors;
    private Publishers Publishers;
    private String Title;
    private String ISBN;
    private String Genere;
    private String Type;
    private String PublicationYear;
    private String Price;
    private String Condition;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int bookID) {
        BookID = bookID;
    }

    public com.swapnil.learning.bookservice.model.Authors getAuthors() {
        return Authors;
    }

    public void setAuthors(com.swapnil.learning.bookservice.model.Authors authors) {
        Authors = authors;
    }

    public com.swapnil.learning.bookservice.model.Publishers getPublishers() {
        return Publishers;
    }

    public void setPublishers(com.swapnil.learning.bookservice.model.Publishers publishers) {
        Publishers = publishers;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenere() {
        return Genere;
    }

    public void setGenere(String genere) {
        Genere = genere;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getPublicationYear() {
        return PublicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        PublicationYear = publicationYear;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }
}
