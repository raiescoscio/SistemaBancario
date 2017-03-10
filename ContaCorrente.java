/*
 * @author Raí Escoscio
 */
package sistechined;
public class ContaCorrente extends ContaBanco {
    private double limite;

    public ContaCorrente() {
        this.limite = 0;
    }
    
    //construtor cc
    public ContaCorrente( int numConta, int agencia, String nome, String data, double limite) {
        super(numConta, agencia, nome, data); //herda os atributos da classe ContaBanco.
        this.limite = limite;
    }
    @Override //sobreposição
    public void sacar(double valor){
        System.out.println("---------------------------------");
        if (valor > 0) {    //verifica se é um valor real positivo
            
            if (valor <= getSaldo()&& valor <= getLimite()){                           
                setSaldo(getSaldo() - valor);
                System.out.println(getTitular() + ", Saque realizado com sucesso!");
            } else if(valor > getSaldo() && valor <= getLimite()) {
                System.out.println(getTitular() + ", Não foi possível realizar o saque. Saldo insuficiente! ");
                System.out.println("Seu saldo é: " + getSaldo());
            }
            else if (valor > getLimite()){
                System.out.println("Atenção " + getTitular() + ", limite de saque excedido! Seu limite é: R$ " + getLimite());
               
            }
        } else {
            System.out.println(getTitular() + ", valor inválido, tente novamente!");
        }
        
    }
    

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
    
}
