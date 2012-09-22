package com.alfa.consulting.persistencia.entidades;

// Generated 07/05/2012 01:03:00 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ElementoRecienteId generated by hbm2java
 */
@Embeddable
public class ElementoRecienteId implements java.io.Serializable {

	private int codigoElementoReciente;
	private int codigoUsuario;
	private int codigoOpcion;
	private int codigoCategoriaOpcion;
	private int codigoIdioma;

	public ElementoRecienteId() {
	}

	public ElementoRecienteId(int codigoElementoReciente, int codigoUsuario,
			int codigoOpcion, int codigoCategoriaOpcion, int codigoIdioma) {
		this.codigoElementoReciente = codigoElementoReciente;
		this.codigoUsuario = codigoUsuario;
		this.codigoOpcion = codigoOpcion;
		this.codigoCategoriaOpcion = codigoCategoriaOpcion;
		this.codigoIdioma = codigoIdioma;
	}

	@Column(name = "codigoElementoReciente", nullable = false)
	public int getCodigoElementoReciente() {
		return this.codigoElementoReciente;
	}

	public void setCodigoElementoReciente(int codigoElementoReciente) {
		this.codigoElementoReciente = codigoElementoReciente;
	}

	@Column(name = "codigoUsuario", nullable = false)
	public int getCodigoUsuario() {
		return this.codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	@Column(name = "codigoOpcion", nullable = false)
	public int getCodigoOpcion() {
		return this.codigoOpcion;
	}

	public void setCodigoOpcion(int codigoOpcion) {
		this.codigoOpcion = codigoOpcion;
	}

	@Column(name = "codigoCategoriaOpcion", nullable = false)
	public int getCodigoCategoriaOpcion() {
		return this.codigoCategoriaOpcion;
	}

	public void setCodigoCategoriaOpcion(int codigoCategoriaOpcion) {
		this.codigoCategoriaOpcion = codigoCategoriaOpcion;
	}

	@Column(name = "codigoIdioma", nullable = false)
	public int getCodigoIdioma() {
		return this.codigoIdioma;
	}

	public void setCodigoIdioma(int codigoIdioma) {
		this.codigoIdioma = codigoIdioma;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ElementoRecienteId))
			return false;
		ElementoRecienteId castOther = (ElementoRecienteId) other;

		return (this.getCodigoElementoReciente() == castOther
				.getCodigoElementoReciente())
				&& (this.getCodigoUsuario() == castOther.getCodigoUsuario())
				&& (this.getCodigoOpcion() == castOther.getCodigoOpcion())
				&& (this.getCodigoCategoriaOpcion() == castOther
						.getCodigoCategoriaOpcion())
				&& (this.getCodigoIdioma() == castOther.getCodigoIdioma());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoElementoReciente();
		result = 37 * result + this.getCodigoUsuario();
		result = 37 * result + this.getCodigoOpcion();
		result = 37 * result + this.getCodigoCategoriaOpcion();
		result = 37 * result + this.getCodigoIdioma();
		return result;
	}

}