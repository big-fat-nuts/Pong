import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Ball extends Rectangle {

	static final int BALL_DIAMETER = 8;
	static final int INITIAL_SPEED = 3;
	Random random;
	int xDirection;
	int yDirection;
	int xVelocity;
	int yVelocity;
	
	Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		random = new Random();
		xDirection = random.nextInt(2);
		if (xDirection == 0) xDirection--;
		this.xVelocity = xDirection * INITIAL_SPEED;
		yDirection = random.nextInt(2);
		if (yDirection == 0) yDirection--;
		this.yVelocity = yDirection * INITIAL_SPEED;
	}
	public void move() {
		x += xVelocity;
		y += yVelocity;
	}
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, width, height);
	}
	
}
