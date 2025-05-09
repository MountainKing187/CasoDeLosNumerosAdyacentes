public class casoAdyacentes {

    public static int productoAdayacentes(int[] arreglo){
        if(arreglo.length > 20) {throw new IllegalArgumentException("Matriz muy grande");}
        if(arreglo.length <2){throw new IllegalArgumentException("Matriz muy chica");}
        if (arreglo == null) {throw new IllegalArgumentException("El arreglo no puede ser null");}
        int mayorProducto = Integer.MIN_VALUE;
        int productoActual;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > 1000 || arreglo[i] < -1000){
                throw new IllegalArgumentException("Al menos un elemento del array es mayor que 1000 o menor que -1000");
            }
        }


        for (int i = 0; i < arreglo.length - 1; i++) {
            productoActual = arreglo[i] * arreglo[i+1];
            if (productoActual > mayorProducto){
                mayorProducto = productoActual;
            }
        }

        return mayorProducto;
    }
}
