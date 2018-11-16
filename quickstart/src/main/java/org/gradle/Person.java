package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private final String name;
    private final String lastName;
    private final int age;
    private final int note;

    public Person(String name,String lastName, int age, int note) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.note = note;
        new GrowthList();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge(){
    	return age;
    }

    public int getNote(){
    	return note;
    }

}
