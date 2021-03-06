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
 * ProblemaProducto generated by hbm2java
 */
@Entity
@Table(name = "PROBLEMA_PRODUCTO", schema = "dbo", catalog = "SISMAV2")
public class ProblemaProducto implements java.io.Serializable {

	private ProblemaProductoId id;
	private Producto producto;
	private Problema problema;
	private Integer estado;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String terminalCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String terminalModificacion;

	public ProblemaProducto() {
	}

	public ProblemaProducto(ProblemaProductoId id, Producto producto,
			Problema problema) {
		this.id = id;
		this.producto = producto;
		this.problema = problema;
	}

	public ProblemaProducto(ProblemaProductoId id, Producto producto,
			Problema problema, Integer estado, String usuarioCreacion,
			Date fechaCreacion, String terminalCreacion,
			String usuarioModificacion, Date fechaModificacion,
			String terminalModificacion) {
		this.id = id;
		this.producto = producto;
		this.problema = problema;
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
			@AttributeOverride(name = "codigoProducto", column = @Column(name = "codigoProducto", nullable = false)),
			@AttributeOverride(name = "codigoProblema", column = @Column(name = "codigoProblema", nullable = false)) })
	public ProblemaProductoId getId() {
		return this.id;
	}

	public void setId(ProblemaProductoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoProducto", nullable = false, insertable = false, updatable = false)
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoProblema", nullable = false, insertable = false, updatable = false)
	public Problema getProblema() {
		return this.problema;
	}

	public void setProblema(Problema problema) {
		this.problema = problema;
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
