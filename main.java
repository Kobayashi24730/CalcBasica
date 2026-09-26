import java.util.Scanner;
import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Escolha uma operacao (+ - * / %): ");
        String op = scanner.nextLine();
        System.out.print("Escolha outro numero: ");
        double num2 = scanner.nextDouble();

        switch (op) {
                case "+":
                    double soma = num1 + num2;
                    System.out.printf("%.2f + %.2f = %.2f", num1, num2, soma);
                    break;
                case "-":
                    double menos = num1 - num2;
                    System.out.printf("%.2f - %.2f = %.2f", num1, num2, menos);
                    break;
                case "*":
                    double mult = num1 * num2;
                    System.out.printf("%.2f * %.2f = %.2f", num1, num2, mult);
                    break;
                case "/":
                    double div = num1 / num2;
                    System.out.printf("%.2f / %.2f = %.2f", num1, num2, div);
                    break;
                case "%":
                    double porc = num1 % num2;
                    System.out.printf("%.2f %% %.2f = %.2f", num1, num2, porc);
                    break;
        }
    }
}
