package Objetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JhonMario
 */
public class Grupo {

    public String NombreClase;
    public String Docente;
    public List<Estudiante> listaEstudiantes = new ArrayList<>();

    public Grupo(String NombreClase, String Docente) {
        this.NombreClase = NombreClase;
        this.Docente = Docente;
    }

    public Grupo(String NombreClase, String Docente, List<Estudiante> listaEstudiantes) {
        this.NombreClase = NombreClase;
        this.Docente = Docente;
        this.listaEstudiantes.addAll(listaEstudiantes);
    }

    public String getNombreClase() {
        return NombreClase;
    }

    public void setNombreClase(String NombreClase) {
        this.NombreClase = NombreClase;
    }

    public String getDocente() {
        return Docente;
    }

    public void setDocente(String Docente) {
        this.Docente = Docente;
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

}
