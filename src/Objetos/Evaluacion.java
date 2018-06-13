package Objetos;

/**
 *
 * @author JhonMario
 */
public class Evaluacion {

    public int NActividad;
    double nota;
    double porcentaje;
    String NombreActividad;

    public Evaluacion(int NActividad, double nota, double porcentaje, String NombreActividad) {
        this.NActividad = NActividad;
        this.nota = nota;
        this.porcentaje = porcentaje;
        this.NombreActividad = NombreActividad;
    }

    public Evaluacion(int Numero) {
        this.NActividad = Numero;
        this.nota = 0;
        this.porcentaje = 0;
    }

    public String getNombreActividad() {
        return NombreActividad;
    }

    public void setNombreActividad(String NombreActividad) {
        this.NombreActividad = NombreActividad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "Evaluacion{" + "NombreActividad=" + NActividad + ", nota=" + nota + ", porcentaje=" + porcentaje + '}';
    }

}
