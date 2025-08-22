package co.edu.uniquindio.poo.cafeteria.Model.Servicios;

import co.edu.uniquindio.poo.cafeteria.Model.Repository.DocenteRepository;
import co.edu.uniquindio.poo.cafeteria.Model.Usuario.Docente;
import co.edu.uniquindio.poo.cafeteria.Model.Validacion.DocenteValidacion;

import java.util.List;

public class DocenteServicio {
    private DocenteRepository docenteRepository = new DocenteRepository();
    private DocenteValidacion docenteValidacion = new DocenteValidacion();

    public void agregarDocente(Docente docente) {
        List<Docente> docentes = docenteRepository.getDocentes();
        if (docenteValidacion.validarCedula(docente, docentes)) {
            docenteRepository.agregarDocente(docente);
        } else {
            System.out.println("Error: La cédula es inválida o ya existe un docente con esa cédula.");
        }
    }

    public void eliminarDocente(String Cedula){
        docenteRepository.eliminarDocente(Cedula);

    }

    public void actualizarDocente(Docente docente) {
        List<Docente> docentes = docenteRepository.getDocentes();
        if (docenteValidacion.validarCedula(docente, docentes)) {
            docenteRepository.actualizarDocente(docente);
        } else {
            System.out.println("Error: La cédula es inválida o ya existe un docente con esa cédula.");
        }
    }

    public Docente buscarDocente(String cedula){
        return docenteRepository.buscarDocente(cedula);
    }
}
