import java.util.Random;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.Color;

public class GameScreen extends BasicGame {

	private Vector2f position;
	private Vector2f dimensions;
	private Zone[][] zones;
	
	public GameScreen(String title, int height, int width) {
		super(title);
		this.position = new Vector2f();
		this.dimensions = new Vector2f();
		zones = new Zone[height][width];
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer container, Graphics painter) throws SlickException {
		// TODO Auto-generated method stub
		for (int i = 0; i < zones.length; i++) {
			for (int j = 0; j < zones[i].length; j++) {
				zones[i][j].drawSelf(painter, 15 * j, 15 * i);
			}
		}
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		// TODO Auto-generated method stub
		this.position.set(10, 10);
		this.dimensions.set(10, 10);
		zones[0][0] = new Commercial();
		Zone newZone1 = null;
		Zone newZone2 = null;
		Random random = new Random();
		for (int i = 0; i < zones.length; i++) {
			for (int j = 0; j < zones[i].length; j++) {
				if (j != zones[i].length - 1) {
					newZone1 = zones[i][j].GenerateNeighbor();
					if (i != 0) {
						newZone2 = zones[i - 1][j].GenerateNeighbor();
						if (random.nextInt(2) == 0) {
							zones[i][j + 1] = newZone1;
						} else {
							zones[i][j + 1] = newZone2;
						}
					} else {
						zones[i][j + 1] = newZone1;
					}
				}
			}
			if (i != zones.length - 1) {
				zones[i + 1][0] = zones[i][0].GenerateNeighbor();
			}
		}
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}

}
