/*
 * @author Raí Escoscio
 */
package sistechined;

public class  ContaBanco {
    private int numConta;
    private int agencia;
    private String titular;
    private String data;
    private double saldo;

    //construtor default
    public ContaBanco() {
    }
    //cconstrutor com parâmetros
    public ContaBanco(int numConta, int agencia, String nome, String data) {
        this.numConta = numConta;
        this.agencia = agencia;
        this.titular = nome;
        this.data = data;
    }
    
    
    public void sacar(double valor){
        System.out.println("---------------------------------");
        if (valor > 0) {    //verifica se é um valor real positivo
            
            if (valor <= getSaldo()){                           
                setSaldo(getSaldo() - valor);
                System.out.println(getTitular()+ ", saque realizado com sucesso!");
            } else {
                System.out.println(getTitular() + ", impossível realizar o saque, saldo insuficiente!");
            }
        } else {
            System.out.println(getTitular() + ", valor inválido, tente novamente!");
        }
    }
    
    public void depositar(double valor){
        System.out.println("---------------------------------");
        if (valor > 0) {    //verifica se é um valor real positivo
            setSaldo(getSaldo()+valor);
            System.out.println(getTitular() + ", depósito realizado com sucesso!");
        }else{
            System.out.println(getTitular() + ", valor inválido, tente novamente!");
        }
    }
    
    public void transferir(ContaBanco destino, double valor){
        System.out.println("-------------::::::--------------- ");
        if (valor > 0) {    //verifica se é um valor real positivo
            if (valor <= getSaldo()){     //verifica se o valor está disponível na conta                      
                setSaldo(getSaldo() - valor);
                destino.setSaldo(destino.getSaldo() + valor);
                System.out.println("Transferencia realizada com sucesso para " + destino.getTitular());
                double taxatransferencia = 3.0;
                double valordescontado = (taxatransferencia * valor)/100;
                setSaldo(getSaldo() - valordescontado);
            } else {
                System.out.println("Impossível realizar a transferência, saldo insuficiente!");
            }
            
        }else{
            System.out.println("Impossivel transferir esse valor!");
        }
    }
    public void mostrarConta(){
        System.out.println("---------------------------------");
        System.out.println("Conta: " + getNumConta());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Nome: " + getTitular());
        System.out.println("Data de abertura: " + getData());
        System.out.println("Saldo: " + getSaldo());
        
    } 

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}


