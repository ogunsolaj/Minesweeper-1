import java.util.*;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;



public class Main {

    public static void main(String[] args) {


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
        Cell[][] originalgrid = Arrays.copyOf(grid, grid.length);

        Random randomgen = new Random();
        Set<Cell> selectedItems = new HashSet<>();

        while (selectedItems.size() < 10) {

            int randomRow = randomgen.nextInt(rows);
            int randomCol = randomgen.nextInt(cols);
            Cell selectedItem = grid[randomRow][randomCol];
            selectedItems.add(selectedItem);
        }
        System.out.println("Randomly selected items:");
        for (Cell item : selectedItems) {
        }
        Cell[] selecteditemsarray = selectedItems.toArray(new Cell[selectedItems.size()]);

        for (Cell item : selecteditemsarray) {
            for (int i1 = 0; i1 < rows; i1++) {
                for (int j1 = 0; j1 < cols; j1++) {
                    if (item == grid[i1][j1]) {
                        grid[i1][j1].plantbomb();
                    }
                }

            }
        }

        int rows1 = 10;
        int cols1 = 10;
        String[][] guesses = new String[rows1][cols1];
        for (int i = 0; i<rows1; i++) {
            for (int j=0; j<cols1; j++) {
                System.out.print(guesses[i][j] + " ");
            }
            System.out.println();
        }
        for (Cell[] item : grid) {
            for (int i1 = 0; i1 < rows; i1++) {
                for (int j1 = 0; j1 < cols; j1++) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter your x coordinate ");
                    int xcoord = scanner.nextInt();
                    while (xcoord < 0 || xcoord > 10) {
                        System.out.print("That's not possible, try again ");
                        xcoord = scanner.nextInt();
                    }
                    Scanner scanner1 = new Scanner(System.in);

                    System.out.print("Enter your y coordinate ");

                    int ycoord = scanner1.nextInt();
                    while (ycoord < 0 || ycoord > 10) {
                        System.out.println("That's not possible try again");
                        ycoord = scanner1.nextInt();
                        grid[xcoord][ycoord].checkbomb();


                    }

                    String guess = ("(" + xcoord + "," + ycoord + ")");
                    guesses[xcoord][ycoord] = guess;

                    for (int row = 0; row < guesses.length; row++) {
                        for (int col = 0; col < guesses[row].length; col++) {
                            System.out.print(guesses[row][col]);
                        }
                        System.out.println();
                    }
                    grid[xcoord][ycoord].checkbomb();

                    for (int i2 = xcoord; xcoord - 1 < i2 && i2 < xcoord + 1; i2++) {
                        for (int j2 = ycoord; ycoord - 1 < j2 && j2 < ycoord + 1; j2++) {
                            grid[i2][j2].searchbomb();
                        }

                    }
                }
            }

        }
    }



}







