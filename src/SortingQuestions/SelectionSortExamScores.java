package SortingQuestions;

public class SelectionSortExamScores {

    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex])
                    minIndex = j;
            }

            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {67, 85, 45, 92};
        selectionSort(scores);

        for (int s : scores) {
            System.out.print(s + " ");
        }
    }
}
