public class A {

    public static void f(String n, int i) {
        String x = "Olá, " + n + "!";
        System.out.println(x);
        if (i < 18) {
            System.out.println("Você é menor de idade.");
        } else {
            System.out.println("Você é maior de idade.");
        }
    }

    public static void main(String[] args) {
        f("Maria", 20);
    }
}
