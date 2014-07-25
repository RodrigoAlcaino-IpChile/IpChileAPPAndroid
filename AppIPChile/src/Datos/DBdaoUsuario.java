package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import android.content.Context;

import Entidades.Usuario;
import Interface.IdaoUsuario;

public class DBdaoUsuario implements IdaoUsuario {

	@Override
	public boolean ValidarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pst = null;

		// Consulta
		String sql = "select * from Usuario where usuario='"
				+ usuario.getUser() + "' and contrasena='" + usuario.getPass()
				+ "'";

		try {
			conn = Conexion.conectorBd();
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(sql);
			if (res.next()) {
				// Guarda Id Del USuario de la tabla idusuario
				usuario.setIdUsuario(res.getString("idusuario"));

				return true;

			} else {
				return false;

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return false;
		}
	}
}
