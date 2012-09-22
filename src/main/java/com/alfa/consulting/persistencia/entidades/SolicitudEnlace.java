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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SolicitudEnlace generated by hbm2java
 */
@Entity
@Table(name = "SOLICITUD_ENLACE", schema = "dbo", catalog = "SISMAV2")
public class SolicitudEnlace implements java.io.Serializable {

	private SolicitudEnlaceId id;
	private Solicitud solicitudByR69;
	private Solicitud solicitudByR70;
	private String descripcion;
	private Integer estado;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String terminalCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String terminalModificacion;

	public SolicitudEnlace() {
	}

	public SolicitudEnlace(SolicitudEnlaceId id, Solicitud solicitudByR69,
			Solicitud solicitudByR70) {
		this.id = id;
		this.solicitudByR69 = solicitudByR69;
		this.solicitudByR70 = solicitudByR70;
	}

	public SolicitudEnlace(SolicitudEnlaceId id, Solicitud solicitudByR69,
			Solicitud solicitudByR70, String descripcion, Integer estado,
			String usuarioCreacion, Date fechaCreacion,
			String terminalCreacion, String usuarioModificacion,
			Date fechaModificacion, String terminalModificacion) {
		this.id = id;
		this.solicitudByR69 = solicitudByR69;
		this.solicitudByR70 = solicitudByR70;
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
			@AttributeOverride(name = "codigoSolicitud", column = @Column(name = "codigoSolicitud", nullable = false)),
			@AttributeOverride(name = "codigoUsuario", column = @Column(name = "codigoUsuario", nullable = false)),
			@AttributeOverride(name = "codigoSolicitudEnlazada", column = @Column(name = "codigoSolicitudEnlazada", nullable = false)),
			@AttributeOverride(name = "codigoUsuarioEnlazado", column = @Column(name = "codigoUsuarioEnlazado", nullable = false)) })
	public SolicitudEnlaceId getId() {
		return this.id;
	}

	public void setId(SolicitudEnlaceId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "codigoSolicitud", referencedColumnName = "codigoSolicitud", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "codigoUsuario", referencedColumnName = "codigoUsuario", nullable = false, insertable = false, updatable = false) })
	public Solicitud getSolicitudByR69() {
		return this.solicitudByR69;
	}

	public void setSolicitudByR69(Solicitud solicitudByR69) {
		this.solicitudByR69 = solicitudByR69;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "codigoSolicitudEnlazada", referencedColumnName = "codigoSolicitud", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "codigoUsuarioEnlazado", referencedColumnName = "codigoUsuario", nullable = false, insertable = false, updatable = false) })
	public Solicitud getSolicitudByR70() {
		return this.solicitudByR70;
	}

	public void setSolicitudByR70(Solicitud solicitudByR70) {
		this.solicitudByR70 = solicitudByR70;
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
