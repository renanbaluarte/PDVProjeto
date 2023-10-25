/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keleyrenan.pvdprojeto;

/**
 *
 * @author rdias
 */
public class Venda extends Produto {
    private String dataVenda;
    private String horaVenda;
    private float valorVenda;
    private int quantiVendida;
    
    public String obtDataVenda(){return dataVenda;}
    public String obtHoraVenda(){return horaVenda;}
    public float obtValorVenda(){return valorVenda;}
    public int obtQuantiVendida(){return quantiVendida;}
    
    public void altDataVenda(String dataVenda){this.dataVenda = dataVenda;}
    public void altHoraVenda(String horaVenda){this.horaVenda = horaVenda;}
    public void altValorVenda(float valorVenda){this.valorVenda = valorVenda;}
}
