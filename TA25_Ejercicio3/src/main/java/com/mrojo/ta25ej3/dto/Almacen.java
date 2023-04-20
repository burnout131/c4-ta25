/**
 * 
 */
package com.mrojo.ta25ej3.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author Marc
 *
 */
@Entity
@Table(name = "almacenes")
public class Almacen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "lugar")
	private String lugar;
	
	@Column(name = "capacidad")
	private int capacidad;

	@OneToMany
	@JoinColumn(name = "FK_almacen")
	private List<Caja> caja;

	/**
	 * 
	 */
	public Almacen() {
	}

	/**
	 * @param id
	 * @param lugar
	 * @param capacidad
	 * @param caja
	 */
	public Almacen(Long id, String lugar, int capacidad, List<Caja> caja) {
		this.id = id;
		this.lugar = lugar;
		this.capacidad = capacidad;
		this.caja = caja;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	/**
	 * @return the caja
	 */
	public List<Caja> getCaja() {
		return caja;
	}

	/**
	 * @param caja the caja to set
	 */
	public void setCaja(List<Caja> caja) {
		this.caja = caja;
	}

	

}
