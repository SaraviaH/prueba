package com.backend.backend.model;

import jakarta.persistence.*;

@Entity
// Indicamos que esta entidad representa una vista y no una tabla editable
@Table(name = "vista_detalle_reservas")
public class VistaDetalleReservas {

    @Id
    @Column(name = "id_cliente")
    private Integer idCliente;

    @Column(name = "nombre_cliente")
    private String nombreCliente;

    @Column(name = "apellido_cliente")
    private String apellidoCliente;

    @Column(name = "tipo_cliente")
    private String tipoCliente;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "id_reserva")
    private Integer idReserva;

    @Column(name = "estado_reserva")
    private String estadoReserva;

    @Column(name = "fecha_reserva")
    private String fechaReserva;

    @Column(name = "id_vuelo")
    private Integer idVuelo;

    @Column(name = "tipo_vuelo")
    private String tipoVuelo;

    @Column(name = "disponibilidad")
    private String disponibilidad;

    @Column(name = "avion")
    private String avion;

    @Column(name = "estado_avion")
    private String estadoAvion;

    @Column(name = "destino")
    private String destino;

    @Column(name = "hora_vuelo")
    private String horaVuelo;

    // Getters y Setters
    public Integer getIdCliente() { return idCliente; }
    public void setIdCliente(Integer idCliente) { this.idCliente = idCliente; }

    public String getNombreCliente() { return nombreCliente; }
    public void setNombreCliente(String nombreCliente) { this.nombreCliente = nombreCliente; }

    public String getApellidoCliente() { return apellidoCliente; }
    public void setApellidoCliente(String apellidoCliente) { this.apellidoCliente = apellidoCliente; }

    public String getTipoCliente() { return tipoCliente; }
    public void setTipoCliente(String tipoCliente) { this.tipoCliente = tipoCliente; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public Integer getIdReserva() { return idReserva; }
    public void setIdReserva(Integer idReserva) { this.idReserva = idReserva; }

    public String getEstadoReserva() { return estadoReserva; }
    public void setEstadoReserva(String estadoReserva) { this.estadoReserva = estadoReserva; }

    public String getFechaReserva() { return fechaReserva; }
    public void setFechaReserva(String fechaReserva) { this.fechaReserva = fechaReserva; }

    public Integer getIdVuelo() { return idVuelo; }
    public void setIdVuelo(Integer idVuelo) { this.idVuelo = idVuelo; }

    public String getTipoVuelo() { return tipoVuelo; }
    public void setTipoVuelo(String tipoVuelo) { this.tipoVuelo = tipoVuelo; }

    public String getDisponibilidad() { return disponibilidad; }
    public void setDisponibilidad(String disponibilidad) { this.disponibilidad = disponibilidad; }

    public String getAvion() { return avion; }
    public void setAvion(String avion) { this.avion = avion; }

    public String getEstadoAvion() { return estadoAvion; }
    public void setEstadoAvion(String estadoAvion) { this.estadoAvion = estadoAvion; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public String getHoraVuelo() { return horaVuelo; }
    public void setHoraVuelo(String horaVuelo) { this.horaVuelo = horaVuelo; }
}
