package com.alfa.consulting.persistencia.entidades;

// Generated 07/05/2012 01:03:00 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CategoriaOpcion generated by hbm2java
 */
@Entity
@Table(name = "CATEGORIA_OPCION", schema = "dbo", catalog = "SISMAV2")
public class CategoriaOpcion implements java.io.Serializable {

	private CategoriaOpcionId id;
	private Idioma idioma;
	private String nombreCategoriaOpcion;
	private Integer estado;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String terminalCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String terminalModificacion;
	private Set<Opcion> opcions = new HashSet<Opcion>(0);

	public CategoriaOpcion() {
	}

	public CategoriaOpcion(CategoriaOpcionId id, Idioma idioma) {
		this.id = id;
		this.idioma = idioma;
	}

	public CategoriaOpcion(CategoriaOpcionId id, Idioma idioma,
			String nombreCategoriaOpcion, Integer estado,
			String usuarioCreacion, Date fechaCreacion,
			String terminalCreacion, String usuarioModificacion,
			Date fechaModificacion, String terminalModificacion,
			Set<Opcion> opcions) {
		this.id = id;
		this.idioma = idioma;
		this.nombreCategoriaOpcion = nombreCategoriaOpcion;
		this.estado = estado;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.terminalCreacion = terminalCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.terminalModificacion = terminalModificacion;
		this.opcions = opcions;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoCategoriaOpcion", column = @Column(name = "codigoCategoriaOpcion", nullable = false)),
			@AttributeOverride(name = "codigoIdioma", column = @Column(name = "codigoIdioma", nullable = false)) })
	public CategoriaOpcionId getId() {
		return this.id;
	}

	public void setId(CategoriaOpcionId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoIdioma", nullable = false, insertable = false, updatable = false)
	public Idioma getIdioma() {
		return this.idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	@Column(name = "nombreCategoriaOpcion", length = 50)
	public String getNombreCategoriaOpcion() {
		return this.nombreCategoriaOpcion;
	}

	public void setNombreCategoriaOpcion(String nombreCategoriaOpcion) {
		this.nombreCategoriaOpcion = nombreCategoriaOpcion;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoriaOpcion")
	public Set<Opcion> getOpcions() {
		return this.opcions;
	}

	public void setOpcions(Set<Opcion> opcions) {
		this.opcions = opcions;
	}

}