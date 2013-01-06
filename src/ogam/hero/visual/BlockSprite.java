package ogam.hero.visual;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Polygon;

import ogam.render.Sprite;

public class BlockSprite implements Sprite {
	Polygon sprite = new Polygon();
	
	public BlockSprite(float width, float height) {
		sprite.addPoint(0, 0);
		sprite.addPoint(width - 1, 0);
		sprite.addPoint(width - 1, height - 1);
		sprite.addPoint(0, height - 1);
		sprite.setClosed(true);
	}
	
	@Override
	public void draw(Graphics g, float x, float y) {
		sprite.setX(x);
		sprite.setY(y);
		g.draw(sprite);
	}
}
