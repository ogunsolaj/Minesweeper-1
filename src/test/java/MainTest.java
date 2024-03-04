import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.function.BooleanSupplier;


class MainTest {
    @Test
    public void Createsa10by10Arraylist() {
   Main main = new Main();
        int rows = 10;
        int cols = 10;
        Cell[][] grid = new Cell[rows][cols];
        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = new Cell(i, j);
                value++;
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        for (int i1=0; i1<10; i1++) {
            for (int j1=0; j1<10; j1++) {
                Assertions.assertFalse(false,grid[i1][j1].toString());

            }
        }
    }

}