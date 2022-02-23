import java.util.Random;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class RecreationSpace extends Zone {

	/**
	 * Calls the constructor of the Zone class using its unique color, as well as width/height
	 */
	public RecreationSpace() {
		super(Color.blue, 10, 10);
	}

	/**
	 * Sets the corresponding color and renders the Zone using the given dimensions and its own width/height
	 */
	@Override
	public void drawSelf(Graphics painter, int currentX, int currentY) {
		painter.setColor(color);
		painter.fillRect(currentX, currentY, width, height);
	}

	/**
	 * Uses random object to create and return a new Zone from the given probabilities
	 */
	@Override
	public Zone GenerateNeighbor() {
		// TODO Auto-generated method stub
		/*
		 * 5%   -  HighDenResidential 
		 * 10%  -  AverageDenResidential 
		 * 25%  -  LowDenResidential 
		 * 15%  -  Commercial 
		 * 0% -  Industrial 
		 * 45%  -  RecreationSpace 
		 */
		Random random = new Random();
		int rand = random.nextInt(20);
		if (rand == 0) {
			return zoneMaker.makeZone("HighDenResidential");
		} else if (rand <= 2) {
			return zoneMaker.makeZone("AverageDenResidential");
		} else if (rand <= 5) {
			return zoneMaker.makeZone("Commercial");
		} else if (rand <= 10) {
			return zoneMaker.makeZone("LowDenResidential");
		} else {
			return zoneMaker.makeZone("Recreation");
		}
	}

}
