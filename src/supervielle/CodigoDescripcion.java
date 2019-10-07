package supervielle;

public class CodigoDescripcion {
	
	protected Integer codigo;
	protected String descripcion;	
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public CodigoDescripcion(Integer codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	
	public CodigoDescripcion() {
		super();
		this.codigo = 0;
		this.descripcion = "";
	}
}
