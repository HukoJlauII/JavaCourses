package TaskThree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskThree {

    public static void runTaskThree() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        String[] splitString = str.split(" ");
        HashMap<Integer, ArrayList<String>> hashMap = new HashMap<>();
        Pattern pattern = Pattern.compile("[аоеёиуэыяюЁУЕЫАОЭЯИЮ]");

        for (int i = 0; i < splitString.length; i++) {
            int count = 0;
            Matcher matcher = pattern.matcher(splitString[i]);
            while (matcher.find()) {
                count++;
            }
            int j = 0;
            while (!pattern.matcher(splitString[i].substring(0, j)).find()) {
                j++;
            }
            splitString[i] = splitString[i].substring(0, j - 1) + Character.toUpperCase(splitString[i].charAt(j - 1)) + splitString[i].substring(j);
            if (hashMap.containsKey(count)) {
                hashMap.get(count).add(splitString[i]);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(splitString[i]);
                hashMap.put(count, list);
            }
        }
        String result = "";
        for (Map.Entry entry : hashMap.entrySet()) {
            result = entry.getKey() + "=" + entry.getValue() + " ; " + result;
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        TaskThree.runTaskThree();
    }
}
