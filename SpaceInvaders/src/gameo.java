

import javax.swing.ImageIcon;


public class gameo extends Sprite implements Commons{



    private final String player = "gameover.png";
    private int width;

    public gameo() {

        ImageIcon ii = new ImageIcon(this.getClass().getResource(player));

        width = ii.getImage().getWidth(null); 

        setImage(ii.getImage());
        setX(0);
        setY(0);
    }
}
