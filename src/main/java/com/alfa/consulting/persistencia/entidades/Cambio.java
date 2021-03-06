package com.alfa.consulting.persistencia.entidades;

// Generated 07/05/2012 01:03:00 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cambio generated by hbm2java
 */
@Entity
@Table(name = "CAMBIO", schema = "dbo", catalog = "SISMAV2")
public class Cambio implements java.io.Serializable {

	private int codigoCambio;
	private Elemento elemento;
	private Urgencia urgencia;
	private TipoCambio tipoCambio;
	private Impacto impacto;
	private Estado estado;
	private Sitio sitio;
	private Prioridad prioridad;
	private Cliente cliente;
	private Date fechaInicioProgramada;
	private Date fechaFinalProgramada;
	private String titulo;
	private String descripcion;
	private Integer estado_1;
	private Integer estadoAprobacion;
	private String impacto_1;
	private String planRetirada;
	private String planImplementacion;
	private String listaComprobacion;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String terminalCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String terminalModificacion;
	private String revision;
	private Set<CambioTarea> cambioTareas = new HashSet<CambioTarea>(0);
	private Set<CambioResponsable> cambioResponsables = new HashSet<CambioResponsable>(
			0);
	private Set<CambioNotificacion> cambioNotificacions = new HashSet<CambioNotificacion>(
			0);
	private Set<CambioHistorial> cambioHistorials = new HashSet<CambioHistorial>(
			0);
	private Set<CambioServicio> cambioServicios = new HashSet<CambioServicio>(0);
	private Set<CambioEntradaTiempo> cambioEntradaTiempos = new HashSet<CambioEntradaTiempo>(
			0);
	private Set<CambioNota> cambioNotas = new HashSet<CambioNota>(0);
	private Set<CambioIncidente> cambioIncidentes = new HashSet<CambioIncidente>(
			0);
	private Set<CambioProblema> cambioProblemas = new HashSet<CambioProblema>(0);
	private Set<CambioMiembro> cambioMiembros = new HashSet<CambioMiembro>(0);
	private Set<CambioAdjunto> cambioAdjuntos = new HashSet<CambioAdjunto>(0);

	public Cambio() {
	}

	public Cambio(int codigoCambio) {
		this.codigoCambio = codigoCambio;
	}

	public Cambio(int codigoCambio, Elemento elemento, Urgencia urgencia,
			TipoCambio tipoCambio, Impacto impacto, Estado estado, Sitio sitio,
			Prioridad prioridad, Cliente cliente, Date fechaInicioProgramada,
			Date fechaFinalProgramada, String titulo, String descripcion,
			Integer estado_1, Integer estadoAprobacion, String impacto_1,
			String planRetirada, String planImplementacion,
			String listaComprobacion, String usuarioCreacion,
			Date fechaCreacion, String terminalCreacion,
			String usuarioModificacion, Date fechaModificacion,
			String terminalModificacion, String revision,
			Set<CambioTarea> cambioTareas,
			Set<CambioResponsable> cambioResponsables,
			Set<CambioNotificacion> cambioNotificacions,
			Set<CambioHistorial> cambioHistorials,
			Set<CambioServicio> cambioServicios,
			Set<CambioEntradaTiempo> cambioEntradaTiempos,
			Set<CambioNota> cambioNotas, Set<CambioIncidente> cambioIncidentes,
			Set<CambioProblema> cambioProblemas,
			Set<CambioMiembro> cambioMiembros, Set<CambioAdjunto> cambioAdjuntos) {
		this.codigoCambio = codigoCambio;
		this.elemento = elemento;
		this.urgencia = urgencia;
		this.tipoCambio = tipoCambio;
		this.impacto = impacto;
		this.estado = estado;
		this.sitio = sitio;
		this.prioridad = prioridad;
		this.cliente = cliente;
		this.fechaInicioProgramada = fechaInicioProgramada;
		this.fechaFinalProgramada = fechaFinalProgramada;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.estado_1 = estado_1;
		this.estadoAprobacion = estadoAprobacion;
		this.impacto_1 = impacto_1;
		this.planRetirada = planRetirada;
		this.planImplementacion = planImplementacion;
		this.listaComprobacion = listaComprobacion;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.terminalCreacion = terminalCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.terminalModificacion = terminalModificacion;
		this.revision = revision;
		this.cambioTareas = cambioTareas;
		this.cambioResponsables = cambioResponsables;
		this.cambioNotificacions = cambioNotificacions;
		this.cambioHistorials = cambioHistorials;
		this.cambioServicios = cambioServicios;
		this.cambioEntradaTiempos = cambioEntradaTiempos;
		this.cambioNotas = cambioNotas;
		this.cambioIncidentes = cambioIncidentes;
		this.cambioProblemas = cambioProblemas;
		this.cambioMiembros = cambioMiembros;
		this.cambioAdjuntos = cambioAdjuntos;
	}

	@Id
	@Column(name = "codigoCambio", unique = true, nullable = false)
	public int getCodigoCambio() {
		return this.codigoCambio;
	}

	public void setCodigoCambio(int codigoCambio) {
		this.codigoCambio = codigoCambio;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "codigoCategoria", referencedColumnName = "codigoCategoria"),
			@JoinColumn(name = "codigoSubCategoria", referencedColumnName = "codigoSubCategoria"),
			@JoinColumn(name = "codigoElemento", referencedColumnName = "codigoElemento") })
	public Elemento getElemento() {
		return this.elemento;
	}

	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoUrgencia")
	public Urgencia getUrgencia() {
		return this.urgencia;
	}

	public void setUrgencia(Urgencia urgencia) {
		this.urgencia = urgencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoTipoCambio")
	public TipoCambio getTipoCambio() {
		return this.tipoCambio;
	}

	public void setTipoCambio(TipoCambio tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoImpacto")
	public Impacto getImpacto() {
		return this.impacto;
	}

	public void setImpacto(Impacto impacto) {
		this.impacto = impacto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoEstado")
	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
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
	@JoinColumn(name = "codigoPrioridad")
	public Prioridad getPrioridad() {
		return this.prioridad;
	}

	public void setPrioridad(Prioridad prioridad) {
		this.prioridad = prioridad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoUsuario")
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaInicioProgramada", length = 23)
	public Date getFechaInicioProgramada() {
		return this.fechaInicioProgramada;
	}

	public void setFechaInicioProgramada(Date fechaInicioProgramada) {
		this.fechaInicioProgramada = fechaInicioProgramada;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaFinalProgramada", length = 23)
	public Date getFechaFinalProgramada() {
		return this.fechaFinalProgramada;
	}

	public void setFechaFinalProgramada(Date fechaFinalProgramada) {
		this.fechaFinalProgramada = fechaFinalProgramada;
	}

	@Column(name = "titulo", length = 100)
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Column(name = "descripcion", length = 5000)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "estado")
	public Integer getEstado_1() {
		return this.estado_1;
	}

	public void setEstado_1(Integer estado_1) {
		this.estado_1 = estado_1;
	}

	@Column(name = "estadoAprobacion")
	public Integer getEstadoAprobacion() {
		return this.estadoAprobacion;
	}

	public void setEstadoAprobacion(Integer estadoAprobacion) {
		this.estadoAprobacion = estadoAprobacion;
	}

	@Column(name = "impacto", length = 5000)
	public String getImpacto_1() {
		return this.impacto_1;
	}

	public void setImpacto_1(String impacto_1) {
		this.impacto_1 = impacto_1;
	}

	@Column(name = "planRetirada", length = 5000)
	public String getPlanRetirada() {
		return this.planRetirada;
	}

	public void setPlanRetirada(String planRetirada) {
		this.planRetirada = planRetirada;
	}

	@Column(name = "planImplementacion", length = 5000)
	public String getPlanImplementacion() {
		return this.planImplementacion;
	}

	public void setPlanImplementacion(String planImplementacion) {
		this.planImplementacion = planImplementacion;
	}

	@Column(name = "listaComprobacion", length = 5000)
	public String getListaComprobacion() {
		return this.listaComprobacion;
	}

	public void setListaComprobacion(String listaComprobacion) {
		this.listaComprobacion = listaComprobacion;
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

	@Column(name = "revision", length = 5000)
	public String getRevision() {
		return this.revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cambio")
	public Set<CambioTarea> getCambioTareas() {
		return this.cambioTareas;
	}

	public void setCambioTareas(Set<CambioTarea> cambioTareas) {
		this.cambioTareas = cambioTareas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cambio")
	public Set<CambioResponsable> getCambioResponsables() {
		return this.cambioResponsables;
	}

	public void setCambioResponsables(Set<CambioResponsable> cambioResponsables) {
		this.cambioResponsables = cambioResponsables;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cambio")
	public Set<CambioNotificacion> getCambioNotificacions() {
		return this.cambioNotificacions;
	}

	public void setCambioNotificacions(
			Set<CambioNotificacion> cambioNotificacions) {
		this.cambioNotificacions = cambioNotificacions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cambio")
	public Set<CambioHistorial> getCambioHistorials() {
		return this.cambioHistorials;
	}

	public void setCambioHistorials(Set<CambioHistorial> cambioHistorials) {
		this.cambioHistorials = cambioHistorials;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cambio")
	public Set<CambioServicio> getCambioServicios() {
		return this.cambioServicios;
	}

	public void setCambioServicios(Set<CambioServicio> cambioServicios) {
		this.cambioServicios = cambioServicios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cambio")
	public Set<CambioEntradaTiempo> getCambioEntradaTiempos() {
		return this.cambioEntradaTiempos;
	}

	public void setCambioEntradaTiempos(
			Set<CambioEntradaTiempo> cambioEntradaTiempos) {
		this.cambioEntradaTiempos = cambioEntradaTiempos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cambio")
	public Set<CambioNota> getCambioNotas() {
		return this.cambioNotas;
	}

	public void setCambioNotas(Set<CambioNota> cambioNotas) {
		this.cambioNotas = cambioNotas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cambio")
	public Set<CambioIncidente> getCambioIncidentes() {
		return this.cambioIncidentes;
	}

	public void setCambioIncidentes(Set<CambioIncidente> cambioIncidentes) {
		this.cambioIncidentes = cambioIncidentes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cambio")
	public Set<CambioProblema> getCambioProblemas() {
		return this.cambioProblemas;
	}

	public void setCambioProblemas(Set<CambioProblema> cambioProblemas) {
		this.cambioProblemas = cambioProblemas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cambio")
	public Set<CambioMiembro> getCambioMiembros() {
		return this.cambioMiembros;
	}

	public void setCambioMiembros(Set<CambioMiembro> cambioMiembros) {
		this.cambioMiembros = cambioMiembros;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cambio")
	public Set<CambioAdjunto> getCambioAdjuntos() {
		return this.cambioAdjuntos;
	}

	public void setCambioAdjuntos(Set<CambioAdjunto> cambioAdjuntos) {
		this.cambioAdjuntos = cambioAdjuntos;
	}

}
