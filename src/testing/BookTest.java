package testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @BeforeEach
    void init(){
        System.out.println("This message will be displayed before execution of each testing methods.");
    }

    @Test
    @Disabled // this disables test
    void getPage(){

        //Given
        Book book1 = new Book(345, "Java Tutorials");

        //When
        int result = book1.getPage();

        //Then
        assertEquals(345,result);
        System.out.println("This is getPage test method running");


    }

    @Test
    @DisplayName("This my get title test") //that changes the name that is displayed on console
    void getTitle(){
        //Given

        Book book1 = new Book(101,"Animal Farm");

        //When & Then
        assertEquals("Animal Farm",book1.getTitle());

        System.out.println("This is geTitle test method running");
    }

    @AfterAll
    static void test(){
        System.out.println("After all");
    }

}