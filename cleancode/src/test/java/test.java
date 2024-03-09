import org.junit.jupiter.api.*;

import com.example.Main;

import static org.junit.jupiter.api.Assertions.*;

public class test {
    // @Test
    // public void testSumar() {
    //     int num1 = 1;
    //     int num2 = 2;
    //     int suma = Main.suma(num1, num2);
    //     assertEquals(suma, 3);
    //     assertNotEquals(suma,2);
        
    // }
    
    @Test
    public void testSumar() {
        int num1 = 1;
        int num2 = 2;
        int suma = Main.suma(num1, num2);
        assertEquals(suma, 3);
        
        
    }

    @Test
    public void testSumaIncorrecta() {
        int num1 = 1;
        int num2 = 2;
        int suma = Main.suma(num1, num2);
        assertNotEquals(suma,2);
        
    }

    // @Test
    // public void testSumaResta() {
    //     int num1 = 1;
    //     int num2 = 2;
    //     int suma = Main.suma(num1, num2);
    //     int resta = suma-num1;

    //     assertEquals(resta, 2);
        
    // }


    @Test
    public void testResta() {
        int num1 = 1;
        int num2 = 2;
        int resta = num2-num1;

        assertEquals(resta, 1);
        
    }

}
