/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empresaProyectoFinal.models;

import com.empresaProyectoFinal.utils.Permisos;

/**
 *
 * @author will
 */
public class Usuario {
    private final String username;
    private final  Permisos permiso;
    
    public Usuario(String username, Permisos permiso){
        this.username = username;
        this.permiso = permiso;
    }

    public String getUsername() {
        return username;
    }

    public Permisos getPermiso() {
        return permiso;
    }
    
    public boolean obtenerPermiso(String permisoSrt){
        return this.permiso.toString().equalsIgnoreCase(permisoSrt);
    }
    
    
}