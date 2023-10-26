/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keleyrenan.pvdprojeto;

import java.util.ArrayList;

/**
 *
 * @author rdias
 */
public class Estoque {
    private static Estoque instance = null;
    private ArrayList<String> list;

    private Estoque() {
        list = new ArrayList<String>();
    }

    public static Estoque getInstance() {
        if (instance == null) {
            instance = new Estoque();
        }
        return instance;
    }

    public void add(String item) {
        list.add(item);
    }

    public void remove(String item) {
        list.remove(item);
    }

    public ArrayList<String> getList() {
        return list;
    }
}
