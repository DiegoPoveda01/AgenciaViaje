package org.example;

public abstract class Persona {
	protected int edad;
	protected String nombre;
	protected String rut;
	protected String estadoCivil;
	public Persona(int edad, String nombre, String rut, String estadoCivil){
		this.edad = edad;
		this.nombre = nombre;
		this.rut = rut;
		this.estadoCivil = estadoCivil;
	}
    public int getEdad(){return this.edad;}
	public void setEdad(int edad){this.edad = edad;}
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public abstract String getTipo();
}