package com.alfa.consulting.persistencia.entidades;

// Generated 07/05/2012 01:03:00 AM by Hibernate Tools 3.4.0.CR1

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
 * DiaLaborable generated by hbm2java
 */
@Entity
@Table(name = "DIA_LABORABLE", schema = "dbo", catalog = "SISMAV2")
public class DiaLaborable implements java.io.Serializable {

	private DiaLaborableId id;
	private Sitio sitio;
	private Dia dia;
	private Integer horaInicio;
	private Integer minutoInicio;
	private Integer horaFin;
	private Integer minutoFin;
	private Integer estado;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String terminalCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String terminalModificacion;
	private Integer todoDia;

	public DiaLaborable() {
	}

	public DiaLaborable(DiaLaborableId id, Dia dia) {
		this.id = id;
		this.dia = dia;
	}

	public DiaLaborable(DiaLaborableId id, Sitio sitio, Dia dia,
			Integer horaInicio, Integer minutoInicio, Integer horaFin,
			Integer minutoFin, Integer estado, String usuarioCreacion,
			Date fechaCreacion, String terminalCreacion,
			String usuarioModificacion, Date fechaModificacion,
			String terminalModificacion, Integer todoDia) {
		this.id = id;
		this.sitio = sitio;
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.minutoInicio = minutoInicio;
		this.horaFin = horaFin;
		this.minutoFin = minutoFin;
		this.estado = estado;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.terminalCreacion = terminalCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.terminalModificacion = terminalModificacion;
		this.todoDia = todoDia;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoDiaLaborable", column = @Column(name = "codigoDiaLaborable", nullable = false)),
			@AttributeOverride(name = "codigoDia", column = @Column(name = "codigoDia", nullable = false)) })
	public DiaLaborableId getId() {
		return this.id;
	}

	public void setId(DiaLaborableId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoSitio")
	public Sitio getSitio() {
		return this.sitio;
	}

	public void setSitio(Sitio sitio) {
		this.sitio = sitio;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoDia", nullable = false, insertable = false, updatable = false)
	public Dia getDia() {
		return this.dia;
	}

	public void setDia(Dia dia) {
		this.dia = dia;
	}

	@Column(name = "horaInicio")
	public Integer getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Integer horaInicio) {
		this.horaInicio = horaInicio;
	}

	@Column(name = "minutoInicio")
	public Integer getMinutoInicio() {
		return this.minutoInicio;
	}

	public void setMinutoInicio(Integer minutoInicio) {
		this.minutoInicio = minutoInicio;
	}

	@Column(name = "horaFin")
	public Integer getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(Integer horaFin) {
		this.horaFin = horaFin;
	}

	@Column(name = "minutoFin")
	public Integer getMinutoFin() {
		return this.minutoFin;
	}

	public void setMinutoFin(Integer minutoFin) {
		this.minutoFin = minutoFin;
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

	@Column(name = "todoDia")
	public Integer getTodoDia() {
		return this.todoDia;
	}

	public void setTodoDia(Integer todoDia) {
		this.todoDia = todoDia;
	}

}
