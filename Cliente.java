package org.example;

public class Cliente extends Persona {
	private String apellido;
	private boolean pasaporte;
	private String correoElectronico;

	public Cliente(int edad, String nombre, String rut, String estadoCivil) {
		super(edad, nombre, rut, estadoCivil);
	}
	public String getApellido() {
		return this.apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreoElectronico() {
		return this.correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public boolean getPasaporte() {
		return this.pasaporte;
	}
	public void setPasaporte(boolean pasaporte) {
		this.pasaporte = pasaporte;
	}
	public String getTipo() {
		return "Cliente";
	}
}