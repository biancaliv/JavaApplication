/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;
import java.sql.PreparedStatement;
import java.sql.Connection;
import Modelo.Clientes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import trabalho.Cadastro;
/**
 *
 * @author Navas
 */
public class Clientesdados {
    private final Connection connection; 

    public Clientesdados(Connection connection) {
        this.connection = connection;
    }
    public void insert(Clientes cliente) throws SQLException{
        
        try (connection) {
            String sql = "Insert into Clientes (Nome,Senha,Endereco,Telefone,Email) values('"+cliente.getNome() +"','"+cliente.getSenha()+"','"+cliente.getEndereco()+"','"+cliente.getTelefone()+"','"+cliente.getEmail()+"'); ";
            PreparedStatement statement = connection.prepareStatement(sql);
           statement.execute();
        }
    }
    
   public boolean existepornoBancoNomeeSenha(Clientes clienteautenticar) throws SQLException {
        String sql = "SELECT * FROM `Clientes` WHERE Nome = '"+clienteautenticar.getNome()+"' and Senha = '"+clienteautenticar.getSenha()+"' " ;
        PreparedStatement statement = connection.prepareStatement(sql);
           statement.execute();
        ResultSet resultSet = statement.getResultSet();
        return resultSet.next();
    }
   
    }
    
    




