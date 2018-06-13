package archivo;

import Objetos.Docente;
import Objetos.Estudiante;
import Objetos.Evaluacion;
import Objetos.Grupo;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Archivo {

    public static void guardar(List<Docente> listaDocentes) throws IOException {

        String DatosDocente = "";
        String DatosGrupo = "";
        String DatosEstudiante = "";
        String DatosNotas = "";

        //El archivo se guarda en el folder actual, donde esta el programa
        File directorio = new File(".");
        File file = new File(directorio, "Docente.txt");

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i = 0; i < listaDocentes.size(); i++) {
            Docente c = listaDocentes.get(i);
            DatosDocente = (c.getIDDocente() + "$" + c.getUsuario() + "$" + c.getNombre());

            for (int j = 0; j < c.getListaClase().size(); j++) {
                Grupo g = c.getListaClase().get(j);
                DatosGrupo = (g.getNombreClase() + "$" + g.getDocente());

                for (int k = 0; k < g.getListaEstudiantes().size(); k++) {
                    Estudiante e = g.getListaEstudiantes().get(k);
                    DatosEstudiante = (e.getID() + "$" + e.getUsuario() + "$" + e.getNombre());

                    for (int l = 0; l < e.getListaNotas().size(); l++) {
                        Evaluacion ev = e.getListaNotas().get(l);
                        DatosNotas = (ev.NActividad + "$" + ev.getNota() + "$" + ev.getPorcentaje() + "$" + ev.getNombreActividad());

                        bufferedWriter.write("1" + "\n");

                        bufferedWriter.write(DatosNotas + "\n");
                    }
                    bufferedWriter.write("90" + "\n");
                    bufferedWriter.write("2" + "\n");
                    bufferedWriter.write(DatosEstudiante + "\n");
                    bufferedWriter.write("#" + "\n");
                }
                bufferedWriter.write("3" + "\n");
                bufferedWriter.write(DatosGrupo + "\n");
                bufferedWriter.write("@" + "\n");
            }
            bufferedWriter.write("4" + "\n");
            bufferedWriter.write(DatosDocente + "\n" + "69" + "\n");
        }
        bufferedWriter.close();

    }

    public static List<Docente> leer() throws FileNotFoundException, IOException {
        List<Grupo> listaClase = new ArrayList<>();
        List<Evaluacion> listaNotas = new ArrayList<>();
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        List<Docente> listaDocentes = new ArrayList<>();

        //El archivo se guarda en el folder actual, donde esta el programa
        File directorio = new File(".");
        File file = new File(directorio, "Docente.txt");

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linea = "x";
        // El método readLine retorna null cuando se alcanza el final del archivo
        while (linea != null) {
            linea = bufferedReader.readLine();
            if(linea==null){
                return listaDocentes;
            }
            switch (linea) {
                case "1":
                    while (!(linea.trim().contains("90"))) {
                        linea = bufferedReader.readLine();
                        String[] vectorNota = linea.split("[$]");

                        int NActividad = Integer.parseInt(vectorNota[0]);
                        double nota = Double.parseDouble(vectorNota[1]);
                        double porcentaje = Double.parseDouble(vectorNota[2]);
                        String nombre = vectorNota[3];

                        Evaluacion ev = new Evaluacion(NActividad, nota, porcentaje, nombre);

                        listaNotas.add(ev);

                        linea = bufferedReader.readLine();

                    }
                    break;
                case "2":
                    while (!(linea.trim().contains("#"))) {
                        linea = bufferedReader.readLine();

                        String[] vectorEstudiante = linea.split("[$]");

                        int IDEstud = Integer.parseInt(vectorEstudiante[0]);
                        String usuario = vectorEstudiante[1];
                        String nombre = vectorEstudiante[2];

                        Estudiante e = new Estudiante(IDEstud, usuario, nombre, listaNotas);

                        listaNotas.clear();

                        listaEstudiantes.add(e);

                        linea = bufferedReader.readLine();
                    }
                    break;
                case "3":
                    while (!(linea.trim().contains("@"))) {
                        linea = bufferedReader.readLine();
                        String[] vectorGrupo = linea.split("[$]");

                        String Clase = vectorGrupo[0];
                        String NMaestro = vectorGrupo[1];

                        Grupo g = new Grupo(Clase, NMaestro, listaEstudiantes);

                        listaEstudiantes.clear();

                        listaClase.add(g);

                        linea = bufferedReader.readLine();
                    }
                    break;
                case "4":
                    while (!(linea.trim().contains("69"))) {
                        linea = bufferedReader.readLine();

                        String[] vectorDocente = linea.split("[$]");

                        int IDDocen = Integer.parseInt(vectorDocente[0]);
                        String usuario = vectorDocente[1];
                        String nombre = vectorDocente[2];

                        Docente D = new Docente(IDDocen, usuario, nombre, listaClase);

                        listaClase.clear();

                        listaDocentes.add(D);

                        // lee la siguiente línea del archivo
                        linea = bufferedReader.readLine();
                    }
                    break;
                default:
                    linea = bufferedReader.readLine();
                    break;
            }
        }
        return listaDocentes;
    }
}
