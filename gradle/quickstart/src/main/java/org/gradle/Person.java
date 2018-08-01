package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private String name;
    private int age;
    private String weight;
    private String height;
    private String ci;
    private String nacionality;
    private String profession;
    private String petname;
    private int petage;

    public Person(String name, int age, String weight, String height, String ci, String nacionality, String profession,
                  String petname, int petage) {
        this.name = name;
        this.age = 24;
        this.weight = weight;
        this.height = height;
        this.ci = ci;
        this.nacionality = nacionality;
        this.profession = profession;
        this.petname = petname;
        this.petage = 2;

        new GrowthList();
    }
	
	public void setName(String name) {
        this.name = name;
    }
	
    public String getName() {
        return this.name;
    }
	
	public void setAge(int age) {
        this.age = age;
    }
	
    public int getAge() {
        return this.age;
    }
	
	public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return this.weight;
    }
	
	public void setHeight(String height) {
        this.height = height;
    }
	
    public String getHeight() {
        return this.height;
    }

	public void setCi(String ci) {
        this.ci = ci;
    }
	
    public String getCi() {
        return this.ci;
    }

	public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }
	
    public String getNacionality() {
        return this.nacionality;
    }
	
	public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return this.profession;
    }
	
	public void setPetname(String petname) {
        this.petname = petname;
    }

    public String getPetname() {
        return this.petname;
    }
	public void Petage(int petage) {
        this.petage = petage;
    }
	
    public int getPetage() {
        return this.petage;
    }
	
}
