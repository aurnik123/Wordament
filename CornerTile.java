import java.util.ArrayList;

/**
 * Created by aurni on 5/29/2017.
 */
public class CornerTile extends Tile {

    public CornerTile(int position, String board) {
        super(position, board);
    }

    public ArrayList<Integer> getBorders() {
        if(position == 0) {
            borders.add(1);
            borders.add(4);
            borders.add(5);
            return borders;
        }
        if(position == 3) {
            borders.add(2);
            borders.add(6);
            borders.add(7);
            return borders;
        }
        if(position == 12) {
            borders.add(8);
            borders.add(9);
            borders.add(13);
            return borders;
        }
        if(position == 15) {
            borders.add(10);
            borders.add(11);
            borders.add(14);
            return borders;
        }
        return null;
    }
}
