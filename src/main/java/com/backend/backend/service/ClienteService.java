package com.backend.backend.service;

import com.backend.backend.dto.ClienteInfoDTO;
import com.backend.backend.model.VistaDetalleReservas;
import com.backend.backend.repository.VistaDetalleReservasRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    private final VistaDetalleReservasRepository vistaRepo;

    public ClienteService(VistaDetalleReservasRepository vistaRepo) {
        this.vistaRepo = vistaRepo;
    }

    // Búsqueda por cédula
    public Optional<ClienteInfoDTO> getClienteInfoByCedula(Integer cedula) {
        return vistaRepo.findByIdCliente(cedula)
                .map(this::convertToDTO);
    }

    // Búsqueda por nombre
    public List<ClienteInfoDTO> getClientesInfoByNombre(String nombre) {
        return vistaRepo.findByNombreClienteContainingIgnoreCase(nombre)
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    // Búsqueda por apellido
    public List<ClienteInfoDTO> getClientesInfoByApellido(String apellido) {
        return vistaRepo.findByApellidoClienteContainingIgnoreCase(apellido)
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    // Búsqueda por nombre completo (nombre + apellido)
    public List<ClienteInfoDTO> getClientesInfoByNombreCompleto(String nombreCompleto) {
        String[] partes = nombreCompleto.split(" ");
        if (partes.length >= 2) {
            // Si tiene al menos dos partes, buscar por nombre y apellido
            String nombre = partes[0];
            String apellido = partes[1];
            return vistaRepo.findByNombreClienteContainingIgnoreCase(nombre)
                    .stream()
                    .filter(v -> v.getApellidoCliente().toLowerCase().contains(apellido.toLowerCase()))
                    .map(this::convertToDTO)
                    .collect(Collectors.toList());
        } else {
            // Si solo tiene una parte, buscar por nombre
            return getClientesInfoByNombre(nombreCompleto);
        }
    }

    private ClienteInfoDTO convertToDTO(VistaDetalleReservas v) {
        return new ClienteInfoDTO(
                v.getNombreCliente() + " " + v.getApellidoCliente(),
                v.getIdCliente(),
                v.getTipoCliente(),
                v.getIdReserva(),
                v.getEstadoReserva(),
                v.getIdVuelo(),
                v.getTipoVuelo(),
                v.getDisponibilidad(),
                v.getAvion(),
                v.getEstadoAvion(),
                v.getDestino(),
                v.getHoraVuelo()
        );
    }
}