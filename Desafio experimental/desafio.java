import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//entrada de dados
        System.out.print("num1: ");
        int num1 = in.nextInt(); //recebe double
        if(num1 < 0){//validação
            num1 = in.nextInt();//espera receber numero maior que 0
        } System.out.print("nome: ");
        in.nextLine();//Limpeza de buffer
        String n = in.nextLine();
        f(n, num1, 51,1.81);
        double h  = t(1621,450);
        System.out.println("soma do total salario + vale = "+h);
    }
    
    //Esse metodo faz calculo
    public static void f(String n, int i, double p, double a) {
        String x = "Olá, " + n + "!";//monta menssagem
        double rs;
        double k;
        System.out.println(x);//exibi menssagem
        if (i < 18) {
            rs = p / (a*a);
            k = Math.round(rs * 100.0) / 100.0;
            System.out.println("Pode ter CNH");
            System.out.println(k +" é a massa");
        } else {
            rs = p / (a*a);
            k = Math.round(rs * 100.0) / 100.0;
            System.out.println("Não pode ter CNH");
            System.out.println(k +" é a massa");//exibi o valor da massa
        }
    }
    //esse retorna troco mercado
    public static double t(double p, double a){
        double s; s = p + a;//subtração
        return s;//retona valor
    }
    
    public static void tab(int num1){
        int i,r;
        for (i=0; i<=10; i=i+1){//incrementa + 1
            r = num1*i;//resultado
            System.out.println(num1+" * "+i+" = "+r);//exibi
        }
    }
}
