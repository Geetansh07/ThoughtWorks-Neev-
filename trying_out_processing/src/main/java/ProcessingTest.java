import processing.core.PApplet;

public class ProcessingTest extends PApplet{

    int DIAMETER_OF_EllIPSE = 10;
    int WIDTH = 640;
    int HEIGHT = 480;

    int circle_1_speed = 1;
    int circle_2_speed = 2;
    int circle_3_speed = 3;
    int circle_4_speed = 4;

    int circle_1_position = 1;
    int circle_2_position = 2;
    int circle_3_position = 3;
    int circle_4_position = 4;

    public void settings() {
        size(WIDTH, HEIGHT);
    }

    public void draw() {

        making_ellipse(circle_1_speed, circle_1_position);
        circle_1_speed += circle_1_position;
        making_ellipse(circle_2_speed, circle_2_position);
        circle_2_speed += circle_2_position;
        making_ellipse(circle_3_speed, circle_3_position);
        circle_3_speed += circle_3_position;
        making_ellipse(circle_4_speed, circle_4_position);
        circle_4_speed += circle_4_position;

    }

    private void making_ellipse(int circle_speed, int circle_position) {
        ellipse(circle_speed, circle_position*height/5, DIAMETER_OF_EllIPSE, DIAMETER_OF_EllIPSE);
    }

    public static void main(String[] args) {
        PApplet.main("ProcessingTest", args);

    }

}