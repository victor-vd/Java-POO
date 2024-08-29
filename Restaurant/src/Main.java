import javax.imageio.ImageIO;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Table table1 = new Table(3, 8);

        table1.setBeer(4);

        for (int i = 0; i <= 17; i++) {
            if (i <= 9) {
                System.out.println("/Assets/Tiles/Cliff_Tile/tile00" + i + ".png");
            } else {
                System.out.println("/Assets/Tiles/Cliff_Tile/tile0" + i + ".png");
            }
        }
    }
}