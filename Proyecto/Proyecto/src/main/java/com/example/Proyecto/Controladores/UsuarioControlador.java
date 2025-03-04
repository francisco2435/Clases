package com.example.Proyecto.Controladores;

import com.example.Proyecto.Modelos.Usuario;
import com.example.Proyecto.Servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/usuario")
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    //Crear nuevo usuario
    @PostMapping("/nuevousuario")
    public Usuario registrarUsuario(@RequestBody Usuario usuario) {
        return usuarioServicio.registrarUsuario(usuario.nombre, usuario.edad, usuario.contrasenia, usuario.correo);
    }
}
