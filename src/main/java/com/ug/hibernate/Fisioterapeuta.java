package com.ug.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "fisioterapeutas")
public class Fisioterapeuta {
	
	@Id
	@Column(name = "fisioterapeuta_id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String cedula;
	private String nombres;
	private String direccion;
	private String telefono;
	private boolean estado;
	
	public Fisioterapeuta() {}
	
	public Fisioterapeuta(long id, String cedula, String nombres, String direccion, String telefono,
			boolean estado) {
		this.id = id;
		this.cedula = cedula;
		this.nombres = nombres;
		this.direccion = direccion;
		this.telefono = telefono;
		this.estado = estado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void imprimir() {
		System.out.println("Codigo: " + id);
		System.out.println("Fisioterapeuta: " + nombres);
	}
	
	
	

}
