import java.util.Scanner;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Source {

	public static void main(String[] args) {
		// Ask user for the desired dimensions
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many zones you want on the Y axis: ");
		int height = scan.nextInt();
		System.out.println("Enter how many zones you want on the X axis: ");
		int width = scan.nextInt();
		scan.close();
		
		try {
			// initialize new GameScreen, passing the height and width in the constructor
			AppGameContainer gameObj;
			gameObj = new AppGameContainer(new GameScreen("FirstGame", height, width));
			// set up the screen to be the correct dimensions to fit all the zones
			gameObj.setDisplayMode(width * 15, height * 15, false);
			gameObj.setTargetFrameRate(120);
			gameObj.setShowFPS(false);
			gameObj.start();
		}  catch (SlickException e) {
			System.out.println(e.getMessage());
		}
	}

}
