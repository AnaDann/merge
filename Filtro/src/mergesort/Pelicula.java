package mergesort;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Ian Rojas Gomez
 */
public class Pelicula {

    private String idPelicula;
    private String tituloOriginal;
    private String tituloExhibicion;
    private int anio;
    


    public Pelicula() {

    }
    
    public Pelicula(String idPelicula, String tituloOriginal, String tituloExhibicion, int anio) {
        this.idPelicula = idPelicula;
        this.tituloOriginal = tituloOriginal;
        this.tituloExhibicion = tituloExhibicion;
        this.anio = anio;
    }


    
    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOrigginal) {
        this.tituloOriginal = tituloOrigginal;
    }

    public String getTituloExhibicion() {
        return tituloExhibicion;
    }

    public void setTituloExhibicion(String exhibicion) {
        this.tituloExhibicion = exhibicion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(String idPelicula) {
        this.idPelicula = idPelicula;
    }

  
}
