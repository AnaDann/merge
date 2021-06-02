
package mergesort;

/**
 *
 * @author ELA ALEINAD
 */

public class Nodo implements Comparable<Nodo> {

    private Object dato ;  //DATO TIPO OBJETO
    private Double indiceNodo;       //INDEX DEL NODO
  
 //mucho ojooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo
    Nodo(Double x, Object nodo_informacion) {
    
        dato= nodo_informacion;
   indiceNodo= x; 
    }


    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }


    public Double getIndiceNodo() {
        return indiceNodo;
    }

    public void setIndiceNodo(Double indiceNodo) {
        this.indiceNodo = indiceNodo;
    }


    @Override
    public int compareTo(Nodo obj) {           //PERMITE COMPARAR DOS NODOS
        return getDato().toString().compareTo(obj.getDato().toString());
    }
}
