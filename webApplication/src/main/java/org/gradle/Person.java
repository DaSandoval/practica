package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
	
    private final String name;
    private final String gender;
    private final int ci;
    private String address;
    private int age;
    private int phone;

    public Person(String name,String gender, int ci, String address, int age, int phone) {
        this.name = name;
        this.gender = gender;
        this.ci = ci;
        this.address = address;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getCi() {
        return ci;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address){
    	this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
    	this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone){
    	this.phone = phone;
    }
}
