import java.util.ArrayList;

/**
 * Created by aurni on 5/29/2017.
 */
public class MiddleTile extends Tile {

    public MiddleTile(int position, String board) {
        super(position, board);
    }

    public ArrayList<Integer> getBorders() {
        if(position == 5) {
            borders.add(0);
            borders.add(1);
            borders.add(2);
            borders.add(4);
            borders.add(6);
            borders.add(8);
            borders.add(9);
            borders.add(10);
            return borders;
        }
        if(position == 6) {
            borders.add(1);
            borders.add(2);
            borders.add(3);
            borders.add(5);
            borders.add(7);
            borders.add(9);
            borders.add(10);
            borders.add(11);
            return borders;
        }
        if(position == 9) {
            borders.add(4);
            borders.add(5);
            borders.add(6);
            borders.add(8);
            borders.add(10);
            borders.add(12);
            borders.add(13);
            borders.add(14);
            return borders;
        }
        if(position == 10) {
            borders.add(5);
            borders.add(6);
            borders.add(7);
            borders.add(9);
            borders.add(11);
            borders.add(13);
            borders.add(14);
            borders.add(15);
            return borders;
        }
        return null;
    }
}
