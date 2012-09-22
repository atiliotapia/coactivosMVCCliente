package com.alfa.consulting.persistencia.entidades;

// Generated 07/05/2012 01:03:00 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SolicitudResponsableId generated by hbm2java
 */
@Embeddable
public class SolicitudResponsableId implements java.io.Serializable {

	private int codigoSolicitud;
	private int codigoSolicitudResponsable;
	private int codigoUsuario;
	private int codigoTecnico;

	public SolicitudResponsableId() {
	}

	public SolicitudResponsableId(int codigoSolicitud,
			int codigoSolicitudResponsable, int codigoUsuario, int codigoTecnico) {
		this.codigoSolicitud = codigoSolicitud;
		this.codigoSolicitudResponsable = codigoSolicitudResponsable;
		this.codigoUsuario = codigoUsuario;
		this.codigoTecnico = codigoTecnico;
	}

	@Column(name = "codigoSolicitud", nullable = false)
	public int getCodigoSolicitud() {
		return this.codigoSolicitud;
	}

	public void setCodigoSolicitud(int codigoSolicitud) {
		this.codigoSolicitud = codigoSolicitud;
	}

	@Column(name = "codigoSolicitudResponsable", nullable = false)
	public int getCodigoSolicitudResponsable() {
		return this.codigoSolicitudResponsable;
	}

	public void setCodigoSolicitudResponsable(int codigoSolicitudResponsable) {
		this.codigoSolicitudResponsable = codigoSolicitudResponsable;
	}

	@Column(name = "codigoUsuario", nullable = false)
	public int getCodigoUsuario() {
		return this.codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	@Column(name = "codigoTecnico", nullable = false)
	public int getCodigoTecnico() {
		return this.codigoTecnico;
	}

	public void setCodigoTecnico(int codigoTecnico) {
		this.codigoTecnico = codigoTecnico;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SolicitudResponsableId))
			return false;
		SolicitudResponsableId castOther = (SolicitudResponsableId) other;

		return (this.getCodigoSolicitud() == castOther.getCodigoSolicitud())
				&& (this.getCodigoSolicitudResponsable() == castOther
						.getCodigoSolicitudResponsable())
				&& (this.getCodigoUsuario() == castOther.getCodigoUsuario())
				&& (this.getCodigoTecnico() == castOther.getCodigoTecnico());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoSolicitud();
		result = 37 * result + this.getCodigoSolicitudResponsable();
		result = 37 * result + this.getCodigoUsuario();
		result = 37 * result + this.getCodigoTecnico();
		return result;
	}

}