package com.backend.backend.controller;

import com.backend.backend.dto.ClienteInfoDTO;
import com.backend.backend.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = {
        "*"
})
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    // Búsqueda por cédula
    @GetMapping("/buscar")
    public ResponseEntity<ClienteInfoDTO> buscarClientePorCedula(@RequestParam Integer cedula) {
        return clienteService.getClienteInfoByCedula(cedula)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Búsqueda por nombre
    @GetMapping("/buscarPorNombre")
    public ResponseEntity<List<ClienteInfoDTO>> buscarClientePorNombre(@RequestParam String nombre) {
        List<ClienteInfoDTO> clientes = clienteService.getClientesInfoByNombre(nombre);
        return clientes.isEmpty() ? 
                ResponseEntity.notFound().build() : 
                ResponseEntity.ok(clientes);
    }

    // Búsqueda por apellido
    @GetMapping("/buscarPorApellido")
    public ResponseEntity<List<ClienteInfoDTO>> buscarClientePorApellido(@RequestParam String apellido) {
        List<ClienteInfoDTO> clientes = clienteService.getClientesInfoByApellido(apellido);
        return clientes.isEmpty() ? 
                ResponseEntity.notFound().build() : 
                ResponseEntity.ok(clientes);
    }

    // Búsqueda por nombre completo
    @GetMapping("/buscarPorNombreCompleto")
    public ResponseEntity<List<ClienteInfoDTO>> buscarClientePorNombreCompleto(@RequestParam String nombreCompleto) {
        List<ClienteInfoDTO> clientes = clienteService.getClientesInfoByNombreCompleto(nombreCompleto);
        return clientes.isEmpty() ? 
                ResponseEntity.notFound().build() : 
                ResponseEntity.ok(clientes);
    }
}