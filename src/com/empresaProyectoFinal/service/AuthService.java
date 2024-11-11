/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empresaProyectoFinal.service;

import com.empresaProyectoFinal.models.Usuario;
import com.empresaProyectoFinal.utils.Permisos;

/**
 *
 * @author will
 */
public class AuthService {
    public Usuario login(String username, String password){
         if ("admin".equals(username) && "1234".equals(password)) {
            return new Usuario(username, Permisos.ADMIN);
        } else if ("vendedor".equals(username) && "1234".equals(password)) {
            return new Usuario(username, Permisos.VENTAS);
        } else if ("inventario".equals(username) && "1234".equals(password)) {
            return new Usuario(username, Permisos.INVENTARIO);
        } else {
            return null;  // Credenciales inválidas
        }
    }
}
