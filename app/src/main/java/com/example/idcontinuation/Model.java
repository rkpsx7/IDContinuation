package com.example.idcontinuation;

public class Model {
    private int imageID;
    private String Company,age,business;

    public Model(int imageID, String company, String age, String business) {
        this.imageID = imageID;
        Company = company;
        this.age = age;
        this.business = business;
    }

    public int getImageID() {
        return imageID;
    }

    public String getCompany() {
        return Company;
    }

    public String getAge() {
        return age;
    }

    public String getBusiness() {
        return business;
    }
}
