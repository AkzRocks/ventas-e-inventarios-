/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empresaProyectoFinal.models;



/**
 *
 * @author will
 */
public class Login {
    private int id;
    private String nombre;
    private String username;
    private String pass;
    private String rol;

    public Login() {
    }

    public Login(int id, String nombre, String username, String pass, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.username = username;
        this.pass = pass;
        this.rol = rol;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return username;
    }

    public void setCorreo(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
}