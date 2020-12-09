package com.clearminds.dzh.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.dzh.bdd.ConexionBDD;
import com.clearminds.dzh.excepciones.BDDException;

public class ServicioBase {
	private Connection conexion;
	
	

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	public void abrirConexion() throws BDDException {
		conexion = ConexionBDD.obtenerConexion();

	}

	public void cerrarConexion() throws BDDException {
		try {
			if (conexion != null) {
				conexion.close();
				System.out.println("Conexion Cerrada");
			}

		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("Error al cerrar conexion");
		}

	}

}
