package demo;

public class User {

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0)
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] print(int n) {
        int num = (int) Math.round((double) n / 2);
        int[][] arr = new int[n][n];
        int count = 0;
        int lTop = 0, lBottom = n - 1, rTop = n - 1, rBottom = 0;

        while (count < n * n) {
            for (int i = lTop; i < rTop; i++) {
                arr[lTop][i] = num;
                count++;
            }
            for (int i = rTop; i > rBottom; i--) { // i -> n-1 to 0 -> 0 to n-1
                arr[n - 1 - i][rTop] = num; // n-1-n-1 = 0 , n-1-n-2 => 1
                count++;
            }
            rTop--;
            for (int i = rBottom; i < lBottom; i++) { // n-1-0 to n-1-n-1 -> n-1 to 0
                arr[n - 1 - rBottom][n - 1 - i] = num;
                count++;
            }
            rBottom++;
            for (int i = lBottom; i > lTop; i--) { // n-1-n-1 -> 0
                arr[i][n - 1 - lBottom] = num;
                count++;
            }
            lTop++;
            lBottom--;
            num--;
            if (count == n * n - 1) {
                arr[lTop][lTop] = num;
                count++;
            }
        }


        return arr;
    }

    public static void main(String[] args) {
        printMatrix(print(5));
        printMatrix(print(7));


    }
}
