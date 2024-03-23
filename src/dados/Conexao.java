/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Navas
 */
public class Conexao {
 

public Connection getConnection()throws SQLException{
Connection conexao = DriverManager.getConnection("jdbc:mysql://mysql27-farm1.kinghost.net/doctusedtech07","doctusedtech07","3Grupo2023");
return conexao;
}
}   
