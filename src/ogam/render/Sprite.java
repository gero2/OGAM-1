package ogam.render;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Polygon;

public class Sprite {
	Polygon sprite = new Polygon();
	
	public Sprite(float width, float height) {
		sprite.addPoint(0, 0);
		sprite.addPoint(width - 1, 0);
		sprite.addPoint(width - 1, height - 1);
		sprite.addPoint(0, height - 1);
		sprite.setClosed(true);
	}
	
	public void draw(Graphics g, float x, float y) {
		sprite.setX(x);
		sprite.setY(y);
		g.draw(sprite);
	}
}
