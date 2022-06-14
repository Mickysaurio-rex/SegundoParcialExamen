package examen.ejercicio4;

import java.util.List;

public class AlgoPorCarnet implements IBusqueda{


    @Override
    public void estrategiaDeOrdenamiento(List<Estudiantes> inventario) {
        int[] arrayI ;
        arrayI = new int[inventario.size()];
        for(int i = 0; i<arrayI.length; i++){
            arrayI[i] = inventario.get(i).getCi();
        }

        int i, j, aux;
        for (i = 0; i < arrayI.length - 1; i++) {
            for (j = 0; j < arrayI.length - i - 1; j++) {
                if (arrayI[j + 1] < arrayI[j]) {
                    aux = arrayI[j + 1];
                    arrayI[j + 1] = arrayI[j];
                    arrayI[j] = aux;
                }
            }
        }

        for(int s = 0; i<arrayI.length; i++){
            System.out.println(arrayI[s]);
        }

    }

}

