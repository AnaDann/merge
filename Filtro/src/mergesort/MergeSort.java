package mergesort;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.*;

public class MergeSort {

    public void sort(List<Pelicula> arr, int izq, int der) {
        if (izq < der) {
           //Encuentra el punto medio del vector.
            int centro = (izq + der) / 2;

            //Divide la primera y segunda mitad (llamada recursiva).
            sort(arr,arr.get(izq).getAnio(), arr.get(centro).getAnio());
            sort(arr, arr.get(centro+1).getAnio(), arr.get(der).getAnio());

            //Une las mitades.
            merge(arr,arr.get(izq).getAnio(), arr.get(centro).getAnio(), arr.get(der).getAnio());
        }

    }
    public void sort(int arr[], int izq, int der) {
        if (izq < der) {
           //Encuentra el punto medio del vector.
            int centro = (izq + der) / 2;

            //Divide la primera y segunda mitad (llamada recursiva).
            sort(arr, izq, centro);
            sort(arr, centro + 1, der);

            //Une las mitades.
         //   merge(arr, izq, centro, der);
        }

    }
    public void sort(Double arr[], int izq, int der) {
        if (izq < der) {
           //Encuentra el punto medio del vector.
            int centro = (izq + der) / 2;

            //Divide la primera y segunda mitad (llamada recursiva).
            sort(arr, izq, centro);
            sort(arr, centro + 1, der);

            //Une las mitades.
            merge(arr, izq, centro, der);
        }

    }
    
// divide en dos mitades el vector que se pasa por parametro hasta que el vector se quede de tamaño 1.
    public void merge(List<Pelicula> arr, int izq, int centro, int der) {

//Encuentra el tamaño de los sub-vectores para unirlos.
        int n1 = centro - izq + 1;
        int n2 = der - centro;

//Vectores temporales.
        int izqArray[] = new int[n1];
        int derArray[] = new int[n2];

//Copia los datos a los arrays temporales.
        for (int i = 0; i < n1; i++) {
            izqArray[i] = arr.get(izq+1).getAnio();
        }
        for (int j = 0; j < n2; j++) {
            derArray[j] =arr.get(centro + j + 1).getAnio();
        }
        /* Une los vectorestemporales. */

//Índices inicial del primer y segundo sub-vector.
        int i = 0, j = 0;

//Índice inicial del sub-vector arr[].
        int k = izq;

//Ordenamiento.
        while (i < n1 && j < n2) {
            if (izqArray[i] <= derArray[j]) {
               
arr.get(i).getAnio();

// arr[k] = izqArray[i];
                i++;
            } else {
              
arr.get(j).getAnio();
//  arr[k] = derArray[j];
                j++;
            }
            k++;
        }//Fin del while.

        /* Si quedan elementos por ordenar */
//Copiar los elementos restantes de izqArray[].
        while (i < n1) {
            arr.get(i).getAnio();
            //arr[k] = izqArray[i];
            i++;
            k++;
        }
//Copiar los elementos restantes de derArray[].
        while (j < n2) {
       arr.get(j).getAnio();
//      arr[k] = derArray[j];
            j++;
            k++;
        }
    }
 public void merge(Double arr[], int izq, int centro, int der) {

//Encuentra el tamaño de los sub-vectores para unirlos.
        int n1 = centro - izq + 1;
        int n2 = der - centro;

//Vectores temporales.
        Double izqArray[] = new Double[n1];
        Double derArray[] = new Double[n2];

//Copia los datos a los arrays temporales.
        for (int i = 0; i < n1; i++) {
            izqArray[i] = arr[izq + i];
        }
        for (int j = 0; j < n2; j++) {
            derArray[j] = arr[centro + j + 1];
        }
        /* Une los vectorestemporales. */

//Índices inicial del primer y segundo sub-vector.
        int i = 0, j = 0;

//Índice inicial del sub-vector arr[].
        int k = izq;

//Ordenamiento.
        while (i < n1 && j < n2) {
            if (izqArray[i] <= derArray[j]) {
                arr[k] = izqArray[i];
                i++;
            } else {
                arr[k] = derArray[j];
                j++;
            }
            k++;
        }//Fin del while.

        /* Si quedan elementos por ordenar */
//Copiar los elementos restantes de izqArray[].
        while (i < n1) {
            arr[k] = izqArray[i];
            i++;
            k++;
        }
//Copiar los elementos restantes de derArray[].
        while (j < n2) {
            arr[k] = derArray[j];
            j++;
            k++;
        }
    }

        public void imprimeArray(List<Pelicula> arr) {
        int n = arr.size();
        for (int i = 0; i < n; ++i) {
            System.out.print(arr.get(i).getAnio() + " ");
        }
        System.out.println();
    }
    public void imprimeArray(Double arr[], Nodo arreglo[]) {
        int n = arr.length;
        
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " "+arreglo[i]);
        }
        System.out.println();
    }
    
    public void imprimeArray(Double arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
