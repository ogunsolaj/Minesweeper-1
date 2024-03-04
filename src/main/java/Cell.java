import java.util.*;

public class Cell {
    public void plantbomb() {
        this.bomb = true;
    }

    public void searchbomb() {
        if (this.bomb == true) {
            System.out.println(1);
        }
    }

    public void checkbomb() {
        if (this.bomb == true) {
            System.out.println("There's a bomb");
            gameover();

        }

    }
    public void gameover() {
        System.out.println("Gameover");
        System.exit(0);
    }


    private int positionx;
    private int positiony;

    private  boolean bomb;
    private boolean vicinitybomb;


    Cell() {
        this.bomb = false;
    }




    Cell(int x, int y) {
        this.positionx = x;
        this.positiony = y;
    }


}

















