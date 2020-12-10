package com.clearminds.dzh.servicios;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.clearminds.dzh.dtos.Estudiante;
import com.clearminds.dzh.excepciones.BDDException;
import com.clearminds.dzh.utils.DateUtils;

public class ServicioEstudiante extends ServicioBase {

	public void insertEstudiante(Estudiante estudiante) throws BDDException {
         Date date=new Date();
         String fecha=DateUtils.obtenerFecha(date);
		abrirConexion();
		System.out.println("Insertando Estudiante");
		System.out.println(estudiante);

		Statement stmt = null;

		try {
			stmt = getConexion().createStatement();
			String sql = "insert into estudiantes(nombre,apellido,edad,fecha_modificacion) values('" + estudiante.getNombre() + "','"
					+ estudiante.getApellido() + "','" + estudiante.getEdad()  + "','" + fecha + "')";
			System.out.println("Script: " + sql);

			stmt.executeUpdate(sql);

			cerrarConexion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}

	}

	public void actualizarEstudiante(Estudiante estudiante) throws BDDException {
	    Date date=new Date();
        String fecha=DateUtils.obtenerFecha(date);
		abrirConexion();
		System.out.println("Actualizando Estudiante");
		System.out.println(estudiante);

		Statement stmt = null;

		try {
			stmt = getConexion().createStatement();
			String sql = "update estudiantes set nombre='" + estudiante.getNombre() + "', apellido='"
					+ estudiante.getApellido() + "', edad='" + estudiante.getEdad()  + "', fecha_modificacion='" + fecha+ "' where id="
					+ estudiante.getId();
			System.out.println("Script: " + sql);

			stmt.executeUpdate(sql);

			cerrarConexion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BDDException("Error al actualizar el  estudiante");
		}

	}

}
