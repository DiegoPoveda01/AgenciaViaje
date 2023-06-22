package org.example;

public class Venta {
	private String cliente;
	private String agenteViaje;
	private CiudadDestino ciudad;
	public Venta(String cliente, String agenteViaje, CiudadDestino ciudad){
		this.cliente = cliente;
		this.agenteViaje = agenteViaje;
		this.ciudad = ciudad;
	}

	public String getCliente() {
		return this.cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getAgenteViaje() {
		return this.agenteViaje;
	}

	public void setAgenteViaje(String agenteViaje) {
		this.agenteViaje = agenteViaje;
	}
	public CiudadDestino getCiudad(){
		return this.ciudad;
	}
	public void setCiudad(CiudadDestino ciudad){
		this.ciudad = ciudad;
	}
}