/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica08ramirezvivancoivan;

/**
 *
 * @author ivanc
 */
public class Nodo {
    private int valor;
    private Nodo nodoSiguiente;

    public Nodo(int valor) {
        this.valor = valor;
        nodoSiguiente = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }
}
