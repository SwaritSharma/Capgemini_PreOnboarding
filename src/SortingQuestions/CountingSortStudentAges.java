package SortingQuestions;

public class CountingSortStudentAges {

    public static void countingSort(int[] ages) {
        int min = 10;
        int max = 18;
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[ages.length];

        for (int age : ages)
            count[age - min]++;

        for (int i = 1; i < range; i++)
            count[i] += count[i - 1];

        for (int i = ages.length - 1; i >= 0; i--) {
            output[--count[ages[i] - min]] = ages[i];
        }

        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 14, 18, 11};
        countingSort(ages);

        for (int a : ages) {
            System.out.print(a + " ");
        }
    }
}
