package com.mycompany.bancosistema;


public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta(10);
        
        
        
        Conta c2 = new Conta();
        c1.transferir(c2, 5);

        System.out.println(c1.imprimir() + "\n" + c2.imprimir());
        
        
    }
}
