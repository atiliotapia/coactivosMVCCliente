package com.alfa.consulting.persistencia.entidades;

// Generated 07/05/2012 01:03:00 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CambioHistorialId generated by hbm2java
 */
@Embeddable
public class CambioHistorialId implements java.io.Serializable {

	private int codigoHistorial;
	private int codigoCambio;

	public CambioHistorialId() {
	}

	public CambioHistorialId(int codigoHistorial, int codigoCambio) {
		this.codigoHistorial = codigoHistorial;
		this.codigoCambio = codigoCambio;
	}

	@Column(name = "codigoHistorial", nullable = false)
	public int getCodigoHistorial() {
		return this.codigoHistorial;
	}

	public void setCodigoHistorial(int codigoHistorial) {
		this.codigoHistorial = codigoHistorial;
	}

	@Column(name = "codigoCambio", nullable = false)
	public int getCodigoCambio() {
		return this.codigoCambio;
	}

	public void setCodigoCambio(int codigoCambio) {
		this.codigoCambio = codigoCambio;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CambioHistorialId))
			return false;
		CambioHistorialId castOther = (CambioHistorialId) other;

		return (this.getCodigoHistorial() == castOther.getCodigoHistorial())
				&& (this.getCodigoCambio() == castOther.getCodigoCambio());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoHistorial();
		result = 37 * result + this.getCodigoCambio();
		return result;
	}

}
