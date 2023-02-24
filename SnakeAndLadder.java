package SnakeAndLadder;

public class SnakeAndLadder {
    static final int PLAYER_POSITION = 0;
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;
    static int position = 0;

    public static void main(String[] args) {

        while (position < 100) {
            int dice = (int) (Math.random() * 10) % 6 + 1;
            int option = (int) (Math.random() * 10) % 3;

            if (option == LADDER) {
                System.out.println("ladder");
                position += dice;

            } else if (option == SNAKE) {
                System.out.println("snake");
                position -= dice;


            } else if (option == NO_PLAY) {
                System.out.println("N0 play");
                position = position;
            }
            if (position < PLAYER_POSITION) {
                position = 0;
            }
            if (position > 100) {
                position -= dice;
            }

            System.out.println("position: " + position);
        }
    }
}
