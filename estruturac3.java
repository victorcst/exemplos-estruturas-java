import java.util.Scanner;

public class estruturac3 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int num;
        String ask;

        System.out.println("Deseja inciar? (sim / não)");
        ask = ler.next();

        while(ask.equals("sim")){
            System.out.println("Escreva um número e ele será multiplicado por 3: ");
            num = ler.nextInt();
            System.out.println(num *3);
            System.out.println("Deseja continuar?");
            ask = ler.next();
        }
        ler.close();
    }
    
}
