import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int i = in.nextInt(); //recebe double
        if(i < 0){
            i = in.nextInt();
        }
        System.out.println("Digite um nome: ");
        in.nextLine();//Limpeza de buffer
        String n = in.nextLine();
        f(n, i);
    }

    public static void f(String n, int i) {
        String x = "Olá, " + n + "!";
        System.out.println(x);
        if (i < 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }


    public static double calcula(double p, double a){
        double rs;
        rs = p / (a*a);
        return rs;
    }

}
