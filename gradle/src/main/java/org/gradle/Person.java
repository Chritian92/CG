package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private final String name;
    private final int age;
    private float weight;
    private float height;
    private int ci;
    private String nacionality;
    private String profession;
    private String petName;
    private int petAge;

    public Person(String name, int age, float weight, float height, int ci, String nacionality, String profession,
                  String petName, int petAge) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.ci = ci;
        this.nacionality = nacionality;
        this.profession = profession;
        this.petName = petName;
        this.petAge = petAge;

        new GrowthList();
    }

    public String getName(String name) {
        return name
    }

    public String getAge(int age) {
        return age
    }

    public String getWeight(float weight) {
        return weight
    }

    public String getHeight(float height) {
        return height
    }

    public String getCi(int ci) {
        return ci
    }

    public String getNacionality(String nacionality) {
        return nacionality
    }

    public String getProfession(String profession) {
        return profession
    }

    public String getPetName(String petName) {
        return petName
    }
    public String getPetAge(String petAge) {
        return petAge
    }
    public String getAllData() {
        return "Name: "+name+" "+"\n Nacionality: "+nacionality
                +"\n Profession: "+profession+"\n Pet Name: "+petName;
    }
}
