package com.backend.backend.dto;

public class ClienteInfoDTO {
    private String nombreCompleto;
    private Integer cedula;
    private String tipoCliente;
    private Integer idReserva;
    private String estadoReserva;
    private Integer idVuelo;
    private String tipoVuelo;
    private String disponibilidad;
    private String avion;
    private String estadoAvion;
    private String destino;
    private String horaVuelo;

    public ClienteInfoDTO(String nombreCompleto, Integer cedula, String tipoCliente, 
                          Integer idReserva, String estadoReserva, Integer idVuelo, 
                          String tipoVuelo, String disponibilidad, String avion, 
                          String estadoAvion, String destino, String horaVuelo) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.tipoCliente = tipoCliente;
        this.idReserva = idReserva;
        this.estadoReserva = estadoReserva;
        this.idVuelo = idVuelo;
        this.tipoVuelo = tipoVuelo;
        this.disponibilidad = disponibilidad;
        this.avion = avion;
        this.estadoAvion = estadoAvion;
        this.destino = destino;
        this.horaVuelo = horaVuelo;
    }

    // Getters
    public String getNombreCompleto() { return nombreCompleto; }
    public Integer getCedula() { return cedula; }
    public String getTipoCliente() { return tipoCliente; }
    public Integer getIdReserva() { return idReserva; }
    public String getEstadoReserva() { return estadoReserva; }
    public Integer getIdVuelo() { return idVuelo; }
    public String getTipoVuelo() { return tipoVuelo; }
    public String getDisponibilidad() { return disponibilidad; }
    public String getAvion() { return avion; }
    public String getEstadoAvion() { return estadoAvion; }
    public String getDestino() { return destino; }
    public String getHoraVuelo() { return horaVuelo; }
}
