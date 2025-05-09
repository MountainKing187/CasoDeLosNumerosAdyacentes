import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class casoAdyacentesTest {

    @Test
    void productoAdayacentes() {
        int[] arreglo = {1, -4, 2, 2, 5, -1};

        assertEquals(10,casoAdyacentes.productoAdayacentes(arreglo));
    }
}