import java.awt.Font;

import ogam.util.SimpleFont;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Main extends BasicGame {
	private static final String TITLE = "PhysiKs";
	
	private SimpleFont font;
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static Mode MODE = Mode.Normal;
	
	public static int testId = 999;
	public static boolean testDebug = true;

	public enum Mode {
		Normal, Frame, Step
	}
	
	public Main(String title) {
		super(title);
	}

	public void init(GameContainer gc) throws SlickException {
		initFont();
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
	}

	public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
		graphics.setAntiAlias(true);
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
