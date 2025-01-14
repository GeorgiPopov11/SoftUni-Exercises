package p01_Database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {

    private Database database;
    private Integer[] elements;

    @BeforeEach
    void setUp() throws OperationNotSupportedException {
        elements = new Integer[] {1, 2, 3, 4, 5};
        database = new Database(elements);
    }

    @Test
    void test_Constructor_Should_Throw_When_Elements_AreOver_16_Integers ()  {

        Integer[] elements = new Integer[17];

        Assertions.assertThrows(OperationNotSupportedException.class, () -> {
            Database database = new Database(elements);
        });
    }

    @Test
    void test_Constructor_Should_Throw_When_Elements_areLower_1_Integers () {
        Integer[] elements = new Integer[0];

        Assertions.assertThrows(OperationNotSupportedException.class, () -> {
            Database database = new Database(elements);
        });
    }

    @Test
    void test_Constructor_Should_Create_Correct_Database () throws OperationNotSupportedException {
        Integer[] expectedResult = {1, 2, 3, 4, 5};
        Database database = new Database(expectedResult);

        Integer[] actualResult = database.getElements();
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void test_Database_Should_Throw_When_adding_null () {
        Assertions.assertThrows(OperationNotSupportedException.class, () -> {
            database.add(null);
        });
    }
    
    @Test
    void test_Database_Should_Add_Element_Correctly () throws OperationNotSupportedException {

        database.add(10);
        Integer[] elements = database.getElements();
        int size = elements.length;

        int expectedElement = elements[size - 1];
        int actualElement = 10;

        Assertions.assertEquals(expectedElement, actualElement);
    }

    @Test
    void test_Database_Should_Increase_Size_When_Adding_New_Element () throws OperationNotSupportedException {
        database.add(10);
        Integer[] elements = database.getElements();
        int actualSize = elements.length;
        int expectedSize = 6;

        Assertions.assertEquals(expectedSize, actualSize);
    }

    @Test
    void test_Database_Should_Throw_When_Removing_From_Empty_Database () {
        Assertions.assertThrows(OperationNotSupportedException.class, () -> {
            Integer[] elements = new Integer[0];
            Database database = new Database(elements);
            database.remove();
        });
    }

    @Test
    void test_Database_Should_Correctly_Remove_Element () throws OperationNotSupportedException {

        database.remove();
        Integer[] elements = database.getElements();

        int expectedElement = elements[elements.length - 1];
        int actualElement = 4;

        Assertions.assertEquals(expectedElement, actualElement);
    }

    @Test
    void test_Database_Should_Decrease_Size_When_Removing_Element () throws OperationNotSupportedException {

        database.remove();
        Integer[] elements = database.getElements();
        int actualSize = elements.length;
        int expectedSize = 4;

        Assertions.assertEquals(expectedSize, actualSize);
    }




}
