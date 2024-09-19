package restaurante.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
 
import javax.swing.JOptionPane;
 
public class ConnectionFactory {
	public static Connection createConnection() {
		String stringDeConexao = "jdbc:mysql://localhost:3306/db_restaurante";
		String usuario = "root";
		String senha = "";
		Connection conexao = null;
		try {
			conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);
			JOptionPane.showMessageDialog(null, "Conexão Realizada!");
		}catch(Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Falha na Conexão!");
		}
		return conexao;
	}
}