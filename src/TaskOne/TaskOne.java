package TaskOne;

import java.util.Scanner;

public class TaskOne {
    public static void runTaskOne()
    {
        System.out.print("Введите строку: ");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int res=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
            {
                 res+=Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        TaskOne.runTaskOne();
    }
}
