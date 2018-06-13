/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JhonMario
 */
public class Docente {

    public int IDDocente;
    public String Usuario;
    public String Nombre;
    public List<Grupo> listaClase = new ArrayList<>();

    public Docente(int IDDocente, String Usuario, String Nombre, List<Grupo> listaClase) {
        this.IDDocente = IDDocente;
        this.Usuario = Usuario;
        this.Nombre = Nombre;
        this.listaClase.addAll(listaClase);
    }

    public Docente(int IDDocente, String Usuario, String Nombre) {
        this.IDDocente = IDDocente;
        this.Usuario = Usuario;
        this.Nombre = Nombre;
    }

    public int getIDDocente() {
        return IDDocente;
    }

    public void setIDDocente(int IDDocente) {
        this.IDDocente = IDDocente;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public List<Grupo> getListaClase() {
        return listaClase;
    }

    public void setListaClase(List<Grupo> listaClase) {
        this.listaClase = listaClase;
    }

}
