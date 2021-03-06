package com.alfa.consulting.persistencia.entidades;

// Generated 07/05/2012 01:03:00 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProblemaCierreId generated by hbm2java
 */
@Embeddable
public class ProblemaCierreId implements java.io.Serializable {

	private int codigoCierre;
	private int codigoProblema;

	public ProblemaCierreId() {
	}

	public ProblemaCierreId(int codigoCierre, int codigoProblema) {
		this.codigoCierre = codigoCierre;
		this.codigoProblema = codigoProblema;
	}

	@Column(name = "codigoCierre", nullable = false)
	public int getCodigoCierre() {
		return this.codigoCierre;
	}

	public void setCodigoCierre(int codigoCierre) {
		this.codigoCierre = codigoCierre;
	}

	@Column(name = "codigoProblema", nullable = false)
	public int getCodigoProblema() {
		return this.codigoProblema;
	}

	public void setCodigoProblema(int codigoProblema) {
		this.codigoProblema = codigoProblema;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProblemaCierreId))
			return false;
		ProblemaCierreId castOther = (ProblemaCierreId) other;

		return (this.getCodigoCierre() == castOther.getCodigoCierre())
				&& (this.getCodigoProblema() == castOther.getCodigoProblema());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodigoCierre();
		result = 37 * result + this.getCodigoProblema();
		return result;
	}

}
