package se.lexicon.asha;

public class exercise10 {

    public static void main(String[] args) {
        int[][] numbers;

        numbers = multiplication_table(10,10);

        for (int row = 0; row < numbers.length ; row++)
        {
            for (int column = 0; column < numbers[row].length; column++)
            {
                System.out.printf("%2d ",numbers[row][column]);
            }
            System.out.println();

        }
    }

    public static int[][] multiplication_table(int r, int c)
    {
        int [][] a = new int[r][c];
        for (int row = 0; row < a.length ; row++)
        {
            for (int column = 0; column < a[row].length; column++)
            {
                a[row][column] = (row+1)*(column+1);
            }

        }
        return a;
    }
}
