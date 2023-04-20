/**
 * 
 */
package com.mrojo.ta25ej3.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author Marc
 *
 */
@Entity
@Table(name = "cajas")
public class Caja {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "contenido")
	private String contenido;

	@Column(name = "valor")
	private int valor;

	@ManyToOne()
	@JoinColumn(name = "almacen")
	private Almacen almacen;

	/**
	 * 
	 */
	public Caja() {
	}

	/**
	 * @param id
	 * @param contenido
	 * @param valor
	 * @param almacen
	 */
	public Caja(Long id, String contenido, int valor, Almacen almacen) {
		this.id = id;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
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
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * @return the almacen
	 */
	public Almacen getAlmacen() {
		return almacen;
	}

	/**
	 * @param almacen the almacen to set
	 */
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	
}
