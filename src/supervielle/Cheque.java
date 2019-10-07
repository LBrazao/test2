package supervielle;

public class Cheque {
	
	protected String firmante;
	protected Double monto;
	protected Integer plazo;
	protected Integer id;
	
	public String getFirmante() {
		return firmante;
	}
	public void setFirmante(String firmante) {
		this.firmante = firmante;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public Integer getPlazo() {
		return plazo;
	}
	public void setPlazo(Integer plazo) {
		this.plazo = plazo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}		
}