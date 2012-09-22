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
 * MiembroCab generated by hbm2java
 */
@Entity
@Table(name = "MIEMBRO_CAB", schema = "dbo", catalog = "SISMAV2")
public class MiembroCab implements java.io.Serializable {

	private MiembroCabId id;
	private Cab cab;
	private Usuario usuario;
	private Integer estado;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String terminalCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String terminalModificacion;
	private Set<CambioMiembro> cambioMiembros = new HashSet<CambioMiembro>(0);

	public MiembroCab() {
	}

	public MiembroCab(MiembroCabId id, Cab cab, Usuario usuario) {
		this.id = id;
		this.cab = cab;
		this.usuario = usuario;
	}

	public MiembroCab(MiembroCabId id, Cab cab, Usuario usuario,
			Integer estado, String usuarioCreacion, Date fechaCreacion,
			String terminalCreacion, String usuarioModificacion,
			Date fechaModificacion, String terminalModificacion,
			Set<CambioMiembro> cambioMiembros) {
		this.id = id;
		this.cab = cab;
		this.usuario = usuario;
		this.estado = estado;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.terminalCreacion = terminalCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.terminalModificacion = terminalModificacion;
		this.cambioMiembros = cambioMiembros;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoCab", column = @Column(name = "codigoCab", nullable = false)),
			@AttributeOverride(name = "codigoUsuario", column = @Column(name = "codigoUsuario", nullable = false)),
			@AttributeOverride(name = "codigoMiembro", column = @Column(name = "codigoMiembro", nullable = false)) })
	public MiembroCabId getId() {
		return this.id;
	}

	public void setId(MiembroCabId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoCab", nullable = false, insertable = false, updatable = false)
	public Cab getCab() {
		return this.cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoUsuario", nullable = false, insertable = false, updatable = false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "miembroCab")
	public Set<CambioMiembro> getCambioMiembros() {
		return this.cambioMiembros;
	}

	public void setCambioMiembros(Set<CambioMiembro> cambioMiembros) {
		this.cambioMiembros = cambioMiembros;
	}

}