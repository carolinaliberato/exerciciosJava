import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Pessoa objetoPessoa = new Pessoa();

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o peso da pessoa");
        objetoPessoa.setPeso(leitorScanner.nextFloat());
        System.out.println("Digite a altura da pessoa");
        objetoPessoa.setAltura(leitorScanner.nextFloat());

        System.out.println("O IMC é: " + objetoPessoa.calcularIMC());

    }
}
