
package mergesort;

import java.util.ArrayList;
import java.util.List;

public class ORDENA  {
  
    public void ejectuta(){
    List<Pelicula> listadepeli =new ArrayList<Pelicula> ();
 MergeSort mergeSort = new MergeSort();
Pelicula p1= new Pelicula("sss", "eee","eee", 1237890); //Declaramos una variable del tipo de la clase
Pelicula p2= new Pelicula("ss", "ee","e",-5); 
Pelicula p3= new Pelicula("s", "dd","dddd", 10); 
Pelicula p4= new Pelicula("xx", "x","000", 0); 

listadepeli.add(p1);
listadepeli.add(p2);
listadepeli.add(p3);
listadepeli.add(p4);
int n = listadepeli.size();


                        System.out.println("Array original:");
        int i=0;
                        for (i=0; i<n;i++) {
                            System.out.print("value:" + listadepeli.get(i).getAnio() );
                              System.out.println();
                        }

                        System.out.println();
                    System.out.println("Array ordenado:");
                                        //array    izq     derecha
                        mergeSort.sort(listadepeli, 0, listadepeli.get(n-1).getAnio());
                        mergeSort.imprimeArray(listadepeli);
        
        }
   public static void main(String[] args) {

        ORDENA miClas = new ORDENA();
        miClas.ejectuta();

   }
}
