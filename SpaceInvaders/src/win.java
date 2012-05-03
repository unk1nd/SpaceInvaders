

import javax.swing.ImageIcon;


public class win extends Sprite implements Commons{



    private final String player = "won.jpg";
    private int width;

    public win() {

        ImageIcon ii = new ImageIcon(this.getClass().getResource(player));

        width = ii.getImage().getWidth(null); 

        setImage(ii.getImage());
        setX(0);
        setY(0);
    }
}
