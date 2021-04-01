import java.util.Scanner;

public class TotalCol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = scanner.nextInt();
        System.out.println("Enter column: ");
        int col = scanner.nextInt();

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = (int) Math.round(Math.random()*99);
            }
        }

        System.out.println("Elements of array: ");
        for (int i = 0; i < row; i++) {
            System.out.print("{\t");
            for (int j = 0; j < col; j++) {
                System.out.printf("%02d \t",arr[i][j]);
            }
            System.out.println("}");
        }

        System.out.println("Enter your column you want to calculate: ");
        int column = scanner.nextInt();
        if (column <= col) {
            System.out.println("Total in this column is: "+ totalCol(column,arr));
        } else System.out.println("Invalid");


    }

    public static int totalCol(int x, int[][] arr){
        int total=0;
        for (int[] ints : arr) {
            total += ints[x];
        }
        return total;

    }
}
