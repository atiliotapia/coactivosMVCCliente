package com.alfa.consulting.persistencia.entidades;

// Generated 07/05/2012 01:03:00 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OpcionId generated by hbm2java
 */
@Embeddable
public class OpcionId implements java.io.Serializable {

	private int codigoOpcion;
	private int codigoCategoriaOpcion;
	private int codigoIdioma;

	public OpcionId() {
	}

	public OpcionId(int codigoOpcion, int codigoCategoriaOpcion,
			int codigoIdioma) {
		this.codigoOpcion = codigoOpcion;
		this.codigoCategoriaOpcion = codigoCategoriaOpcion;
		this.codigoIdioma = codigoIdioma;
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
		if (!(other instanceof OpcionId))
			return false;
		OpcionId castOther = (OpcionId) other;

		return (this.getCodigoOpcion() == castOther.getCodigoOpcion())
				&& (this.getCodigoCategoriaOpcion() == castOther
						.getCodigoCategoriaOpcion())
				&& (this.getCodigoIdioma() == castOther.getCodigoIdioma());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoOpcion();
		result = 37 * result + this.getCodigoCategoriaOpcion();
		result = 37 * result + this.getCodigoIdioma();
		return result;
	}

}
