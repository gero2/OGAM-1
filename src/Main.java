import java.awt.Font;

import ogam.geometry.Vector2D;
import ogam.hero.Block;
import ogam.render.Renderer;
import ogam.util.SimpleFont;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Main extends BasicGame {
	private static final String TITLE = "OGAM1";
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	private SimpleFont font;
	
	Renderer renderer = new Renderer();
	
	Block testBlock = new Block(new Vector2D(400, 300), 50f, 50f);
	
	public Main(String title) {
		super(title);
	}

	public void init(GameContainer gc) throws SlickException {
		initFont();
		
		Block b = new Block(new Vector2D(0, 0), 10, 10);
		
		renderer.add(testBlock);
	}
	
	private void initFont() {
		font = null;
		 try {
			font = new SimpleFont("Courier New", Font.BOLD, 18);
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	public void update(GameContainer gameContainer, int delta) throws SlickException {
		testBlock.update((float)delta / 1000);
	}

	public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
		graphics.setAntiAlias(true);
		renderer.update(graphics);
	}

	public static void main(String[] args) {
		Main game = new Main(Main.TITLE);
	     try {
	          AppGameContainer app = new AppGameContainer(game);
	          app.setDisplayMode(WIDTH, HEIGHT, false);
	          app.setTargetFrameRate(60);
	          app.setShowFPS(true);
	          app.start();
	     } catch (SlickException e) {
	          e.printStackTrace();
	     }
	}
}
