package SnakeAndLadder;

public class SnakeAndLadder {
    static final int PLAYER_POSITION = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game");
        int dice = (int) (Math.random() * 10) % 6+1;
        System.out.println(dice);

    }
}
