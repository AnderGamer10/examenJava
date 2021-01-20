package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import app.*;

public class TestExamen {
    @Test
    @DisplayName("Obtenemos el texto “Face” si el el parámetro que pasamos es múltiplo de 3")
    void testFace() {
        // fail("Not yet implemented");
        // 1 - preracion del test
        MiClaseExamen calc = new MiClaseExamen();
        // 2 - Ejecutar lo que vamos a validar
        String result = calc.Multiplos(3);
        // 3 - Aserciones
        assertEquals("Face", result);
    }
    @Test
    @DisplayName("Obtenemos “Book” si el parámetro es múltiplo de 5")
    void testBook() {
        // fail("Not yet implemented");
        // 1 - preracion del test
        MiClaseExamen calc = new MiClaseExamen();
        // 2 - Ejecutar lo que vamos a validar
        String result = calc.Multiplos(5);
        // 3 - Aserciones
        assertEquals("Book", result);
    }
    @Test
    @DisplayName("Obtenemos “Facebook” si el parámetro es múltiplo de 5 y de 3 (lo mismo que 15)")
    void testFacebook() {
        // fail("Not yet implemented");
        // 1 - preracion del test
        MiClaseExamen calc = new MiClaseExamen();
        // 2 - Ejecutar lo que vamos a validar
        String result = calc.Multiplos(15);
        // 3 - Aserciones
        assertEquals("Facebook", result);
    }
    @Test
    @DisplayName("Obtenemos el mismo parámetro en caso de no ser múltiplo de 3, de 5 ni de 15")
    void test3x5() {
        // fail("Not yet implemented");
        // 1 - preracion del test
        MiClaseExamen calc = new MiClaseExamen();
        // 2 - Ejecutar lo que vamos a validar
        String result = calc.Multiplos(8);
        // 3 - Aserciones
        assertEquals(8, result);
    }
    @Test
    @DisplayName("Obtenemos “1 2 Face“ cuando pasamos un array con los valores {1,2,3}")
    void test12Face() {
        // fail("Not yet implemented");
        // 1 - preracion del test
        MiClaseExamen calc = new MiClaseExamen();
        // 2 - Ejecutar lo que vamos a validar
        int[] array = {1, 2, 3};
        String result = calc.array(array);
        // 3 - Aserciones
        assertEquals(6, result);
    }


}
