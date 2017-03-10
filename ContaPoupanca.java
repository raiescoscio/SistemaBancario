/*
 * @author Raí Escoscio
 */
package sistechined;

public class ContaPoupanca extends ContaBanco {
    private final double taxarendimento; 

    public ContaPoupanca() {
        this.taxarendimento = 0.5;
    }

    //construtor cp
    public ContaPoupanca(int numConta, int agencia, String nome, String data) {
        super(numConta, agencia, nome, data); //herda os atributos da classe ContaBanco.
        this.taxarendimento = 0.5;
    }
    
    //calcula o redimento mensal da poupança.
    //Esse método mostra o valor final sobre o saldo no mes q o valor ficou na conta.
    //juros simples
    public void redimentoMensal(){
        double valorfinal;
        valorfinal = (taxarendimento * getSaldo())/100;
        setSaldo(getSaldo()+valorfinal);
        System.out.println("--------------::::::-------------- ");
        System.out.println(getTitular() + ", Seu rendimento nesse mês foi: R$ " + valorfinal);
        System.out.println("Seu novo saldo com rendimentos é: R$ " + getSaldo());
    }
    
    public double getTaxarendimento() {
        return taxarendimento;
    }
}
