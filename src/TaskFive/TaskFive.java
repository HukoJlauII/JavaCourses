package TaskFive;

import java.util.*;


public class TaskFive {


    public static void runTaskFive() {
        System.out.print("Введите объём сейфа: ");
        Scanner sc = new Scanner(System.in);
        int volumeSafe = sc.nextInt();
        ArrayList<item> items = new ArrayList<>();
        int finalCost = 0;

        items.add(new item(27, 1000));
        items.add(new item(35, 1500));
        items.add(new item(13, 500));
        items.add(new item(22, 1000));
        items.add(new item(69, 3000));
        items.add(new item(29, 1500));

        for (int i = 0; i < items.size() - 1; i++) {
            for (int j = i; j < items.size(); j++) {
                if (items.get(i).getK() < items.get(j).getK()) {
                    Collections.swap(items, i, j);
                }
            }
        }

        System.out.println(Arrays.asList(items));
        int i = 0, count = 0;
        while (volumeSafe >= 0 && i < 6) {

            if (volumeSafe - items.get(i).getVolume() >= 0) {
                volumeSafe -= items.get(i).getVolume();
                finalCost += items.get(i).getCost();
                count++;
            } else {
                System.out.println(items.get(i) + " - " + count);
                count = 0;
                i++;
            }
        }
        System.out.println("Итоговая стоимость - " + finalCost);
    }

    static class item {
        private int volume;
        private int cost;

        public item(int volume, int cost) {
            this.volume = volume;
            this.cost = cost;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public int getVolume() {
            return volume;
        }

        public int getCost() {
            return cost;
        }

        public double getK() {
            return cost / volume;
        }

        @Override
        public String toString() {
            return "item{" +
                    "volume=" + volume +
                    ", cost=" + cost +
                    '}';
        }
    }

    public static void main(String[] args) {
        TaskFive.runTaskFive();
    }
}
