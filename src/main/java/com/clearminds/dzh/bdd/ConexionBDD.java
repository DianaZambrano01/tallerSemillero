package com.clearminds.dzh.bdd;

import java.io.FileReader;
import java.util.Properties;

public class ConexionBDD {

	public static String leerPropiedad(String nombrePropiedad) {
		Properties p = new Properties();
		String respuesta = null;

		try {
			p.load(new FileReader("conexion.properties"));
			if (p.getProperty(nombrePropiedad) != null) {
				respuesta = p.getProperty(nombrePropiedad);

			}

		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}

		return respuesta;

	}

}
