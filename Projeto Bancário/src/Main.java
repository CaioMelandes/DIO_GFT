public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente caio = new Cliente();
        caio.setNome("Caio");

        Conta corrente = new ContaCorrente(caio);
        Conta poupanca = new ContaPoupanca(caio);

        banco.addContas(corrente);
        banco.addContas(poupanca);

        corrente.depositar(200);
        corrente.transferir(100,poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        banco.getContas();
    }
}
