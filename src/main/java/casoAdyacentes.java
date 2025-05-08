public class casoAdyacentes {

    public static int productoAdayacentes(int[] arreglo){
        int mayorProducto = 0;
        int productoActual;

        for (int i = 0; i < arreglo.length - 1; i++) {
            productoActual = arreglo[i] * arreglo[i+1];
            if (productoActual > mayorProducto){
                mayorProducto = productoActual;
            }
        }

        return mayorProducto;
    }
}
