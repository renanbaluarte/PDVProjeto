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
    
    String produto(int codigo, String nome, float preco, int quantiEstoque, String dataUltVenda){
    this.codigo = codigo;
    this.nome = nome;
    this.quantiEstoque = quantiEstoque;
    this.dataUltVenda = dataUltVenda;
        return null;
    
    }
    
    private int codigo;
    private String nome;
    private int unidade;
    private float preco;
    private int quantiEstoque;
    private String dataUltVenda;
    
    public int obtCod(){return codigo;}
    public String obtNome(){return nome;}
    public int obtUni(){return unidade;}
    public float obtPreco(){return preco;}
    public int obtQuantiEstoque(){return quantiEstoque;}
    public String obtDataUltVenda(){return dataUltVenda;}
    
    
    
    public void altCod(int codigo){this.codigo = codigo;}
    public void altNome(String nome){this.nome = nome;}
    public void altUni(int unidade){this.unidade = unidade;}
    public void altPreco(float preco){this.preco = preco;}
    public void altQuantiEstoque(int quantiEstoque){this.quantiEstoque = quantiEstoque;}
    public void altDataUltVenda(String dataUltVenda){this.dataUltVenda = dataUltVenda;}
}
