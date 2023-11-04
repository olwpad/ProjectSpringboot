package com.example.intento2.dao;

import com.example.intento2.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);


    Usuario obtenerUsuarioPorCredenciales(Usuario usuario);
}