package ogam.renderer;

/*
 * All objects that want to be drawn (such as heroes or scenery) implement the Renderable interface.
 * The Renderer simply calls the Sprite's draw() method.
 */

public interface Renderable {
	public Sprite getSprite();
	public float getX();
	public float getY();
}
