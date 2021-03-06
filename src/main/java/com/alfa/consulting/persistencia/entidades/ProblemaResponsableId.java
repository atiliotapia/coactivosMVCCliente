package com.alfa.consulting.persistencia.entidades;

// Generated 07/05/2012 01:03:00 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProblemaResponsableId generated by hbm2java
 */
@Embeddable
public class ProblemaResponsableId implements java.io.Serializable {

	private int codigoProblema;
	private int codigoTecnico;
	private int codigoResponsable;

	public ProblemaResponsableId() {
	}

	public ProblemaResponsableId(int codigoProblema, int codigoTecnico,
			int codigoResponsable) {
		this.codigoProblema = codigoProblema;
		this.codigoTecnico = codigoTecnico;
		this.codigoResponsable = codigoResponsable;
	}

	@Column(name = "codigoProblema", nullable = false)
	public int getCodigoProblema() {
		return this.codigoProblema;
	}

	public void setCodigoProblema(int codigoProblema) {
		this.codigoProblema = codigoProblema;
	}

	@Column(name = "codigoTecnico", nullable = false)
	public int getCodigoTecnico() {
		return this.codigoTecnico;
	}

	public void setCodigoTecnico(int codigoTecnico) {
		this.codigoTecnico = codigoTecnico;
	}

	@Column(name = "codigoResponsable", nullable = false)
	public int getCodigoResponsable() {
		return this.codigoResponsable;
	}

	public void setCodigoResponsable(int codigoResponsable) {
		this.codigoResponsable = codigoResponsable;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProblemaResponsableId))
			return false;
		ProblemaResponsableId castOther = (ProblemaResponsableId) other;

		return (this.getCodigoProblema() == castOther.getCodigoProblema())
				&& (this.getCodigoTecnico() == castOther.getCodigoTecnico())
				&& (this.getCodigoResponsable() == castOther
						.getCodigoResponsable());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoProblema();
		result = 37 * result + this.getCodigoTecnico();
		result = 37 * result + this.getCodigoResponsable();
		return result;
	}

}
