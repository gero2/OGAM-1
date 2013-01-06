package ogam.heroes;

import ogam.geometry.Vector2D;
import ogam.heroes.renderdata.BlockRenderData;
import ogam.renderer.Sprite;
import ogam.renderer.Renderable;

public class Block implements Renderable {
	private Vector2D position;
	private Vector2D velocity;
	
	private float width;
	private float height;
	
	private Sprite sprite;
	private static float jumpStrength = 100f; 

	public Block(Vector2D position, float width, float height) {
		this.velocity = Vector2D.ZERO;
		this.position = position;
		this.width = width;
		this.height = height;
		
		renderData = new BlockRenderData(this.width, this.height);
	}
	
	public void update(float deltaTime) {
		position = position.add(velocity.mult(deltaTime));
	}	
	
	public Vector2D getPosition() {
		return position;
	}

	public void setPosition(Vector2D position) {
		this.position = position;
	}

	public Vector2D getVelocity() {
		return velocity;
	}

	public void setVelocity(Vector2D velocity) {
		this.velocity = velocity;
	}
	
	public void jump() {
		velocity = velocity.add(Vector2D.UP.mult(jumpStrength));
	}
	
	public void translate(int deltaX, int deltaY) {
		Vector2D delta = new Vector2D(deltaX, deltaY);
		position = position.add(delta);
	}

	@Override
	public Sprite getRenderData() {
		return renderData;
	}

	@Override
	public float getX() {
		return position.getX();
	}

	@Override
	public float getY() {
		return position.getY();
	}
}