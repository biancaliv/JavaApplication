/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Navas
 */
public class Clientes {

    public int getIdClientes() {
        return IdClientes;
    }

    public void setIdClientes(int IdClientes) {
        this.IdClientes = IdClientes;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Clientes(int IdClientes, String Nome, String Senha, String Endereco, String Telefone, String Email) {
        this.IdClientes = IdClientes;
        this.Nome = Nome;
        this.Senha = Senha;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Email = Email;
    }

    public Clientes(String Nome, String Senha, String Endereco, String Telefone, String Email) {
        this.Nome = Nome;
        this.Senha = Senha;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Email = Email;
    }
private int IdClientes;    

    public Clientes(String Nome, String Senha) {
        this.Nome = Nome;
        this.Senha = Senha;
    }
    private String Nome;
    private String Senha;
    private String Endereco;
    private String Telefone;
    private String Email;
    


   
    
}


