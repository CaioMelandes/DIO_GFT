import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private final List<Conta> contas = new ArrayList<>();

    public void getContas() {
        System.out.println(contas);
    }

    public void addContas(Conta conta) {
        this.contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
