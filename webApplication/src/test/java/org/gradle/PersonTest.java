package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry", "Male", 12345678, "Sucre Street", 20, 72728546);
        assertEquals("Larry", person.getName());
    }

    @Test
    public void canReturnGender() {
        Person person = new Person("William", "Male", 987654321, "San Martin Street", 29, 79742992);
        assertEquals("Male", person.getGender());
    }

    @Test
    public void canReturnCi() {
        Person person = new Person("William", "Male", 987654321, "San Martin Street", 29, 79742992);
        assertEquals(987654321, person.getCi());
    }

    @Test
    public void canReturnPhone() {
        Person person = new Person("Maria", "Female", 159264873, "6 of August Av.", 29, 72959499);
        assertEquals(72959499, person.getPhone());
    }

    @Test
    public void canSetPhone() {
        Person person = new Person("Maria", "Female", 159264873, "6 of August Av.", 29, 72959499);
        person.setPhone(71122334);
        assertEquals(71122334, person.getPhone());
    }

    @Test
    public void canReturnAge() {
        Person person = new Person("Susan", "Female", 265948713, "6 of August Av.", 35, 12345678);
        assertEquals(35, person.getAge());
    }

    @Test
    public void canSetAge() {
        Person person = new Person("Susan", "Female", 265948713, "6 of August Av.", 35, 12345678);
        person.setAge(32);
        assertEquals(32, person.getAge());
    }

    @Test
    public void canReturnAddress() {
        Person person = new Person("Lilian", "Female", 987654321, "Thunupa Av.", 30, 72743231);
        assertEquals("Thunupa Av.", person.getAddress());
    }

    @Test
    public void canSetAddress() {
        Person person = new Person("Lilian", "Female", 987654321, "Thunupa Av.", 30, 72743231);
        person.setAddress("America Av.");
        assertEquals("America Av.", person.getAddress());
    }

    @Test
    public void canGetName() {
        Person person = new Person("Barack", "Male", 546321987, "Springfield Av.", 54, 149562387);
        assertEquals("Barack", person.getName());
    }

    @Test
    public void canSetAnotherAddress() {
        Person person = new Person("Barack", "Male", 546321987, "Springfield Av.", 54, 149562387);
        person.setAddress("Square Garden Madisson");
        assertEquals("Square Garden Madisson", person.getAddress());
    }
}
