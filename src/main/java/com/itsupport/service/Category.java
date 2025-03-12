package com.itsupport.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
    @Id
    private String categoryId;
    private String categoryName;

    // Getters and setters
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
