package com.alfa.consulting.persistencia.entidades;

// Generated 07/05/2012 01:03:00 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ProblemaEntTiempo generated by hbm2java
 */
@Entity
@Table(name = "PROBLEMA_ENT_TIEMPO", schema = "dbo", catalog = "SISMAV2")
public class ProblemaEntTiempo implements java.io.Serializable {

	private ProblemaEntTiempoId id;
	private Tecnico tecnico;
	private Problema problema;
	private Integer horas;
	private Integer minutos;
	private BigDecimal cargoTecnico;
	private Date tiempoEjecucion;
	private String descripcion;
	private Integer estado;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String terminalCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String terminalModificacion;

	public ProblemaEntTiempo() {
	}

	public ProblemaEntTiempo(ProblemaEntTiempoId id, Tecnico tecnico,
			Problema problema) {
		this.id = id;
		this.tecnico = tecnico;
		this.problema = problema;
	}

	public ProblemaEntTiempo(ProblemaEntTiempoId id, Tecnico tecnico,
			Problema problema, Integer horas, Integer minutos,
			BigDecimal cargoTecnico, Date tiempoEjecucion, String descripcion,
			Integer estado, String usuarioCreacion, Date fechaCreacion,
			String terminalCreacion, String usuarioModificacion,
			Date fechaModificacion, String terminalModificacion) {
		this.id = id;
		this.tecnico = tecnico;
		this.problema = problema;
		this.horas = horas;
		this.minutos = minutos;
		this.cargoTecnico = cargoTecnico;
		this.tiempoEjecucion = tiempoEjecucion;
		this.descripcion = descripcion;
		this.estado = estado;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.terminalCreacion = terminalCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.terminalModificacion = terminalModificacion;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoEntradaTiempo", column = @Column(name = "codigoEntradaTiempo", nullable = false)),
			@AttributeOverride(name = "codigoTecnico", column = @Column(name = "codigoTecnico", nullable = false)),
			@AttributeOverride(name = "codigoProblema", column = @Column(name = "codigoProblema", nullable = false)) })
	public ProblemaEntTiempoId getId() {
		return this.id;
	}

	public void setId(ProblemaEntTiempoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoTecnico", nullable = false, insertable = false, updatable = false)
	public Tecnico getTecnico() {
		return this.tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoProblema", nullable = false, insertable = false, updatable = false)
	public Problema getProblema() {
		return this.problema;
	}

	public void setProblema(Problema problema) {
		this.problema = problema;
	}

	@Column(name = "horas")
	public Integer getHoras() {
		return this.horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	@Column(name = "minutos")
	public Integer getMinutos() {
		return this.minutos;
	}

	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}

	@Column(name = "cargoTecnico", precision = 12)
	public BigDecimal getCargoTecnico() {
		return this.cargoTecnico;
	}

	public void setCargoTecnico(BigDecimal cargoTecnico) {
		this.cargoTecnico = cargoTecnico;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "tiempoEjecucion", length = 23)
	public Date getTiempoEjecucion() {
		return this.tiempoEjecucion;
	}

	public void setTiempoEjecucion(Date tiempoEjecucion) {
		this.tiempoEjecucion = tiempoEjecucion;
	}

	@Column(name = "descripcion", length = 500)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

}