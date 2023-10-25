/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keleyrenan.pvdprojeto;

/**
 *
 * @author rdias
 */
public class Produto {
    
    private String codigo;
    private String nome;
    private int unidade;
    private float preco;
    private int quantiEstoque;
    private String dataUltVenda;
    
    public String obtCod(){return codigo;}
    public String obtNome(){return nome;}
    public int obtUni(){return unidade;}
    public float obtPreco(){return preco;}
    public int obtQuantiEstoque(){return quantiEstoque;}
    public String obtDataUltVenda(){return dataUltVenda;}
    
    
    
    public void altCod(String codigo){this.codigo = codigo;}
    public void altNome(String nome){this.nome = nome;}
    public void altUni(int unidade){this.unidade = unidade;}
    public void altPreco(float preco){this.preco = preco;}
    public void altQuantiEstoque(int quantiEstoque){this.quantiEstoque = quantiEstoque;}
    public void altDataUltVenda(String dataUltVenda){this.dataUltVenda = dataUltVenda;}
}
