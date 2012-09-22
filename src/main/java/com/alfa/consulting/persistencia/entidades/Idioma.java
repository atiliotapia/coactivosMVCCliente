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
 * Idioma generated by hbm2java
 */
@Entity
@Table(name = "IDIOMA", schema = "dbo", catalog = "SISMAV2")
public class Idioma implements java.io.Serializable {

	private int codigoIdioma;
	private String nombreIdioma;
	private Integer estado;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String terminalCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String terminalModificacion;
	private Set<CategoriaOpcion> categoriaOpcions = new HashSet<CategoriaOpcion>(
			0);

	public Idioma() {
	}

	public Idioma(int codigoIdioma) {
		this.codigoIdioma = codigoIdioma;
	}

	public Idioma(int codigoIdioma, String nombreIdioma, Integer estado,
			String usuarioCreacion, Date fechaCreacion,
			String terminalCreacion, String usuarioModificacion,
			Date fechaModificacion, String terminalModificacion,
			Set<CategoriaOpcion> categoriaOpcions) {
		this.codigoIdioma = codigoIdioma;
		this.nombreIdioma = nombreIdioma;
		this.estado = estado;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.terminalCreacion = terminalCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.terminalModificacion = terminalModificacion;
		this.categoriaOpcions = categoriaOpcions;
	}

	@Id
	@Column(name = "codigoIdioma", unique = true, nullable = false)
	public int getCodigoIdioma() {
		return this.codigoIdioma;
	}

	public void setCodigoIdioma(int codigoIdioma) {
		this.codigoIdioma = codigoIdioma;
	}

	@Column(name = "nombreIdioma", length = 50)
	public String getNombreIdioma() {
		return this.nombreIdioma;
	}

	public void setNombreIdioma(String nombreIdioma) {
		this.nombreIdioma = nombreIdioma;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idioma")
	public Set<CategoriaOpcion> getCategoriaOpcions() {
		return this.categoriaOpcions;
	}

	public void setCategoriaOpcions(Set<CategoriaOpcion> categoriaOpcions) {
		this.categoriaOpcions = categoriaOpcions;
	}

}
