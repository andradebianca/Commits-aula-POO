package com.mycompany.bancosistema;


public class Conta {
        private double saldo, limite;
        private int agencia, numero;

    Conta (){ //metodo construtor default.
              // Evidenciar o conta em vazio. (Obrigatoriamente deve-se declarar ao utilizar o método construtor. pela boa pratica)
    }

    public Conta(double saldoinicial, double limite, int agencia, int numero) {
        this.saldo = saldoinicial;
        this.limite = limite;
        this.agencia = agencia;
        this.numero = numero;
    }
   
    Conta (double valor){
        creditar(valor);
    }


    
    public String imprimir()
    {
        return "SALDO:" + getSaldo();
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @return the limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //metodo responsavel para fazer o saldo disponivel
    public double getSaldoDisponivel(){       
    return saldo + limite;  
    }  
    
    public void creditar(double valor){
        saldo += valor;
    }

    public boolean debitar(double valor){
        
        if(valor <= getSaldoDisponivel()) 
        {
            saldo -= valor;
            return true;
        } else{
            System.out.println("Saldo Insuficiente.");
            return false;
        }
        
    }
    
    public boolean transferir(Conta destino, double valor){
            if (debitar(valor) == true){
                destino.creditar(valor);
                return true;
            }else
            {
                System.out.println("Impossivel concluir transação.");
                return false;
            }
            
        
        
    }
}

