
package mergesort;

import javax.swing.JOptionPane;

/**
 *
 * @author ELA ALEINAD
 */
public class Ejmemplo2 {
 
    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort();

        boolean salida = false;

        while (!salida) {//Menú de opciones
        String[] botones1 = {
                "Probar algoritmo con lista predeterminada", 
                "Crear y probar el algoritmo con enteros",
                  "Crear y probar el algoritmo con double",
               
                "Crear y probar con el algoritmo", "salir"};
            int ventana1 = JOptionPane.showOptionDialog(null,
                    "Pulse para continuar",
                    "ALGORITMO MergeSort",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    botones1, botones1[0]);

            switch (ventana1) {
                case 0: {

                    try {

                        int arr[] = {5, 26, 2, -6, 1, 4, -97};

                        int n = arr.length;

                        System.out.println("Array original:");
                        for (int value : arr) {
                            System.out.print(value + " ");
                        }

                        System.out.println();

                        System.out.println("Array ordenado:");
                        mergeSort.sort(arr, 0, n - 1);
                        mergeSort.imprimeArray(arr);

                    } catch (NumberFormatException u) {
                        JOptionPane.showInputDialog(null, "ERROR" + u.getMessage());

                    }
                    break;
                }
                   case 1: {

                    try {

                        int numeroEntrada = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese la cantidad de numeros que incresará a la lista a ser reacomodada"));

                        int[] arr = new int[numeroEntrada];

                        for (int i = 0; i < numeroEntrada; i++) {

                            int numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese numero int"));
                            arr[i] = numero;
                        }

                        int n = arr.length;

                        System.out.println("Array original:");
                        for (int value : arr) {
                            System.out.print(value + " ");
                        }

                        System.out.println();

                        System.out.println("Array ordenado:");
                        mergeSort.sort(arr, 0, n - 1);
                        mergeSort.imprimeArray(arr);

                    } catch (NumberFormatException u) {
                        JOptionPane.showInputDialog(null, "ERROR" + u.getMessage());

                    }
                    break;
                }
               
                case 2: {

                    try {

                        int numeroEntrada = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese la cantidad de numeros que ingresará a la lista a ser reacomodada"));

                        Double [] arr = new Double[numeroEntrada];

                        for (int i = 0; i < numeroEntrada; i++) {

                            Double numero = Double.parseDouble(JOptionPane.showInputDialog(null,
                                    "Ingrese numero int"));
                            arr[i] = numero;
                          
                        }

                        int n = arr.length;

                        System.out.println("Array original:");
                        for (Double value : arr) {
                            System.out.print(value + " ");
                        }

                        System.out.println();

                        System.out.println("Array ordenado:");
                        mergeSort.sort(arr, 0, n - 1);
                        mergeSort.imprimeArray(arr);

                    } catch (NumberFormatException u) {
                        JOptionPane.showInputDialog(null, "ERROR" + u.getMessage());

                    }
                    break;
                }

              

                case 3: {
                    try {

                        JOptionPane.showMessageDialog(null, "Ha finalizado");
                        salida = true;
                    } catch (NumberFormatException u) {
                        JOptionPane.showMessageDialog(null, "ERROR" + u.getMessage());

                    }
                    break;
                }
                default: {
                    JOptionPane.showInputDialog(null, "Opcion incorrecta", "Ha ingresado una opcion no válida",
                            JOptionPane.INFORMATION_MESSAGE);

                }

            }
        }
    }

    
}
