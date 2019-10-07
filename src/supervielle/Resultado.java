package supervielle;

import java.util.Vector;


public class Resultado {
	
	protected Vector<ChequeSalida> cheque;
	protected CodigoDescripcion estado;
	protected Vector<Control> control;
	
	public Vector<ChequeSalida> getCheque() {
		return cheque;
	}
	public void setCheque(Vector<ChequeSalida> cheque) {
		this.cheque = cheque;
	}

	public CodigoDescripcion getEstado() {
		return estado;
	}
	public void setEstado(CodigoDescripcion estado) {
		this.estado = estado;
	}
	public Vector<Control> getControl() {
		return control;
	}
	public void setControl(Vector<Control> control) {
		this.control = control;
	}	
	
}
