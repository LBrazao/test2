package supervielle;

import ilog.rules.bom.annotations.BusinessName;

import java.util.Date;

public class Util {

	private static int getCalcularCantidadDiasAHoy;

	private Util() {}

	public Util(
			@BusinessName("getCalcularCantidadDiasAHoy") int getCalcularCantidadDiasAHoy) {
		this();
		Util.getCalcularCantidadDiasAHoy = getCalcularCantidadDiasAHoy;
	}

	public static int getCalcularCantidadDiasAHoy(Date fecha) {

		Date fechaHoy = new Date();

		long hoy = fechaHoy.getTime();
		long fechaNueva = fecha.getTime();
		long diffTime = hoy - fechaNueva;
		long diffDays = diffTime / (1000 * 60 * 60 * 24);

		getCalcularCantidadDiasAHoy = (int) diffDays;
		return getCalcularCantidadDiasAHoy;
	}
}
