package com.clearminds.dzh.bdd.test;

import com.clearminds.dzh.dtos.Estudiante;
import com.clearminds.dzh.excepciones.BDDException;
import com.clearminds.dzh.servicios.ServicioEstudiante;

public class TestServicio {

	public static void main(String[] args) {
		
		ServicioEstudiante srvEstudiante=new ServicioEstudiante();
		try {
			srvEstudiante.insertEstudiante(new Estudiante("Marco","Chavez"));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}

	}

}
