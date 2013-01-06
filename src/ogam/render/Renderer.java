package ogam.render;

import java.util.ArrayList;
import java.util.List;

import org.newdawn.slick.Graphics;

public class Renderer {
	private List<Renderable> renderList = new ArrayList<Renderable>();
	
	public void add(Renderable r) {
		renderList.add(r);
	}
	
	public void addAll(List<Renderable> r) {
		renderList.addAll(r);
	}
	
	public void update(Graphics g) {
		for (Renderable r : renderList) {
			draw(r, g);
		}
	}
	
	private void draw(Renderable r, Graphics g) {
		Sprite sprite = r.getSprite();
		sprite.draw(g, r.getX(), r.getY());
	}
}
