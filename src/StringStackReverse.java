import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StringStackReverse {
    public static void reverseStringStack() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String string = sc.nextLine();

        System.out.println("Chuỗi trước khi đảo ngược là: ");
        System.out.println(string);

        String[] words = string.split("\\s");
        Stack<String> wStack = new Stack<>();
        wStack.addAll(Arrays.asList(words));

        Stack<String> mWord = new Stack<>();
        int n = wStack.size();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            output.append(mWord.push(wStack.pop())).append(" ");
        }

        System.out.println("Chuỗi sau khi đảo ngược là: ");
        System.out.println(output);
    }
}
