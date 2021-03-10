import java.util.ArrayList;

/**
 * Created by aurni on 5/29/2017.
 */
public class EdgeTile extends Tile {

    public EdgeTile(int position, String board) {
        super(position, board);
    }

    public ArrayList<Integer> getBorders() {
        if(position == 1) {
            borders.add(0);
            borders.add(2);
            borders.add(4);
            borders.add(5);
            borders.add(6);
            return borders;
        }
        if(position == 2) {
            borders.add(1);
            borders.add(3);
            borders.add(5);
            borders.add(6);
            borders.add(7);
            return borders;
        }
        if(position == 4) {
            borders.add(0);
            borders.add(1);
            borders.add(5);
            borders.add(8);
            borders.add(9);
            return borders;
        }
        if(position == 7) {
            borders.add(2);
            borders.add(3);
            borders.add(6);
            borders.add(10);
            borders.add(11);
            return borders;
        }
        if(position == 8) {
            borders.add(4);
            borders.add(5);
            borders.add(9);
            borders.add(12);
            borders.add(13);
            return borders;
        }
        if(position == 11) {
            borders.add(6);
            borders.add(7);
            borders.add(10);
            borders.add(14);
            borders.add(15);
            return borders;
        }
        if(position == 13) {
            borders.add(8);
            borders.add(9);
            borders.add(10);
            borders.add(12);
            borders.add(14);
            return borders;
        }
        if(position == 14) {
            borders.add(9);
            borders.add(10);
            borders.add(11);
            borders.add(13);
            borders.add(15);
            return borders;
        }
        return null;
    }
}
