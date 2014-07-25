package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import android.text.Html;

import com.mysql.jdbc.Statement;

import Entidades.Evaluacion;
import Interface.IdaoEvaluacion;
import Entidades.Usuario;

public class DBdaoEvaluacion implements IdaoEvaluacion {

	public String LlamarNotas(Evaluacion evaluacion) {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement pst = null;

		System.out.println("id Usuario " + Usuario.getIdUsuario().toString());

		String sql = "SELECT tipo_evaluacion, nota FROM evaluaciones WHERE id_usuario = "
				+ Usuario.getIdUsuario()
				+ " and id_asignatura = "
				+ evaluacion.getId_asignatura();

		try {
			conn = Conexion.conectorBd();
			Statement stmt = (Statement) conn.createStatement();
			ResultSet res = stmt.executeQuery(sql);

			// ejecutamos consulta SQL de selecci�n (devuelve datos)

			String resultadoSQL = "";
			Integer numColumnas = 0;

			// n�mero de columnas (campos) de la consula SQL
			numColumnas = res.getMetaData().getColumnCount();

			// mostramos el resultado
			while (res.next()) {
				// obtenemos el t�tulo de las columnas
				// for (int i = 1; i <= numColumnas; i++) {
				// if (resultadoSQL != "")
				// if (i < numColumnas)
				// resultadoSQL = resultadoSQL
				// + res.getMetaData().getColumnName(i)
				// .toString() + ";";
				// else
				// resultadoSQL = resultadoSQL
				// + res.getMetaData().getColumnName(i)
				// .toString();
				// else if (i < numColumnas)
				// resultadoSQL = res.getMetaData().getColumnName(i)
				// .toString()
				// + ";";
				// else
				// resultadoSQL = res.getMetaData().getColumnName(i)
				// .toString();
				//
				// }
				resultadoSQL = resultadoSQL + " ";
				// obtenemos los datos de cada columna
				for (int i = 1; i <= numColumnas; i++) {
					if (res.getObject(i) != null) {
						if (resultadoSQL != "")
							if (i < numColumnas)
								resultadoSQL = resultadoSQL
										+ res.getObject(i).toString()
										+ "        --       ";
							else
								resultadoSQL = resultadoSQL
										+ res.getObject(i).toString();
						else if (i < numColumnas)
							resultadoSQL = res.getObject(i).toString()
									+ "        --       ";
						else
							resultadoSQL = res.getObject(i).toString();
					} else {
						if (resultadoSQL != "")
							resultadoSQL = resultadoSQL + "null;";
						else
							resultadoSQL = "null;";
					}
				}
				resultadoSQL = resultadoSQL + Html.fromHtml("<br/>");
			}
			// textResultadoSQL.setText(resultadoSQL);

			return resultadoSQL;

			// stmt.close();
			// res.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}

	}

}
