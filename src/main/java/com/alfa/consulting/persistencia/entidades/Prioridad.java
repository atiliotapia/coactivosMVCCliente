package com.alfa.consulting.persistencia.entidades;

// Generated 07/05/2012 01:03:00 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Prioridad generated by hbm2java
 */
@Entity
@Table(name = "PRIORIDAD", schema = "dbo", catalog = "SISMAV2")
public class Prioridad implements java.io.Serializable {

	private int codigoPrioridad;
	private String nombrePrioridad;
	private Integer estado;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String terminalCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String terminalModificacion;
	private String color;
	private Set<Solicitud> solicituds = new HashSet<Solicitud>(0);
	private Set<Cambio> cambios = new HashSet<Cambio>(0);
	private Set<Problema> problemas = new HashSet<Problema>(0);

	public Prioridad() {
	}

	public Prioridad(int codigoPrioridad) {
		this.codigoPrioridad = codigoPrioridad;
	}

	public Prioridad(int codigoPrioridad, String nombrePrioridad,
			Integer estado, String usuarioCreacion, Date fechaCreacion,
			String terminalCreacion, String usuarioModificacion,
			Date fechaModificacion, String terminalModificacion, String color,
			Set<Solicitud> solicituds, Set<Cambio> cambios,
			Set<Problema> problemas) {
		this.codigoPrioridad = codigoPrioridad;
		this.nombrePrioridad = nombrePrioridad;
		this.estado = estado;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.terminalCreacion = terminalCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.terminalModificacion = terminalModificacion;
		this.color = color;
		this.solicituds = solicituds;
		this.cambios = cambios;
		this.problemas = problemas;
	}

	@Id
	@Column(name = "codigoPrioridad", unique = true, nullable = false)
	public int getCodigoPrioridad() {
		return this.codigoPrioridad;
	}

	public void setCodigoPrioridad(int codigoPrioridad) {
		this.codigoPrioridad = codigoPrioridad;
	}

	@Column(name = "nombrePrioridad", length = 50)
	public String getNombrePrioridad() {
		return this.nombrePrioridad;
	}

	public void setNombrePrioridad(String nombrePrioridad) {
		this.nombrePrioridad = nombrePrioridad;
	}

	@Column(name = "estado")
	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@Column(name = "usuarioCreacion", length = 50)
	public String getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaCreacion", length = 23)
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Column(name = "terminalCreacion", length = 50)
	public String getTerminalCreacion() {
		return this.terminalCreacion;
	}

	public void setTerminalCreacion(String terminalCreacion) {
		this.terminalCreacion = terminalCreacion;
	}

	@Column(name = "usuarioModificacion", length = 50)
	public String getUsuarioModificacion() {
		return this.usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaModificacion", length = 23)
	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	@Column(name = "terminalModificacion", length = 50)
	public String getTerminalModificacion() {
		return this.terminalModificacion;
	}

	public void setTerminalModificacion(String terminalModificacion) {
		this.terminalModificacion = terminalModificacion;
	}

	@Column(name = "color", length = 20)
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prioridad")
	public Set<Solicitud> getSolicituds() {
		return this.solicituds;
	}

	public void setSolicituds(Set<Solicitud> solicituds) {
		this.solicituds = solicituds;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prioridad")
	public Set<Cambio> getCambios() {
		return this.cambios;
	}

	public void setCambios(Set<Cambio> cambios) {
		this.cambios = cambios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prioridad")
	public Set<Problema> getProblemas() {
		return this.problemas;
	}

	public void setProblemas(Set<Problema> problemas) {
		this.problemas = problemas;
	}

}
