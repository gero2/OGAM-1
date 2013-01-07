package ogam.render;

public class SpriteAnimator {
	private float width;
	private float height;
	
	public SpriteAnimator(float width, float height) {
		this.width = width;
		this.height = height;
	}
	
	public void loadAnimation(String key, String someAnimationType) {
		
	}
	
	public void update(float deltaTime) {
		
	}
	
	public Sprite getFrame() {
		// TODO: avoid reconstructing frames, store all frames inside the animator
		// Reuse animations as necessary
		return new Sprite(this.width, this.height);
	}
}