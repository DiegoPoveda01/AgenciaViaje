package org.example;

import java.util.ArrayList;
import java.util.List;

public class AgenciaViaje {
	private String nombre;
	private String destinos;
	private int precios;
	private String horarioAtencion;
	private String numeroTelefono;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<AgenteViaje> agentes = new ArrayList<AgenteViaje>();
	private ArrayList<Venta> ventas = new ArrayList<Venta>();

	public AgenciaViaje(String nombre, String destinos, int precios, String horarioAtencion, String numeroTelefono) {
		this.nombre = nombre;
		this.destinos = destinos;
		this.precios = precios;
		this.horarioAtencion = horarioAtencion;
		this.numeroTelefono = numeroTelefono;
		this.clientes = new ArrayList<>();
		this.agentes = new ArrayList<>();
		this.ventas = new ArrayList<>();
	}

	public ArrayList<Venta> getVentas(){return this.ventas;}
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDestinos() {
		return this.destinos;
	}

	public void setDestinos(String destinos) {
		this.destinos = destinos;
	}

	public int getPrecios() {
		return this.precios;
	}

	public void setPrecios(int precios) {
		this.precios = precios;
	}

	public String getHorarioAtencion() {
		return this.horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	public String getNumeroTelefono() {
		return this.numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public void añadirCliente(Cliente cliente) {
		String rutCliente = cliente.getRut();
		if (!buscarCliente(rutCliente)) {
			this.clientes.add(cliente);
			System.out.println("Cliente añadido correctamente.");
		} else {
			System.out.println("El cliente ya existe. No se puede añadir.");
		}
	}


	public void añadirVendedor(AgenteViaje agente) {
		String rutVendedor = agente.getRut();
		if (!buscarVendedor(rutVendedor)){
			agentes.add(agente);
			System.out.println("Vendedor añadido correctamente.");
		} else {
			System.out.println("El vendedor ya está ingresado.No se puede añadir nuevamente");
		}
	}

	public boolean buscarCliente(String rut) {
		for (Cliente cliente : this.clientes) {
			if (cliente.getRut().equals(rut)) {
				return true;
			}
		}
		return false;
	}


	public boolean buscarVendedor(String rut) {
		for (AgenteViaje agente : agentes){
			if (agente.getRut().equals(rut)){
				return true;
			}
		}
		return false;
	}

	public void eliminarVendedor(String rut) {
		AgenteViaje vendedorEncontrado = null;
		for (AgenteViaje agente : agentes) {
			if (agente.getRut().equals(rut)) {
				vendedorEncontrado = agente;
				break;
			}
		}

		if (vendedorEncontrado != null) {
			agentes.remove(vendedorEncontrado);
			System.out.println("Vendedor eliminado correctamente.");
		} else {
			System.out.println("No se encontró un vendedor con el rut especificado.");
		}
	}

	public void generarVenta(Venta venta) {
		this.ventas.add(venta);
	}
	public void cantidadClientes() {
		int cantidadClientes = clientes.size();
		System.out.println("Cantidad de clientes: " + cantidadClientes);
	}
	public void cantidadVendedores() {
		int cantidadVendedores = agentes.size();
		System.out.println("Cantidad de vendedores: " + cantidadVendedores);
	}

	public List<Persona> personasMayores30Años() {
		List<Persona> personasMayores30 = new ArrayList<>();
		for (Cliente cliente : clientes) {
			int edad = cliente.getEdad();
			if (edad > 30) {
				personasMayores30.add(cliente);
			}
		}
		for (AgenteViaje agente : agentes) {
			int edad = agente.getEdad();
			if (edad > 30) {
				personasMayores30.add(agente);
			}
		}
		return personasMayores30;
	}
}
