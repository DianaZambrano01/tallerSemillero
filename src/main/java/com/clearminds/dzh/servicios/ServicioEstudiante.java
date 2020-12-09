package com.clearminds.dzh.servicios;

import com.clearminds.dzh.dtos.Estudiante;
import com.clearminds.dzh.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {

	public void insertEstudiante(Estudiante estudiante) throws BDDException {

		abrirConexion();
		System.out.println("Insertando Estudiante");
		System.out.println(estudiante);
		cerrarConexion();

	}

}
