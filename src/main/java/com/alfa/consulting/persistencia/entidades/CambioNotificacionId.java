package com.alfa.consulting.persistencia.entidades;

// Generated 07/05/2012 01:03:00 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CambioNotificacionId generated by hbm2java
 */
@Embeddable
public class CambioNotificacionId implements java.io.Serializable {

	private int codigoNotificacion;
	private int codigoCambio;

	public CambioNotificacionId() {
	}

	public CambioNotificacionId(int codigoNotificacion, int codigoCambio) {
		this.codigoNotificacion = codigoNotificacion;
		this.codigoCambio = codigoCambio;
	}

	@Column(name = "codigoNotificacion", nullable = false)
	public int getCodigoNotificacion() {
		return this.codigoNotificacion;
	}

	public void setCodigoNotificacion(int codigoNotificacion) {
		this.codigoNotificacion = codigoNotificacion;
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
		if (!(other instanceof CambioNotificacionId))
			return false;
		CambioNotificacionId castOther = (CambioNotificacionId) other;

		return (this.getCodigoNotificacion() == castOther
				.getCodigoNotificacion())
				&& (this.getCodigoCambio() == castOther.getCodigoCambio());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoNotificacion();
		result = 37 * result + this.getCodigoCambio();
		return result;
	}

}
