import java.util.Scanner;
import java.util.Stack;

public class IntStackReverse {
    public static void reverseIntStack() {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> integerStack = new Stack<>();
        System.out.println("Nhập số lượng n phần tử mảng:");
        int n = sc.nextInt();
        int a;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng:");
            a = sc.nextInt();
            integerStack.push(a);
        }

        System.out.println("Mảng trước khi đảo ngược là: ");
        System.out.println(integerStack);

        Stack<Integer> tempStack = new Stack<>();
        for (int i = 0; i < n; i++) {
            tempStack.push(integerStack.pop());
        }

        System.out.println("Mảng sau khi đảo ngược là: ");
        System.out.println(tempStack);
    }
}
