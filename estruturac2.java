import java.util.Scanner;

public class estruturac2 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        int idade, contador, qtde18;
        contador = 1;
        qtde18 = 0;

        while(contador < 10){
            System.out.println("Qual a sua idade:");
            idade = ler.nextInt();
            if(idade >18){
                qtde18 ++;
            }
            {
                contador ++;
            }
            {
                System.out.println(qtde18 +" Pessoas possuem mais de 18 anos.");
            }
        }
        ler.close();
    }
    
}
