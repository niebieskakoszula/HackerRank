package ExcetionHandling_TryCatch;

import java.util.*;
public class TryCatch {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            var x = scanner.nextInt();
            var y = scanner.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
