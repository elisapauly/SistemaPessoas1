import java.util.Scanner; 

public class Pessoa2 extends Pessoas {

    private String localNascimento;

    public Pessoa2() {}

    public Pessoa2(String nome, String sobrenome, String genero, int idade, String numeroTelefone, String localNascimento) {
        super(nome, sobrenome, genero, idade, numeroTelefone);
        this.localNascimento = localNascimento;
    }

    public void lerDadosComLocalNascimento(Scanner scanner) {
        super.lerDados(scanner);
        System.out.print("Local de nascimento: ");
        this.localNascimento = scanner.nextLine();
    }

    public String getLocalNascimento() {
        return this.localNascimento;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Sobrenome: " + getSobrenome());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Idade: " + getIdade());
        System.out.println("Telefone: " + getNumeroTelefone());
        System.out.println("Local de Nascimento: " + getLocalNascimento());
        System.out.println();
    }
}
