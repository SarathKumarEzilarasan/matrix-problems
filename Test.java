package demo;

public class Test {

    public static int[][] pattern(int n) {
        int[][] arr = new int[n][n];
        int num = 1;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) { // j = 0 , 1 ,2 ,3, 4
                if (i % 2 == 0) {
                    //increasing
                    arr[j][i] = num; // j -> 0 to n
                } else {
                    //decreasing    // j -> n to 0 -> n - j -> 6-0 => 6 => 6-1 => 5 => 6-2 =>4
                    arr[n - 1 - counter][i] = num; // counter -> o to n
                    counter++;
                }
                num++;
            }
            counter = 0;
        }
        return arr;
    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0)
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String printPattern(int n) {
        String output = "";
        if (n <= 0) {
            output = "Provide a valid input";
        } else {
            int[][] arr = pattern(n);
            printMatrix(arr);
            output = "Printing the matrix";
        }
        return output;

    }

    public static void main(String[] args) {
        System.out.println(printPattern(6));
        System.out.println(printPattern(5));
        System.out.println(printPattern(0));
        System.out.println(printPattern(-1));
    }
}

