import java.util.ArrayList;

/**
 * Created by aurni on 5/28/2017.
 */
public class Tile {
    public int position;
    public char letter;
    public String board;

    public ArrayList<Integer> borders = new ArrayList<>();

    public Tile(int position, String board) {
        this.position = position;
        this.letter = board.charAt(position);
        this.board = board;
    }
}
