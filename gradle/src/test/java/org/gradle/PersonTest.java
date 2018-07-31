package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class PersonTest {
    public Person person;
    @Before
    public void init() {
        person = new Person("Jose",
                24,
                1.71,
                65,
                7912154,
                "Bolivian",
                "Electronic Ingenier",
                "Loki",
                2);
    }

    @Test
    public void testGetPersonName() {
        assertEquals("Jose", person.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(24, person.getAge());
    }

    @Test
    public void testgetWeight() {
        assertEquals(1.71, person.getWeight(), 0);
    }

    @Test
    public void testGetHeight() {
        assertEquals(65, person.getHeight(), 0);
    }

    @Test
    public void testGetCi() {
        assertEquals(7912154, person.getCi(), 0);
    }

    @Test
    public void testGetNacionality() {
        assertEquals("Bolivian", person.getNacionality());
    }

    @Test
    public void testGetProfession() {
        assertEquals("Electronic Ingenier", person.getProfession());
    }

    @Test
    public void testGetPetName() {
        assertEquals("Loki", person.getPetName());
    }

    @Test
    public void testGetPetAge() {
        assertEquals(2, person.getPetAge());
    }

    @Test
    public void testGetAllData() {
        assertEquals("Name: Jose\n Nacionality: Bolivian \n Profession: Electronic Ingenier\n Pet Name: Loki",
                person.getAllData());
    }
}
