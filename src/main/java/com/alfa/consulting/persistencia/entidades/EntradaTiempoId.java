package com.alfa.consulting.persistencia.entidades;

// Generated 07/05/2012 01:03:00 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EntradaTiempoId generated by hbm2java
 */
@Embeddable
public class EntradaTiempoId implements java.io.Serializable {

	private int codigoEntradaTiempo;
	private int codigoSolicitud;
	private int codigoUsuario;
	private int codigoTecnico;

	public EntradaTiempoId() {
	}

	public EntradaTiempoId(int codigoEntradaTiempo, int codigoSolicitud,
			int codigoUsuario, int codigoTecnico) {
		this.codigoEntradaTiempo = codigoEntradaTiempo;
		this.codigoSolicitud = codigoSolicitud;
		this.codigoUsuario = codigoUsuario;
		this.codigoTecnico = codigoTecnico;
	}

	@Column(name = "codigoEntradaTiempo", nullable = false)
	public int getCodigoEntradaTiempo() {
		return this.codigoEntradaTiempo;
	}

	public void setCodigoEntradaTiempo(int codigoEntradaTiempo) {
		this.codigoEntradaTiempo = codigoEntradaTiempo;
	}

	@Column(name = "codigoSolicitud", nullable = false)
	public int getCodigoSolicitud() {
		return this.codigoSolicitud;
	}

	public void setCodigoSolicitud(int codigoSolicitud) {
		this.codigoSolicitud = codigoSolicitud;
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
		if (!(other instanceof EntradaTiempoId))
			return false;
		EntradaTiempoId castOther = (EntradaTiempoId) other;

		return (this.getCodigoEntradaTiempo() == castOther
				.getCodigoEntradaTiempo())
				&& (this.getCodigoSolicitud() == castOther.getCodigoSolicitud())
				&& (this.getCodigoUsuario() == castOther.getCodigoUsuario())
				&& (this.getCodigoTecnico() == castOther.getCodigoTecnico());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoEntradaTiempo();
		result = 37 * result + this.getCodigoSolicitud();
		result = 37 * result + this.getCodigoUsuario();
		result = 37 * result + this.getCodigoTecnico();
		return result;
	}

}