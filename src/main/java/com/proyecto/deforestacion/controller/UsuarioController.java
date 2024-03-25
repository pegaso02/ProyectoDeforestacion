package com.proyecto.deforestacion.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto.deforestacion.model.Usuarios;
import com.proyecto.deforestacion.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registro")           /*OK*/
    public ResponseEntity<Usuarios> guardarUsuario(@RequestBody Usuarios usuario) {
        Usuarios nuevoUsuario = usuarioService.guardarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoUsuario);
    }
    
    @GetMapping("/")  /*OK*/
    public List<Usuarios> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @GetMapping("/{id}")    /*OK*/
    public Usuarios obtenerUsuarioPorId(@PathVariable Long id) {
        return usuarioService.obtenerUsuarioPorId(id);
    }

    @PutMapping("/{id}")   /*OK*/
    public void actualizarUsuario(@PathVariable Long id, @RequestBody Usuarios usuario) {
        usuarioService.actualizarUsuario(id,usuario);
    }

    @DeleteMapping("/{id}")  /*OK*/
    public void eliminarUsuario(@PathVariable Long id) {
        usuarioService.eliminarUsuario(id, usuarioService.obtenerUsuarioPorId(id));
    }
}
