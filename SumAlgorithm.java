public class SumAlgorithm {

    public static void main(String[] args) {
        int[] score = {100, 75, 50, 37, 90, 95};
        int sum = 0;

        for (int i = 0; i < score.length; ++i) {
            sum += score[i] >= 80 ? score[i] : 0;
        }

        System.out.println(score.length + "명의 점수 중 80점 이상의 총점: " + sum);
    }
}