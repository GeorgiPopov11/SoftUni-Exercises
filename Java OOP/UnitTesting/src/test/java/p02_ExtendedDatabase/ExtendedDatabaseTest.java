package p02_ExtendedDatabase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.naming.OperationNotSupportedException;

public class ExtendedDatabaseTest {

    private static final Person PERSON1 = Mockito.mock(Person.class);
    private static final Person PERSON2 = Mockito.mock(Person.class);
    private static final Person PERSON3 = Mockito.mock(Person.class);

    private Database database;

    @BeforeEach
    void setUp () throws OperationNotSupportedException {
        database = new Database(PERSON1, PERSON2, PERSON3);
        Mockito.when(PERSON1.getUsername()).thenReturn("George");
        Mockito.when(PERSON2.getUsername()).thenReturn("Ivan");
        Mockito.when(PERSON3.getUsername()).thenReturn("Dragan");

        Mockito.when(PERSON1.getId()).thenReturn(1);
        Mockito.when(PERSON2.getId()).thenReturn(2);
        Mockito.when(PERSON3.getId()).thenReturn(3);
    }

    @Test
    void test_Database_Throws_If_Persons_Are_More_Than_16 () {

        Assertions.assertThrows(OperationNotSupportedException.class, () -> {
            Person[] persons = new Person[17];
            Database database = new Database(persons);
        });
    }

    @Test
    void test_Database_Throws_If_Persons_Are_Less_Than_1 () {
        Assertions.assertThrows(OperationNotSupportedException.class, () -> {
            Person[] persons = new Person[0];
            Database database = new Database(persons);
        });
    }

    @Test
    void test_Constructor_Correctly_Creates_Database () throws OperationNotSupportedException {
        Person[] persons = new Person[] {PERSON1, PERSON2, PERSON3};
        Database database = new Database(persons);
    }

    @Test
    void test_Database_Throws_If_Added_Person_Is_Null () {
        Assertions.assertThrows(OperationNotSupportedException.class, () -> {
            database.add(null);
        });
    }

    @Test
    void test_Database_Correctly_Adds_Person () throws OperationNotSupportedException {
        Person person = new Person(1, "George");
        database.add(person);
        Person[] elements = database.getElements();

        int actualElements = elements.length;
        int expectedElements = 4;

        Assertions.assertEquals(expectedElements, actualElements);
    }

    @Test
    void test_Database_Throws_If_Database_Is_Empty () throws OperationNotSupportedException {
        Assertions.assertThrows(OperationNotSupportedException.class, () -> {
        Person[] persons = new Person[0];
        Database database1 = new Database(persons);
        database1.remove();

        });
    }

    @Test
    void test_Database_Size_Correctly_Decreases_When_Removing () throws OperationNotSupportedException {

        database.remove();
        Person[] elements = database.getElements();
        int actualElements = elements.length;
        int expectedElements = 2;

        Assertions.assertEquals(expectedElements, actualElements);
    }

    @Test
    void test_Database_Correctly_Removes_Persons () throws OperationNotSupportedException {

        database.remove();
        Person[] elements = database.getElements();

        Person actualElement = elements[elements.length - 1];
        Assertions.assertEquals(PERSON2, actualElement);
    }

    @Test
    void test_Database_FindByUsername_IsNotPresent_By_Username () {

        Mockito.when(PERSON1.getUsername()).thenReturn("George");
        Mockito.when(PERSON2.getUsername()).thenReturn("Ivan");
        Mockito.when(PERSON3.getUsername()).thenReturn("Dragan");

        Assertions.assertThrows(OperationNotSupportedException.class, () -> {
            database.findByUsername("Stoyan");
        });
    }

    @Test
    void test_Database_FindByUsername_Throws_When_Parameter_Is_Null () {
        Assertions.assertThrows(OperationNotSupportedException.class, () -> {
            database.findByUsername(null);
        });
    }

    @Test
    void test_Database_FindByUsername_Correctly_Finds_The_Username () throws OperationNotSupportedException {
        Person actualPerson = database.findByUsername("George");
        Assertions.assertEquals(PERSON1, actualPerson);
    }

    @Test
    void test_Database_FindById_Throws_When_No_Such_Id () {
        Assertions.assertThrows(OperationNotSupportedException.class, () -> {
            database.findById(100);
        });
    }

    @Test
    void test_Database_FindById_Finds_Correct_User () throws OperationNotSupportedException {

        Person actualPerson = database.findById(1);
        Assertions.assertEquals(PERSON1, actualPerson);
    }







    }





