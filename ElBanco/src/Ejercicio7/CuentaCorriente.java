package Ejercicio7;

public class CuentaCorriente extends CuentaBancaria {
	
	private String listaEntidades;

	public CuentaCorriente(Persona titular, double saldo, String iBAN, String listaEntidades) {
		super(titular, saldo, iBAN);
		this.listaEntidades = listaEntidades;
	}

	public String getListaEntidades() {
		return listaEntidades;
	}

	public void setListaEntidades(String listaEntidades) {
		this.listaEntidades = listaEntidades;
	}

	@Override
	public String devolverInfoString() {
		
		return super.devolverInfoString()+ "Lista Entidades"+ this.getListaEntidades();
	}
	
	

}
