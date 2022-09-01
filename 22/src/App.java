import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        float totalCusto = 0.0f;
        float totalVenda= 0.0f;

        Scanner leitorScanner = new Scanner(System.in);
        int i = 0;

        for(; i < 40; i++) {
            System.out.println("Digite o nome do produto");
            nomeProduto = leitorScanner.next();
            System.out.println("Digite o preço de custo do produto");
            precoCusto = leitorScanner.nextFloat();  
            System.out.println("Digite o preço de venda do produto");
            precoVenda = leitorScanner.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;


            if (precoCusto == precoVenda){
                System.out.println("Houve empate entre o preço de custo e de venda");
            } else {
                if(precoCusto > precoVenda){
                    System.out.println("Houve prejuízo");
                } else {
                        System.out.println("Houve lucro");
                    }
                }

                System.out.println(nomeProduto + ", preço de custo = " + precoCusto + ", preço de venda = " + precoVenda);
            
            }
                System.out.println("A média do preço de custo é de : " + (totalCusto / i));
                System.out.println("A média do preço de venda é de : " + (totalVenda / i));

        }

    }
