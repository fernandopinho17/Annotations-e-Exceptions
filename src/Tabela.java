import java.util.HashMap;
import java.util.Map;

public class Tabela {
    private String nomeTabela;
    private Map<String, Double> notas;

    public Tabela(String nomeTabela) {
        this.nomeTabela = nomeTabela;
        this.notas = new HashMap<>();
    }

    public void adicionarNota(String aluno, double nota) {
        notas.put(aluno, nota);
    }

    public double obterNota(String aluno) {
        return notas.getOrDefault(aluno, -1.0); // Retorna -1 se o aluno não estiver na tabela
    }

    public void imprimirNotas() {
        System.out.println("Notas da Tabela: " + nomeTabela);
        for (Map.Entry<String, Double> entry : notas.entrySet()) {
            System.out.println("Aluno: " + entry.getKey() + ", Nota: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso
        Tabela tabelaNotas = new Tabela("NotasTrimestre1");

        tabelaNotas.adicionarNota("Joao", 8.5);
        tabelaNotas.adicionarNota("Maria", 9.0);
        tabelaNotas.adicionarNota("Pedro", 7.5);

        tabelaNotas.imprimirNotas();

        System.out.println("Nota de Joao: " + tabelaNotas.obterNota("Joao"));
        System.out.println("Nota de Carlos: " + tabelaNotas.obterNota("Carlos"));
    }
}