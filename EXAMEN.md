    
    
1. Esto sirve para hacer un test

    @Test 
2. El DisplayName sirve para saber de que va el test

    @DisplayName("Obtenemos el texto “Face” si el el parámetro que pasamos es múltiplo de 3")
3. Ponemos un nombre al test y void para que no devuelva nada

    void testFace() {
        // fail("Not yet implemented");
        // 1 - preracion del test
    - Aqui traemos el metodo creado en MiClaseExamen...

        MiClaseExamen calc = new MiClaseExamen();
        // 2 - Ejecutar lo que vamos a validar
    - Metemos un numero el cual sera el 3 y en MiClaseExamen sera la x

        String result = calc.Multiplos(3);
        // 3 - Aserciones
    - Por ultimo compararemos los resultados

        assertEquals("Face", result);
    }