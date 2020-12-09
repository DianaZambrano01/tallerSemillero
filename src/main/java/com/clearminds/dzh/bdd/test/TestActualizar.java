package com.clearminds.dzh.bdd.test;

import com.clearminds.dzh.dtos.Estudiante;
import com.clearminds.dzh.excepciones.BDDException;
import com.clearminds.dzh.servicios.ServicioEstudiante;

public class TestActualizar {

	public static void main(String[] args) {
		ServicioEstudiante srvServicioEstudiante = new ServicioEstudiante();
		try {
			srvServicioEstudiante.actualizarEstudiante(new Estudiante("Pedro", "Navaja", 2));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

}
