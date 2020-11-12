import java.awt.*;

public class Player extends GraphicsObject {

    boolean movesLeft;
    boolean movesRight;
    int width;
    int height;
    Color color;

    public Player(double x, double y, int width, int height, Color color) {
        super(x,y);
        this.movesLeft = false;
        this.movesRight = false;
        this.width = width;
        this.height = height;
        this.color = color;
    }


    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillRect((int)x, (int)y, this.width, this.height);
    }
}
