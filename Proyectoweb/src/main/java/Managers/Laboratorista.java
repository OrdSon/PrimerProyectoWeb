/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.sql.DataSource;
import javax.swing.JOptionPane;

/**
 *
 * @author samuelson
 */
public class Laboratorista {

    public Laboratorista() {

    }

    public boolean crearLaboratorista(LinkedList<String> datos, DataSource dataSource) {
        Usuario usuario = new Usuario();
        LinkedList<String> datosUsuario = new LinkedList<>();
        datosUsuario.add(datos.get(0));
        datosUsuario.add(datos.get(1));
        datosUsuario.add("Laboratorista");

        if (comprobarNull(datosUsuario)) {
            usuario.crear(datosUsuario, dataSource);
        } else {
            return false;
        }
        if (comprobarNull(datos)) {
            String query = "insert into Laboratorista (Usuario_codigo, Usuario_contraseña, nombre, DPI, email, telefono, numero_registro, fecha_registro)"
                    + " values (?,?,?,?,?,?,?,?)";

            try (PreparedStatement estado = dataSource.getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

                for (int i = 0; i < datos.size(); i++) {
                    if (i == 7) {
                        estado.setDate(i + 1, stringAFecha(datos.get(i)));
                    } else {
                        estado.setString((i + 1), datos.get(i));
                    }
                }
                estado.executeUpdate();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    private boolean comprobarNull(LinkedList<String> datos) {
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i) == null || datos.get(i).isBlank()) {
                System.out.println("Algun dato es null");
                if (datos.get(7) == null) {
                    System.out.println("es la fecha");
                }
                return false;
            }
        }
        return true;
    }

    public Date stringAFecha(String fecha) {
        try {
            Date date = Date.valueOf(fecha);//converting string into sql date  
            return date;
        } catch (Exception e) {
            System.out.println("excepcion en fecha... no se porque jajajaja");
            return null;
        }
    }
}
