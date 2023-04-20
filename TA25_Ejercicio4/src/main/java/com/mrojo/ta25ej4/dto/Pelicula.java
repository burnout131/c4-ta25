/**
 * 
 */
package com.mrojo.ta25ej4.dto;

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
@Table(name = "peliculas")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;

	@Column(name = "calificacion_edad")
	private int calificacionEdad;

	@OneToMany
	@JoinColumn(name = "FK_pelicula")
	private List<Sala> salas;

	// Constructors
	public Pelicula() {
	}

	public Pelicula(Long id, String nombre, int calificacionEdad) {
		this.id = id;
		this.nombre = nombre;
		this.calificacionEdad = calificacionEdad;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the calificacionEdad
	 */
	public int getCalificacionEdad() {
		return calificacionEdad;
	}

	/**
	 * @param calificacionEdad the calificacionEdad to set
	 */
	public void setCalificacionEdad(int calificacionEdad) {
		this.calificacionEdad = calificacionEdad;
	}

	/**
	 * @return the salas
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Sala> getSalas() {
		return salas;
	}

	/**
	 * @param salas the salas to set
	 */
	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}

}
