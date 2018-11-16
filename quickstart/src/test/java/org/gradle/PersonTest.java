package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry","Saints",25,45);
        assertEquals("Larry", person.getName());
    }
    @Test
    public void test2() {
        assertEquals("Larry", "Larry");
    }
    @Test
    public void test3() {
        assertEquals("Larry2", "Larry2");
    }
    @Test
    public void testCase1() {
    	Person person = new Person("Marcela","Cordova",25,55);
        assertEquals(25, person.getAge());
        assertEquals("Cordova", person.getLastName());
    }
    @Test
    public void testCase2() {
    	Person person = new Person("Marcia","Dias",28,68);
        assertEquals("Marcia", person.getName());
        assertNotEquals("Sainz", person.getLastName());
        assertEquals(68, person.getNote());
        assertEquals(28, person.getAge());
    }
    @Test
    public void testCase3() {
        Person person = new Person("Teddy","Colque",24,66);
        assertNotEquals("Marcos", person.getName());
        assertEquals(66, person.getNote());
        assertEquals(24, person.getAge());
    }
    @Test
    public void testCase4() {
       Person person = new Person("Cristina","Arias",25,72);
        assertEquals("Cristina", person.getName());
        assertEquals("Arias", person.getLastName());
        assertEquals(72, person.getNote());
        assertEquals(25, person.getAge());
    }
    @Test
    public void testCase5() {
       Person person = new Person("Tania","Salvatierra",29,57);
        assertEquals("Tania", person.getName());
        assertEquals("Salvatierra", person.getLastName());
        assertEquals(57, person.getNote());
        assertEquals(29, person.getAge());
    }
    @Test
    public void testCase6() {
        Person person = new Person("Tomas","Sainz",22,99);
        assertNotEquals("Tina", person.getName());
        assertNotEquals("Sains", person.getLastName());
        assertEquals(99, person.getNote());
        assertEquals(22, person.getAge());
    }
    @Test
    public void testCase7() {
        Person person = new Person("Pablo","Campos",28,68);
        assertEquals("Pablo", person.getName());
        assertEquals(68, person.getNote());
        assertEquals(28, person.getAge());
    }
    @Test
    public void testCAse8() {
        Person person = new Person("Marcos","Lopez",26,50);
        assertEquals("Marcos", person.getName());
        assertEquals("Lopez", person.getLastName());
        assertNotEquals(60, person.getNote());
        assertNotEquals(25, person.getAge());
    }
    @Test
    public void testCAse9() {
        Person person = new Person("Luis","Mendez",28,65);
        assertNotEquals("Luiz", person.getName());
        assertEquals("Mendez", person.getLastName());
        assertEquals(65, person.getNote());
        assertEquals(28, person.getAge());
    }
    @Test
    public void testCase10() {
        Person person = new Person("Lucas","Lopez",20,35);
        assertEquals("Lucas", person.getName());
        assertEquals("Lopez", person.getLastName());
        assertEquals(35, person.getNote());
        assertEquals(20, person.getAge());
    }
}
