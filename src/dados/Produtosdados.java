/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;
import java.sql.PreparedStatement;
import java.sql.Connection;
import Modelo.NomedeProdutos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import trabalho.Cadastro;
import java.sql.DriverManager;
import trabalho.Produtos;




/**
 *
 * @author Navas
 */
public class Produtosdados {
private final Connection connection; 
    public Produtosdados(Connection connection) {
        this.connection = connection;
    }

 public static ResultSet consultar(String sql)throws SQLException {
        ResultSet result;
        System.out.println("Conectando ao banco de dados");
        java.sql.Connection conexao = DriverManager.getConnection("jdbc:mysql://mysql27-farm1.kinghost.net/doctusedtech07", "doctusedtech07", "3Grupo2023");
        System.out.println("Conexão efetuada com sucesso.");
        java.sql.Statement st = conexao.createStatement();
        result = st.executeQuery(sql);
        return result;
}
}
