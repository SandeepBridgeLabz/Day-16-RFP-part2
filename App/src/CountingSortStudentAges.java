import java.util.Arrays;

public class CountingSortStudentAges {

    public static void countingSort(int[] ages) {

        int maxAge = 18;
        int minAge = 10;

        int[] count = new int[maxAge + 1];

        for (int age : ages) {
            count[age]++;
        }

        int index = 0;

        for (int age = minAge; age <= maxAge; age++) {

            while (count[age] > 0) {

                ages[index++] = age;
                count[age]--;
            }
        }
    }

    public static void main(String[] args) {

        int[] ages = {15, 12, 18, 11, 14, 16, 10, 13};

        System.out.println("Before Sorting: " +
                Arrays.toString(ages));

        countingSort(ages);

        System.out.println("After Sorting: " +
                Arrays.toString(ages));
    }
}