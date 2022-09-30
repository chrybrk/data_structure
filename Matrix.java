import java.util.*;

public class Matrix
{
    int[][] mat;
    int r;
    int c;

    Matrix()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrix Order: (row, column): ");
        int row = scanner.nextInt(); int column = scanner.nextInt();

        r = row; c = column;
        mat = new int[row][column];

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                System.out.printf("Value (%d, %d): ", i, j);
                int value = scanner.nextInt();
                mat[i][j] = value;
            }
        }
    }

    void print()
    {
        for (int i = 0; i < r; i++)
        {
            System.out.print("[ ");
            for (int j = 0; j < c; j++) System.out.print(mat[i][j] + " ");
            System.out.println("]");
        }
    }

    void linear_search(int value)
    {
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (mat[i][j] == value) System.out.printf("Value `%d` Found At: %d %d\n", value, i, j);
            }
        }
    }

    void bubble_sorting_row()
    {
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                for (int k = 0; k < c; k++)
                {
                    if (mat[i][j] < mat[i][k]) { int temp = mat[i][j]; mat[i][j] = mat[i][k]; mat[i][k] = temp; }
                }
    }

    void bubble_sorting_column()
    {
        for (int i = 0; i < c; i++)
            for (int j = 0; j < r; j++)
                for (int k = 0; k < r; k++)
                {
                    if (mat[k][i] > mat[j][i]) { int temp = mat[k][i]; mat[k][i] = mat[j][i]; mat[j][i] = temp; }
                }
    }

    public static void main(String[] args)
    {
        Matrix mat = new Matrix();
        mat.print();
        mat.bubble_sorting_row(); mat.bubble_sorting_column();
        mat.print();
    }
}
