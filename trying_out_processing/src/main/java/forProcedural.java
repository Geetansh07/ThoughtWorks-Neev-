import processing.core.PApplet;

public class forProcedural extends PApplet
{

    int WIDTH = 640;
    int HEIGHT = 480;
    int DIAMETER = 10;

    int x = 0;

    public void settings()
    {
        size(WIDTH, HEIGHT);
    }

    public void draw()
    {

        ellipse(x, HEIGHT / 5 , DIAMETER, DIAMETER);

        ellipse(x * 2, HEIGHT * 2 / 5 , DIAMETER, DIAMETER);

        ellipse(x * 3, HEIGHT * 3/ 5 , DIAMETER, DIAMETER);

        ellipse(x * 4, HEIGHT * 4/ 5 , DIAMETER, DIAMETER);

        x++;

    }

    public static void main(String[] args)
    {
        PApplet.main("forProcedural", args);

    }
}
