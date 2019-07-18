/**
 * Bubble sort.
 *
 * @author Evgeniy Barabanov
 * @version dated 18.07.2019
 */
public class Bubble {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5, 7, 6, 8, 9, 0};
        int a, b, t;
        int size;

        size = 10;

        System.out.print("Исходный массив: ");
        for (int i = 0; i < size; i++)
            System.out.print(" " + arr[i]);
        System.out.println();

        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (arr[b - 1] > arr[b]) {
                    t = arr[b - 1];
                    arr[b - 1] = arr[b];
                    arr[b] = t;
                }

            }
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < size; i++)
            System.out.print(" " + arr[i]);
        System.out.println();
    }
}