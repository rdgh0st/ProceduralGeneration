import java.util.Scanner;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many zones you want on the Y axis: ");
		int height = scan.nextInt();
		System.out.println("Enter how many zones you want on the X axis: ");
		int width = scan.nextInt();
		
		try {
			AppGameContainer gameObj;
			gameObj = new AppGameContainer(new GameScreen("FirstGame", height, width));
			gameObj.setDisplayMode(1280, 800, false);
			gameObj.setTargetFrameRate(120);
			gameObj.setShowFPS(false);
			gameObj.start();
		}  catch (SlickException e) {
			System.out.println(e.getMessage());
		}
	}

}
