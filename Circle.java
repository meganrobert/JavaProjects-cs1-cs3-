
import java.awt.Color;

public class Circle {

    int x,y;
    int radius;
    Color color;
    int dx;
    int dy;


    public void setVelocities(int dx,int dy) {
        this.dx= dx;
        this.dy=dy;
    }

    public Circle(int xCord, int yCord, int radius, Color color) {
        super();
        this.x = xCord;
        this.y = yCord;
        this.radius = radius;
        this.color = color;

    }

    public Circle(int xCord, int yCord, int radius, Color color,int dx, int dy) {
        super();
        this.x = xCord;
        this.y = yCord;
        this.radius = radius;
        this.color = color;
        this.dx= dx;
        this.dy=dy;

    }

    void draw() {
        
        StdDraw.setPenColor(color);
        StdDraw.filledCircle(x, y, radius);
    }

    boolean overlaps(Circle other) {
        return (Math.sqrt((other.y - y) * (other.y - y) + (other.x - x) * (other.x - x)))<(other.radius + radius) ;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public Color getColor() {
        return color;
    }

    public void update()
    {
        x+=dx;
        y+=dy;
        bounce();
    }

    void bounce()
    {
        StdDraw.setCanvasSize(600, 600);
        x+= dx;
        y+= dy;
        if( y <= 0)
        {
            dy = -dy;
        }
        if(y >= 600)
        {
            dy = -dy;
        }
        if(x <= 0)
        {
            dx = -dx;
        }
        if(x >= 600)
        {
            dx = -dx;
        }

    }

    public static void main(String[] args) { 
        
        StdDraw.setCanvasSize(600, 600);
        new Circle(0, 0, 1, new Color(255,
                0, 0)).draw();

    }


}


