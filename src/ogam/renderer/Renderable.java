package ogam.renderer;

/*
 * All objects (such as heroes or scenery) that want to be drawn implement the Renderable interface.
 * The Renderer simply calls the RenderData's draw() method at its current position.
 */

public interface Renderable {
	public RenderData getRenderData();
	public float getX();
	public float getY();
}
