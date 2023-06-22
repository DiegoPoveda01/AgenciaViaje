package org.example;

public class CiudadDestino {
	private int precio;
	private String nombre;
	public CiudadDestino(int precio, String nombre){
		this.precio = precio;
		this.nombre = nombre;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}