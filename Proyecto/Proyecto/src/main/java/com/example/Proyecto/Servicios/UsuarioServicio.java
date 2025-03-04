package com.example.Proyecto.Servicios;


import com.example.Proyecto.Modelos.Usuario;
import com.example.Proyecto.Repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    //Nuevo Usuario
    public Usuario registrarUsuario(String nombre, int edad, String contrasenia, String correo) {
        Usuario newUsuario = new Usuario(nombre, edad, contrasenia, correo);
        Usuario existente = usuarioRepositorio.findByCorreo(newUsuario.getCorreo());
        if(existente != null) {
            return null;
        }
        return usuarioRepositorio.save(newUsuario);
    }

}
