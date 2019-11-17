package com.ug.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "tiposterapias")
public class TipoTerapia {
	
	@Id
	@Column(name = "tipo_terapia_id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String descripcion;
	private boolean estado;
	
	public TipoTerapia() {}
	
	public TipoTerapia(long id, String descripcion, boolean estado) {
		this.id = id;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public long getId() {
		return id;
	}

	public void setId(long tipoTerapiaID) {
		this.id = tipoTerapiaID;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	public void imprimir() {
		System.out.println("Codigo: " + id);
		System.out.println("Tipo de Terapia: " + descripcion);
	}
	

}
