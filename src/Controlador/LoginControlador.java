/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Clientes;
import java.sql.Connection;
import dados.Clientesdados;
import dados.Conexao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import trabalho.Login;
import trabalho.Produtos;

public class LoginControlador {
    private Login trabalho;

    public LoginControlador(Login trabalho) {
        this.trabalho = trabalho;
    }

    public void autenticador() throws SQLException {
        
            String Nome = trabalho.getC_senha().getText();
            String Senha = trabalho.getC_login().getText();
            Clientes clienteautenticar = new Clientes(Nome , Senha);

            Connection conexao = new Conexao().getConnection();
            Clientesdados clientesdados = new Clientesdados( conexao);
            boolean existe = clientesdados.existepornoBancoNomeeSenha(clienteautenticar);

            if (existe) {
                Produtos teladeprodutos = new Produtos();
                teladeprodutos.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(trabalho, "Nome ou Senha Inválidos");
            }
        }
    }


