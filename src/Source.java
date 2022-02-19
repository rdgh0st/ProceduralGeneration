import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			AppGameContainer gameObj;
			gameObj = new AppGameContainer(new GameScreen("FirstGame"));
			gameObj.setDisplayMode(640, 480, false);
			gameObj.setTargetFrameRate(120);
			gameObj.start();
		}  catch (SlickException e) {
			System.out.println(e.getMessage());
		}
	}

}
