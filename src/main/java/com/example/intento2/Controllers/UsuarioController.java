package com.example.intento2.Controllers;


import com.example.intento2.dao.UsuarioDao;
import com.example.intento2.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){

        Usuario usuario=new Usuario();
        usuario.setId(id);
        usuario.setNombre("Lucas");
        usuario.setApellido("Ortiz");
        usuario.setEmail("olwpad@gmail.com");
        usuario.setTelefono("234234234");
        return usuario ;
    }

    @RequestMapping(value="usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }


    @RequestMapping(value="usuario3")
    public Usuario editar(){

        Usuario usuario=new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Ortiz");
        usuario.setEmail("olwpad@gmail.com");
        usuario.setTelefono("234234234");

        return usuario ;
    }


    @RequestMapping(value="usuario4")
    public Usuario eliminar(){

        Usuario usuario=new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Ortiz");
        usuario.setEmail("olwpad@gmail.com");
        usuario.setTelefono("234234234");

        return usuario ;
    }
}