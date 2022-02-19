import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.Color;

public class GameScreen extends BasicGame {

	private Vector2f position;
	private Vector2f dimensions;
	private Color color;
	
	public GameScreen(String title) {
		super(title);
		this.position = new Vector2f();
		this.dimensions = new Vector2f();
		this.color = Color.cyan;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer container, Graphics painter) throws SlickException {
		// TODO Auto-generated method stub
		painter.setColor(this.color);
		painter.fillRect(this.position.getX(), this.position.getY(), this.dimensions.getX(), this.dimensions.getY());
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		// TODO Auto-generated method stub
		this.position.set(10, 10);
		this.dimensions.set(100, 100);
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub

	}

}
