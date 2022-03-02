public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numeroConta=" + numeroConta +
                ", cliente=" + cliente.getNome() +
                '}';
    }

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfos(){
        System.out.printf("Titular: %s \n", this.cliente.getNome());
        System.out.printf("Agência: %d \n",this.agencia);
        System.out.printf("Conta: %d \n",this.numeroConta);
        System.out.printf("Saldo: %.2f \n %n",this.saldo);
    }
}
