import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class casoAdyacentesTest {

    @Test
    void productoAdayacentes() {
        int[] arreglo = {1, -4, 2, 2, 5, -1};

        assertEquals(10,casoAdyacentes.productoAdayacentes(arreglo));
    }

    @Test
    void arrayde2() {
        int[] arreglo = {2,4};

        assertEquals(8,casoAdyacentes.productoAdayacentes(arreglo));
    }

    @Test
    void arraydetodoigual() {
        int[] arreglo = {5,5,5,5};

        assertEquals(25,casoAdyacentes.productoAdayacentes(arreglo));
    }

    @Test
    void arraybinario() {
        int[] arreglo = {1,0,1,0,1};

        assertEquals(0,casoAdyacentes.productoAdayacentes(arreglo));
    }

    @Test
    void arraynegativo() {
        int[] arreglo = {-3,-4,-6,-5,-2};

        assertEquals(30,casoAdyacentes.productoAdayacentes(arreglo));
    }

    @Test
    void arraygrande() {
        int[] arreglo = {-2,2,-6,5,-3};

        assertEquals(-4,casoAdyacentes.productoAdayacentes(arreglo));
    }

}