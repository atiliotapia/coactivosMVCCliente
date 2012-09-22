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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Solicitud generated by hbm2java
 */
@Entity
@Table(name = "SOLICITUD", schema = "dbo", catalog = "SISMAV2")
public class Solicitud implements java.io.Serializable {

	private SolicitudId id;
	private CategoriaServicio categoriaServicio;
	private Sitio sitio;
	private Prioridad prioridad;
	private Cliente cliente;
	private Solucion solucion;
	private Elemento elemento;
	private Urgencia urgencia;
	private Modo modo;
	private Impacto impacto;
	private Nivel nivel;
	private Producto producto;
	private Estado estado;
	private PlantillaSolicitud plantillaSolicitud;
	private TipoSolicitud tipoSolicitud;
	private String asunto;
	private String descripcion;
	private String correoNotificacion;
	private Integer estado_1;
	private Date fechaVencimiento;
	private Date fechaRespuesta;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String terminalCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String terminalModificacion;
	private Date fechaReporte;
	private Integer hora;
	private Integer minuto;
	private String resolucion;
	private Set<SolicitudEnlace> solicitudEnlacesForR70 = new HashSet<SolicitudEnlace>(
			0);
	private Set<Tarea> tareas = new HashSet<Tarea>(0);
	private Set<Nota> notas = new HashSet<Nota>(0);
	private Set<SolicitudCorreo> solicitudCorreos = new HashSet<SolicitudCorreo>(
			0);
	private Set<SolicitudEnlace> solicitudEnlacesForR69 = new HashSet<SolicitudEnlace>(
			0);
	private Set<ProblemaIncidente> problemaIncidentes = new HashSet<ProblemaIncidente>(
			0);
	private Set<Adjunto> adjuntos = new HashSet<Adjunto>(0);
	private Set<SolicitudResponsable> solicitudResponsables = new HashSet<SolicitudResponsable>(
			0);
	private Set<EntradaTiempo> entradaTiempos = new HashSet<EntradaTiempo>(0);
	private Set<CierreSolicitud> cierreSolicituds = new HashSet<CierreSolicitud>(
			0);
	private Set<SolicitudHistorial> solicitudHistorials = new HashSet<SolicitudHistorial>(
			0);
	private Set<CambioIncidente> cambioIncidentes = new HashSet<CambioIncidente>(
			0);

	public Solicitud() {
	}

	public Solicitud(SolicitudId id, Cliente cliente) {
		this.id = id;
		this.cliente = cliente;
	}

	public Solicitud(SolicitudId id, CategoriaServicio categoriaServicio,
			Sitio sitio, Prioridad prioridad, Cliente cliente,
			Solucion solucion, Elemento elemento, Urgencia urgencia, Modo modo,
			Impacto impacto, Nivel nivel, Producto producto, Estado estado,
			PlantillaSolicitud plantillaSolicitud, TipoSolicitud tipoSolicitud,
			String asunto, String descripcion, String correoNotificacion,
			Integer estado_1, Date fechaVencimiento, Date fechaRespuesta,
			String usuarioCreacion, Date fechaCreacion,
			String terminalCreacion, String usuarioModificacion,
			Date fechaModificacion, String terminalModificacion,
			Date fechaReporte, Integer hora, Integer minuto, String resolucion,
			Set<SolicitudEnlace> solicitudEnlacesForR70, Set<Tarea> tareas,
			Set<Nota> notas, Set<SolicitudCorreo> solicitudCorreos,
			Set<SolicitudEnlace> solicitudEnlacesForR69,
			Set<ProblemaIncidente> problemaIncidentes, Set<Adjunto> adjuntos,
			Set<SolicitudResponsable> solicitudResponsables,
			Set<EntradaTiempo> entradaTiempos,
			Set<CierreSolicitud> cierreSolicituds,
			Set<SolicitudHistorial> solicitudHistorials,
			Set<CambioIncidente> cambioIncidentes) {
		this.id = id;
		this.categoriaServicio = categoriaServicio;
		this.sitio = sitio;
		this.prioridad = prioridad;
		this.cliente = cliente;
		this.solucion = solucion;
		this.elemento = elemento;
		this.urgencia = urgencia;
		this.modo = modo;
		this.impacto = impacto;
		this.nivel = nivel;
		this.producto = producto;
		this.estado = estado;
		this.plantillaSolicitud = plantillaSolicitud;
		this.tipoSolicitud = tipoSolicitud;
		this.asunto = asunto;
		this.descripcion = descripcion;
		this.correoNotificacion = correoNotificacion;
		this.estado_1 = estado_1;
		this.fechaVencimiento = fechaVencimiento;
		this.fechaRespuesta = fechaRespuesta;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.terminalCreacion = terminalCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.terminalModificacion = terminalModificacion;
		this.fechaReporte = fechaReporte;
		this.hora = hora;
		this.minuto = minuto;
		this.resolucion = resolucion;
		this.solicitudEnlacesForR70 = solicitudEnlacesForR70;
		this.tareas = tareas;
		this.notas = notas;
		this.solicitudCorreos = solicitudCorreos;
		this.solicitudEnlacesForR69 = solicitudEnlacesForR69;
		this.problemaIncidentes = problemaIncidentes;
		this.adjuntos = adjuntos;
		this.solicitudResponsables = solicitudResponsables;
		this.entradaTiempos = entradaTiempos;
		this.cierreSolicituds = cierreSolicituds;
		this.solicitudHistorials = solicitudHistorials;
		this.cambioIncidentes = cambioIncidentes;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoSolicitud", column = @Column(name = "codigoSolicitud", nullable = false)),
			@AttributeOverride(name = "codigoUsuario", column = @Column(name = "codigoUsuario", nullable = false)) })
	public SolicitudId getId() {
		return this.id;
	}

	public void setId(SolicitudId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoCategoriaServicio")
	public CategoriaServicio getCategoriaServicio() {
		return this.categoriaServicio;
	}

	public void setCategoriaServicio(CategoriaServicio categoriaServicio) {
		this.categoriaServicio = categoriaServicio;
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
	@JoinColumn(name = "codigoUsuario", nullable = false, insertable = false, updatable = false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoSolucion")
	public Solucion getSolucion() {
		return this.solucion;
	}

	public void setSolucion(Solucion solucion) {
		this.solucion = solucion;
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
	@JoinColumn(name = "codigoModo")
	public Modo getModo() {
		return this.modo;
	}

	public void setModo(Modo modo) {
		this.modo = modo;
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
	@JoinColumn(name = "codigoNivel")
	public Nivel getNivel() {
		return this.nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoProducto")
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
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
	@JoinColumn(name = "codigoPlantilla")
	public PlantillaSolicitud getPlantillaSolicitud() {
		return this.plantillaSolicitud;
	}

	public void setPlantillaSolicitud(PlantillaSolicitud plantillaSolicitud) {
		this.plantillaSolicitud = plantillaSolicitud;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoTipoSolicitud")
	public TipoSolicitud getTipoSolicitud() {
		return this.tipoSolicitud;
	}

	public void setTipoSolicitud(TipoSolicitud tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}

	@Column(name = "asunto", length = 500)
	public String getAsunto() {
		return this.asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	@Column(name = "descripcion")
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "correoNotificacion", length = 100)
	public String getCorreoNotificacion() {
		return this.correoNotificacion;
	}

	public void setCorreoNotificacion(String correoNotificacion) {
		this.correoNotificacion = correoNotificacion;
	}

	@Column(name = "estado")
	public Integer getEstado_1() {
		return this.estado_1;
	}

	public void setEstado_1(Integer estado_1) {
		this.estado_1 = estado_1;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaVencimiento", length = 23)
	public Date getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaRespuesta", length = 23)
	public Date getFechaRespuesta() {
		return this.fechaRespuesta;
	}

	public void setFechaRespuesta(Date fechaRespuesta) {
		this.fechaRespuesta = fechaRespuesta;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaReporte", length = 23)
	public Date getFechaReporte() {
		return this.fechaReporte;
	}

	public void setFechaReporte(Date fechaReporte) {
		this.fechaReporte = fechaReporte;
	}

	@Column(name = "hora")
	public Integer getHora() {
		return this.hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	@Column(name = "minuto")
	public Integer getMinuto() {
		return this.minuto;
	}

	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}

	@Column(name = "resolucion", length = 5000)
	public String getResolucion() {
		return this.resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "solicitudByR70")
	public Set<SolicitudEnlace> getSolicitudEnlacesForR70() {
		return this.solicitudEnlacesForR70;
	}

	public void setSolicitudEnlacesForR70(
			Set<SolicitudEnlace> solicitudEnlacesForR70) {
		this.solicitudEnlacesForR70 = solicitudEnlacesForR70;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "solicitud")
	public Set<Tarea> getTareas() {
		return this.tareas;
	}

	public void setTareas(Set<Tarea> tareas) {
		this.tareas = tareas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "solicitud")
	public Set<Nota> getNotas() {
		return this.notas;
	}

	public void setNotas(Set<Nota> notas) {
		this.notas = notas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "solicitud")
	public Set<SolicitudCorreo> getSolicitudCorreos() {
		return this.solicitudCorreos;
	}

	public void setSolicitudCorreos(Set<SolicitudCorreo> solicitudCorreos) {
		this.solicitudCorreos = solicitudCorreos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "solicitudByR69")
	public Set<SolicitudEnlace> getSolicitudEnlacesForR69() {
		return this.solicitudEnlacesForR69;
	}

	public void setSolicitudEnlacesForR69(
			Set<SolicitudEnlace> solicitudEnlacesForR69) {
		this.solicitudEnlacesForR69 = solicitudEnlacesForR69;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "solicitud")
	public Set<ProblemaIncidente> getProblemaIncidentes() {
		return this.problemaIncidentes;
	}

	public void setProblemaIncidentes(Set<ProblemaIncidente> problemaIncidentes) {
		this.problemaIncidentes = problemaIncidentes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "solicitud")
	public Set<Adjunto> getAdjuntos() {
		return this.adjuntos;
	}

	public void setAdjuntos(Set<Adjunto> adjuntos) {
		this.adjuntos = adjuntos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "solicitud")
	public Set<SolicitudResponsable> getSolicitudResponsables() {
		return this.solicitudResponsables;
	}

	public void setSolicitudResponsables(
			Set<SolicitudResponsable> solicitudResponsables) {
		this.solicitudResponsables = solicitudResponsables;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "solicitud")
	public Set<EntradaTiempo> getEntradaTiempos() {
		return this.entradaTiempos;
	}

	public void setEntradaTiempos(Set<EntradaTiempo> entradaTiempos) {
		this.entradaTiempos = entradaTiempos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "solicitud")
	public Set<CierreSolicitud> getCierreSolicituds() {
		return this.cierreSolicituds;
	}

	public void setCierreSolicituds(Set<CierreSolicitud> cierreSolicituds) {
		this.cierreSolicituds = cierreSolicituds;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "solicitud")
	public Set<SolicitudHistorial> getSolicitudHistorials() {
		return this.solicitudHistorials;
	}

	public void setSolicitudHistorials(
			Set<SolicitudHistorial> solicitudHistorials) {
		this.solicitudHistorials = solicitudHistorials;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "solicitud")
	public Set<CambioIncidente> getCambioIncidentes() {
		return this.cambioIncidentes;
	}

	public void setCambioIncidentes(Set<CambioIncidente> cambioIncidentes) {
		this.cambioIncidentes = cambioIncidentes;
	}

}
