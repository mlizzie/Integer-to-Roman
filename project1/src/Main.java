import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input roman: ");
        String s = in.nextLine();
        Integer num = Solution.romanToInt(s);
        System.out.println(num);
    }
}
