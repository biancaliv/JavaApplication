/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Navas
 */
public class NomedeProdutos {

    public int getIdProdutos() {
        return IdProdutos;
    }

    public void setIdProdutos(int IdProdutos) {
        this.IdProdutos = IdProdutos;
    }

    public String getNomeProduto() {
        return NomeProduto;
    }

    public void setNomeProduto(String NomeProduto) {
        this.NomeProduto = NomeProduto;
    }

    public String getQtdeEstoque() {
        return QtdeEstoque;
    }

    public void setQtdeEstoque(String QtdeEstoque) {
        this.QtdeEstoque = QtdeEstoque;
    }

    public String getPrecoVenda() {
        return PrecoVenda;
    }

    public void setPrecoVenda(String PrecoVenda) {
        this.PrecoVenda = PrecoVenda;
    }

    public NomedeProdutos(String NomeProduto, String QtdeEstoque, String PrecoVenda) {
        this.NomeProduto = NomeProduto;
        this.QtdeEstoque = QtdeEstoque;
        this.PrecoVenda = PrecoVenda;
    }

    public NomedeProdutos(int IdProdutos, String NomeProduto, String QtdeEstoque, String PrecoVenda) {
        this.IdProdutos = IdProdutos;
        this.NomeProduto = NomeProduto;
        this.QtdeEstoque = QtdeEstoque;
        this.PrecoVenda = PrecoVenda;
    }

    public NomedeProdutos(String NomeProduto) {
        this.NomeProduto = NomeProduto;
    }

    private int IdProdutos;
    private String NomeProduto;
    private String QtdeEstoque;
    private String PrecoVenda;
            
}
