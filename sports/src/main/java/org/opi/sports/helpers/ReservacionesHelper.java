package org.opi.sports.helpers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.opi.sports.pojo.CalendarioPOJO;
import org.opi.sports.pojo.ReservacionesPOJO;


/**
 * Fecha: 12-07-2015 version 1.0
 * 
 * @author Mauricio Fernández Mora.
 *
 *Sprint 01 Descripción:Esta clase sirve de apoyo a la clase de ReservacionesController
 *y contiene la lógica necesaria para serializar las reservaciones y poder mostrarlas en el front end
 *Esta clase se implementa como "Singleton" para asegurarnos que sea instanciada una sola vez.
 */

public class ReservacionesHelper {

	private static ReservacionesHelper instance;

	private ReservacionesHelper() {
	}

	private synchronized static void createInstance() {
		if (instance == null) {
			instance = new ReservacionesHelper();
		}
	}

	public static ReservacionesHelper getInstance() {
		if (instance == null) {
			createInstance();
		}
		return instance;
	}



	/**
	 *Este método serializa cada uno de los atributos de "Reservaciones" 
	 *para poder utilizarlos en el front end como un JSON
	 */
	public List<CalendarioPOJO> calendarioSerializer(
			List<ReservacionesPOJO> listaReservacionesView) {

		List<CalendarioPOJO> listaReservaciones = new ArrayList<CalendarioPOJO>();
		
		for (ReservacionesPOJO reservacionView : listaReservacionesView) {
			CalendarioPOJO reservaciones = new CalendarioPOJO();
			
			SimpleDateFormat convertirHora = new SimpleDateFormat("HH:mm");
			SimpleDateFormat convertirFecha = new SimpleDateFormat("dd-MM-yyyy");
			DateTimeFormatter convertirFechaHora = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm");
			
			Calendar sumarHora = Calendar.getInstance();
			sumarHora.setTime(reservacionView.getHora());
			sumarHora.add(Calendar.HOUR_OF_DAY,1);
			
			DateTime startTime = new DateTime();
			DateTime endTime = new DateTime();
			
			startTime = convertirFechaHora.parseDateTime(convertirFecha.format(reservacionView.getFecha()) + " " + convertirHora.format(reservacionView.getHora().getTime()));
			endTime = convertirFechaHora.parseDateTime(convertirFecha.format(reservacionView.getFecha()) + " " + convertirHora.format(sumarHora.getTime()));
			
			
			reservaciones.setTitle("Cancha Sintetica #5");
			reservaciones.setStart(startTime);
			reservaciones.setEnd(endTime);
			reservaciones.setBackgroundColor("#f56954");
			reservaciones.setBorderColor("#f56954");
			
			listaReservaciones.add(reservaciones);
		}

		return listaReservaciones;
	}

}