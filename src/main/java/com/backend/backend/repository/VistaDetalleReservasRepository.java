package com.backend.backend.repository;

import com.backend.backend.model.VistaDetalleReservas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VistaDetalleReservasRepository extends JpaRepository<VistaDetalleReservas, Integer> {
    
    // Búsqueda por cédula
    Optional<VistaDetalleReservas> findByIdCliente(Integer idCliente);
    
    // Búsqueda por nombre (ignorando mayúsculas/minúsculas)
    @Query("SELECT v FROM VistaDetalleReservas v WHERE LOWER(v.nombreCliente) LIKE LOWER(CONCAT('%', :nombre, '%'))")
    List<VistaDetalleReservas> findByNombreClienteContainingIgnoreCase(@Param("nombre") String nombre);
    
    // Búsqueda por apellido (ignorando mayúsculas/minúsculas)
    @Query("SELECT v FROM VistaDetalleReservas v WHERE LOWER(v.apellidoCliente) LIKE LOWER(CONCAT('%', :apellido, '%'))")
    List<VistaDetalleReservas> findByApellidoClienteContainingIgnoreCase(@Param("apellido") String apellido);
}