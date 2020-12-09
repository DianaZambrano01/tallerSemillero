package com.clearminds.dzh.bdd;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.clearminds.dzh.excepciones.BDDException;

public class ConexionBDD {

	public static String leerPropiedad(String nombrePropiedad) {
		Properties p = new Properties();
		String respuesta = null;

		try {
			File f = new File("conexion.properties");
			System.out.println("ruta: " + f.getAbsolutePath());
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

	public static Connection obtenerConexion() throws BDDException {
		Connection conn = null;
		String url = leerPropiedad("urlConexion");
		String password = leerPropiedad("password");
		String usuario = leerPropiedad("usuario");
		System.out.println(url);
		System.out.println(password);
		System.out.println(usuario);
		try {
			conn = DriverManager.getConnection(url, usuario, password);
		} catch (Exception e) {

			// e.printStackTrace();
			throw new BDDException("No se pudo conectar a la base de datos");

		} /*
			 * finally { try { if(conn!=null){ conn.close(); } } catch
			 * (SQLException e) {
			 * 
			 * // e.printStackTrace(); throw new
			 * BDDException("No se pudo conectar a la base de datos");
			 * 
			 * } }
			 */ // No se necesita cerrar la conexión en el finally ya que se esta
				// controlando el cierre de la sesion en ServicioEstudiante

		return conn;
	}

}
