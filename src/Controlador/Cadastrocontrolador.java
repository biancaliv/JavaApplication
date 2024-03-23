/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Clientes;
import dados.Clientesdados;
import dados.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import trabalho.Cadastro;
import trabalho.Menu;

/**
 *
 * @author Navas
 */
public class Cadastrocontrolador {
    private Cadastro trabalho;

    public Cadastrocontrolador(Cadastro trabalho) {
        this.trabalho = trabalho;
    }
    public void salvaCliente(){
       
     String Nome = trabalho.getC_nome().getText();
   String Senha =trabalho.getC_senha().getText();
   String Endereco =trabalho.getC_endereco().getText();
   String Telefone =trabalho.getC_telefone().getText();
   String Email = trabalho.getC_email().getText();


Clientes cliente = new Clientes(Nome, Senha, Endereco, Telefone, Email);
      
        try {
            Connection conexao = new Conexao().getConnection();
            Clientesdados clientesdados = new Clientesdados( conexao);
            
            clientesdados.insert(cliente);
            
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
            Menu teladeMenu = new Menu();
        teladeMenu.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
