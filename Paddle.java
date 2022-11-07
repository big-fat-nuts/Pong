import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Paddle extends Rectangle {
	
	static final int PADDLE_WIDTH = 8;
	static final int PADDLE_HEIGHT = 42;
	static final int SPEED = 10;
	int yVelocity;
	int id;

	Paddle(int x, int y, int width, int height, int id) {
		super(x, y, width, height);
		this.id = id;
	}
	
	public void move() {
		y += yVelocity;
	}
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, width, height);
	}
	public void keyPressed(KeyEvent e) {
		switch(id) {
		case 1:
			if (e.getKeyCode() == KeyEvent.VK_W) {
				this.yVelocity = -SPEED;
				move();
			}
			if (e.getKeyCode() == KeyEvent.VK_S) {
				this.yVelocity = SPEED;
				move();
			}
			break;
		case 2:
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				this.yVelocity = -SPEED;
				move();
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				this.yVelocity = SPEED;
				move();
			}
			break;
		}	
	}
	public void keyReleased(KeyEvent e) {
		switch(id) {
		case 1:
			if (e.getKeyCode() == KeyEvent.VK_W) {
				this.yVelocity = 0;
				move();
			}
			if (e.getKeyCode() == KeyEvent.VK_S) {
				this.yVelocity = 0;
				move();
			}
			break;
		case 2:
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				this.yVelocity = 0;
				move();
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				this.yVelocity = 0;
				move();
			}
			break;
		}
	}
}
