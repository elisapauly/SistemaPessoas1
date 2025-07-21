import java.util.Scanner;
 
public class Pessoa1 extends Pessoas {

    private String endereco;

    public Pessoa1() {}

    public Pessoa1(String nome, String sobrenome, String genero, int idade, String numeroTelefone, String endereco) {
        super(nome, sobrenome, genero, idade, numeroTelefone);
        this.endereco = endereco;
    }

    public void lerDadosComEndereco(Scanner scanner) {
        super.lerDados(scanner);
        System.out.print("Endereço: ");
        this.endereco = scanner.nextLine();
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Sobrenome: " + getSobrenome());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Idade: " + getIdade());
        System.out.println("Telefone: " + getNumeroTelefone());
        System.out.println("Endereço: " + getEndereco());
        System.out.println();
    }
}
