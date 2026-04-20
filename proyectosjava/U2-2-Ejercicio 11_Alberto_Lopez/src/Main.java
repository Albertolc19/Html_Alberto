import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 1;

        System.out.println("Introduce un numero por favor:");
        while (!sc.hasNextInt()) {
            System.out.println("Introduce un numero por favor:");
            sc.nextLine();
        }
        num = sc.nextInt();
        num2 = num;
        num3 = num;

        while (num != 0) {
            while (num2 != 0) {
                System.out.print(+num4);
                num2--;
            }
            num4++;
            num--;
            num2 = num3;
            System.out.println("");
        }
    }
}