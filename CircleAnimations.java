import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CircleAnimations {
    private ArrayList<Circle> circles; // the circles to animate
    private int size; // canvas width and height (will be square)
    private Random rng; // use to make random numbers

    /** create a drawing pane of a particular size */
    public CircleAnimations(int s) {
        circles = new ArrayList<>();
        size = s;
        rng = new Random();

        // don't mess with this
        StdDraw.setCanvasSize(size, size); // set up drawing canvas
        StdDraw.setXscale(0, size); // <0, 0> is bottom left. <size-1, size-1> is top right
        StdDraw.setYscale(0, size);
    }

    void drawCircles() {
        for (int i = 0; i < circles.size(); i++) {
            circles.get(i).draw();
        }
    }

    void addCircles() {
        Circle c1 = new Circle(15, 15, 10, new Color(255, 34, 10));
        Circle c2 = new Circle(125, 125, 70, new Color(47, 69, 20));
        Circle c3 = new Circle(275, 275, 150, new Color(186, 26, 30));

        circles.add(c1);
        circles.add(c2);
        circles.add(c3);

        drawCircles();
    }

    void addCircles(int number) {
        for (int i = 1; i <= number; i++) {
            Color color = new Color(rng.nextInt(256), rng.nextInt(256), rng.nextInt(256));
            circles.add(new Circle(rng.nextInt(size + 1), rng.nextInt(size + 1), rng.nextInt(size / 4), color));
            drawCircles();
        }

    }

    void noOverlapping(int number) {
        addCircles(1);
        for (int i = 0; i < number; i++) {
            Color color = new Color(rng.nextInt(256), rng.nextInt(256), rng.nextInt(256));
            Circle circle = new Circle(rng.nextInt(size + 1), rng.nextInt(size + 1), rng.nextInt(size / 4), color);
            if (checkOverlap(circle)) {
                i--;
            } else {
                circles.add(circle);
            }
        }
        drawCircles();
    }

    public boolean checkOverlap(Circle circle) {
        for (int i = 0; i < circles.size(); i++) {
            if (circle.overlaps(circles.get(i))) {
                return true;
            } else {
                continue;
            }
        }
        return false;

    }

    public void movingCircles() {
        addCircles();
        for (int i = 0; i < circles.size(); i++) {
            circles.get(i).setVelocities(rng.nextInt(5) + 1, rng.nextInt(5) + 1);
        }

        while (true) {
            drawCircles();
            for (int i = 0; i < circles.size(); i++) {
                circles.get(i).update();
            }
            StdDraw.show(10);
            StdDraw.clear();


            if (StdDraw.isMousePressed())
                removeCircle();

        }

    }

    public void bounce() {
        for(int i=0;i<circles.size();i++) {
            if(circles.get(i).getY()>size-circles.get(i).getRadius() ||  circles.get(i).getY()<circles.get(i).getRadius())
                circles.get(i).setDy(0-circles.get(i).getDy());
            if(circles.get(i).getX()>size-circles.get(i).getRadius() ||  circles.get(i).getX()<circles.get(i).getRadius())
                circles.get(i).setDx(0-circles.get(i).getDx());
        }
        drawCircles();
    }


    public void removeCircle()
    {
        for(int i = 0; i < circles.size(); i++)
        {
            if(Math.sqrt(Math.pow(circles.get(i).getX() - StdDraw.mouseX(), 2) +Math.pow(circles.get(i).getY() - StdDraw.mouseY(), 2)) < circles.get(i).getRadius())
            {circles.set(i, null);}
        }
        while(circles.contains(null))
        {
            circles.remove(null);
        }
        StdDraw.clear();
        drawCircles();
        return;
    }

}
