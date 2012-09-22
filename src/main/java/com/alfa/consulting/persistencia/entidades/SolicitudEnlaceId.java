package com.alfa.consulting.persistencia.entidades;

// Generated 07/05/2012 01:03:00 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SolicitudEnlaceId generated by hbm2java
 */
@Embeddable
public class SolicitudEnlaceId implements java.io.Serializable {

	private int codigoSolicitud;
	private int codigoUsuario;
	private int codigoSolicitudEnlazada;
	private int codigoUsuarioEnlazado;

	public SolicitudEnlaceId() {
	}

	public SolicitudEnlaceId(int codigoSolicitud, int codigoUsuario,
			int codigoSolicitudEnlazada, int codigoUsuarioEnlazado) {
		this.codigoSolicitud = codigoSolicitud;
		this.codigoUsuario = codigoUsuario;
		this.codigoSolicitudEnlazada = codigoSolicitudEnlazada;
		this.codigoUsuarioEnlazado = codigoUsuarioEnlazado;
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

	@Column(name = "codigoSolicitudEnlazada", nullable = false)
	public int getCodigoSolicitudEnlazada() {
		return this.codigoSolicitudEnlazada;
	}

	public void setCodigoSolicitudEnlazada(int codigoSolicitudEnlazada) {
		this.codigoSolicitudEnlazada = codigoSolicitudEnlazada;
	}

	@Column(name = "codigoUsuarioEnlazado", nullable = false)
	public int getCodigoUsuarioEnlazado() {
		return this.codigoUsuarioEnlazado;
	}

	public void setCodigoUsuarioEnlazado(int codigoUsuarioEnlazado) {
		this.codigoUsuarioEnlazado = codigoUsuarioEnlazado;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SolicitudEnlaceId))
			return false;
		SolicitudEnlaceId castOther = (SolicitudEnlaceId) other;

		return (this.getCodigoSolicitud() == castOther.getCodigoSolicitud())
				&& (this.getCodigoUsuario() == castOther.getCodigoUsuario())
				&& (this.getCodigoSolicitudEnlazada() == castOther
						.getCodigoSolicitudEnlazada())
				&& (this.getCodigoUsuarioEnlazado() == castOther
						.getCodigoUsuarioEnlazado());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoSolicitud();
		result = 37 * result + this.getCodigoUsuario();
		result = 37 * result + this.getCodigoSolicitudEnlazada();
		result = 37 * result + this.getCodigoUsuarioEnlazado();
		return result;
	}

}