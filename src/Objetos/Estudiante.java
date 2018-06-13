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
public class Estudiante {

    int IDEstudiante;
    String Usuario;
    String Nombre;
    List<Evaluacion> listaNotas = new ArrayList<>();
    double Definitiva;

    public Estudiante(int ID, String Usuario, String Nombre, int Nnotas) {
        this.IDEstudiante = ID;
        this.Usuario = Usuario;
        this.Nombre = Nombre;
        for (int i = 0; i < Nnotas; i++) {
            Evaluacion nota = new Evaluacion((i + 1));
            listaNotas.add(nota);
        }
    }

    public Estudiante(int ID, String Usuario, String Nombre, List<Evaluacion> listaNotas) {
        this.IDEstudiante = ID;
        this.Usuario = Usuario;
        this.Nombre = Nombre;
        this.listaNotas.addAll(listaNotas);
    }

    public String getNombreActividad(int NActividad) {
        Evaluacion X = null;
        for (Evaluacion c : this.listaNotas) {
            if (c.NActividad == NActividad) {
                X = c;
            }
        }
        return X.getNombreActividad();
    }

    public void setNombreActividad(String NombreActividad, int NActividad) {
        for (Evaluacion c : this.listaNotas) {
            if (c.NActividad == NActividad) {
                c.setNombreActividad(NombreActividad);
            }
        }
    }

    public int getID() {
        return IDEstudiante;
    }

    public void setID(int ID) {
        this.IDEstudiante = ID;
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

    public List<Evaluacion> getListaNotas() {
        return listaNotas;
    }

    public void setPorcentaje(double porcentaje, int NActividad) throws Exception {
        for (Evaluacion c : this.listaNotas) {
            if (c.NActividad == NActividad) {
                double acumulador = 0;
                for (Evaluacion d : listaNotas) {
                    if (d.NActividad != NActividad) {
                        acumulador = acumulador + d.porcentaje;
                    }
                }

                acumulador = acumulador + porcentaje;
                if (acumulador <= 100) {
                    c.setPorcentaje(porcentaje);
                } else {
                    throw new Exception("El porcentaje no puede ser mayor al 100");
                }
            }
        }
    }

    public void setNota(double nota, int NActividad) throws Exception {
        if (nota <= 5) {
            for (Evaluacion c : this.listaNotas) {
                if (c.NActividad == NActividad) {
                    c.setNota(nota);
                }
            }
        } else {
            throw new Exception("La Nota no puede ser mayor a 5");
        }
    }

    public double getDefinitiva() {
        Definitiva=0;
        for(Evaluacion e: listaNotas){
            double b=e.getNota();
            double c=e.getPorcentaje();
            Definitiva=Definitiva+((b/100)*c);
        }
        return Definitiva;
    }

    public void setDefinitiva(double Definitiva) {
        this.Definitiva = Definitiva;
    }

}
