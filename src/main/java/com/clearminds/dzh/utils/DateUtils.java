package com.clearminds.dzh.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	public static final String FORMATO_COMPLETO = "yyyy-MM-dd HH:mm:ss";

	public static String obtenerFecha(Date date) {
		SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_COMPLETO);
		String texto = formateador.format(date);
		return texto;

	}

}
