import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение:" );
        String str = scanner.nextLine();
        System.out.println(calc(str));
    }
    public static String calc(String input) throws MyException {
        Operation operation = new Operation(input);
        return "Ответ: " + (operation.flagRoman ? operation.resultForRoman() : operation.resultForArabic());
    }

}