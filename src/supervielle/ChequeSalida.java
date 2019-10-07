package supervielle;

public class ChequeSalida {
	
	protected Integer id;
	protected CodigoDescripcion estado;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public CodigoDescripcion getEstado() {
		return estado;
	}
	public void setEstado(CodigoDescripcion estado) {
		this.estado = estado;
	}
	public ChequeSalida(Integer id,
			CodigoDescripcion estado) {
		super();
		this.id = id;
		this.estado = estado;
	}	
}