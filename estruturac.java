import java.util.Scanner;

public class estruturac{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int num1;

        System.out.println("Digite um número menor ou igual a 999 e te direi a sequência dele até mil:");
        num1 = ler.nextInt();

        System.out.println("Esta é a sequência: ");
        while(num1 <= 999){
            System.out.println(""+ (num1= num1 +1));
        }
        ler.close();
    }
}