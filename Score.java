import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.io.File;
import java.io.IOException;

public class Score extends Rectangle {

	int width;
	int height;
	int player1;
	int player2;
	
	Score(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	private static Font createFont(String file) {
		Font font = null;
		try {
			font = Font.createFont(Font.TRUETYPE_FONT, new File(file)).deriveFont(60f);
		} catch(FontFormatException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return font;
	}
	
	Font font = createFont("bit5x3.ttf");
	
	public void draw(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		g.setColor(Color.white);
		g.setFont(font);
		Stroke dashed = new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0,
										new float[] {10}, 30);
		g2D.setStroke(dashed);
		g2D.drawLine(width / 2, 0, width / 2, height);
		
		g.drawString(String.valueOf(player1), (width / 2) - 80, 70);
		g.drawString(String.valueOf(player2), (width / 2) + 55, 70);

	}
}
