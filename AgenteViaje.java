package org.example;

public class AgenteViaje extends Persona {
	private String numeroCelular;
	private String apellido;

	public AgenteViaje(int edad, String nombre, String rut, String estadoCivil) {
		super(edad, nombre, rut, estadoCivil);
	}


	public String getNumeroCelular() {
		return this.numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTipo() {
		return "Agente de Viaje";
	}
}