import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int[] elems = new int[scanner.nextInt()];
        for (int i = 0; i < elems.length; i++) {
            elems[i] = i;
            System.out.print("Введите " + elems[i] + " элемент: ");
            int value = scanner.nextInt();
            elems[i] = value;
        }
        int count;
        do {
            count = 0;
            for (int i = 0; i < elems.length-1; i++) {
                if (elems[i] > elems[i + 1]) {
                    int temp = elems[i];
                    elems[i] = elems[i + 1];
                    elems[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);
        System.out.println("Массив после сортировки: ");
        for(int i = 0; i < elems.length; i++) {
                System.out.println(count++ + " - й элемент: " + elems[i]);
        }
    }
}

