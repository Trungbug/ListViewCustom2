package com.example.listviewcustom2;

public class Country {
    private int sourceImage;
    private String textCountry;
    private String textPopulation;
    private String textArea;

    public int getSourceImage() {
        return sourceImage;
    }

    public void setSourceImage(int sourceImage) {
        this.sourceImage = sourceImage;
    }

    public String getTextCountry() {
        return textCountry;
    }

    public void setTextCountry(String textCountry) {
        this.textCountry = textCountry;
    }

    public String getTextPopulation() {
        return textPopulation;
    }

    public void setTextPopulation(String textPopulation) {
        this.textPopulation = textPopulation;
    }

    public String getTextArea() {
        return textArea;
    }

    public void setTextArea(String textArea) {
        this.textArea = textArea;
    }

    public Country(int sourceImage, String textCountry, String textPopulation, String textArea) {
        this.sourceImage = sourceImage;
        this.textCountry = textCountry;
        this.textPopulation = textPopulation;
        this.textArea = textArea;
    }
    public  Country(int sourceImage){
        this.sourceImage = sourceImage;
    }

    @Override
    public String toString() {
        return "Country{" +
                "sourceImage=" + sourceImage +
                ", textCountry='" + textCountry + '\'' +
                ", textPopulation='" + textPopulation + '\'' +
                ", textArea='" + textArea + '\'' +
                '}';
    }
}
