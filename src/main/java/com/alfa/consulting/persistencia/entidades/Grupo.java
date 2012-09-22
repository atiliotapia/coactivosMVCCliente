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
 * Grupo generated by hbm2java
 */
@Entity
@Table(name = "GRUPO", schema = "dbo", catalog = "SISMAV2")
public class Grupo implements java.io.Serializable {

	private int codigoGrupo;
	private String nombreGrupo;
	private Integer estado;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String terminalCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String terminalModificacion;
	private Integer notificacion;
	private String descripcion;
	private String correoElectronico;
	private String nombreRemitente;
	private String correoRemitente;
	private Set<TecnicoGrupo> tecnicoGrupos = new HashSet<TecnicoGrupo>(0);

	public Grupo() {
	}

	public Grupo(int codigoGrupo) {
		this.codigoGrupo = codigoGrupo;
	}

	public Grupo(int codigoGrupo, String nombreGrupo, Integer estado,
			String usuarioCreacion, Date fechaCreacion,
			String terminalCreacion, String usuarioModificacion,
			Date fechaModificacion, String terminalModificacion,
			Integer notificacion, String descripcion, String correoElectronico,
			String nombreRemitente, String correoRemitente,
			Set<TecnicoGrupo> tecnicoGrupos) {
		this.codigoGrupo = codigoGrupo;
		this.nombreGrupo = nombreGrupo;
		this.estado = estado;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.terminalCreacion = terminalCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.terminalModificacion = terminalModificacion;
		this.notificacion = notificacion;
		this.descripcion = descripcion;
		this.correoElectronico = correoElectronico;
		this.nombreRemitente = nombreRemitente;
		this.correoRemitente = correoRemitente;
		this.tecnicoGrupos = tecnicoGrupos;
	}

	@Id
	@Column(name = "codigoGrupo", unique = true, nullable = false)
	public int getCodigoGrupo() {
		return this.codigoGrupo;
	}

	public void setCodigoGrupo(int codigoGrupo) {
		this.codigoGrupo = codigoGrupo;
	}

	@Column(name = "nombreGrupo", length = 50)
	public String getNombreGrupo() {
		return this.nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
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

	@Column(name = "notificacion")
	public Integer getNotificacion() {
		return this.notificacion;
	}

	public void setNotificacion(Integer notificacion) {
		this.notificacion = notificacion;
	}

	@Column(name = "descripcion")
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "correoElectronico")
	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	@Column(name = "nombreRemitente", length = 100)
	public String getNombreRemitente() {
		return this.nombreRemitente;
	}

	public void setNombreRemitente(String nombreRemitente) {
		this.nombreRemitente = nombreRemitente;
	}

	@Column(name = "correoRemitente", length = 200)
	public String getCorreoRemitente() {
		return this.correoRemitente;
	}

	public void setCorreoRemitente(String correoRemitente) {
		this.correoRemitente = correoRemitente;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "grupo")
	public Set<TecnicoGrupo> getTecnicoGrupos() {
		return this.tecnicoGrupos;
	}

	public void setTecnicoGrupos(Set<TecnicoGrupo> tecnicoGrupos) {
		this.tecnicoGrupos = tecnicoGrupos;
	}

}
