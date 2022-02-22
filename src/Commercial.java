import java.util.Random;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class Commercial extends Zone {

	public Commercial() {
		super(Color.green, 10, 10);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawSelf(Graphics painter, int currentX, int currentY) {
		painter.setColor(color);
		painter.fillRect(currentX, currentY, width, height);
	}

	@Override
	public Zone GenerateNeighbor() {
		/*
		 * 20%  -  HighDenResidential 
		 * 20%  -  AverageDenResidential 
		 * 5% -  LowDenResidential 
		 * 30%  -  Commercial 
		 * 20%  -  Industrial 
		 * 5% -  RecreationSpace
		 */
		Random random = new Random();
		int rand = random.nextInt(20);
		if (rand == 0) {
			return zoneMaker.makeZone("Recreation");
		} else if (rand == 1) {
			return zoneMaker.makeZone("LowDenResidential");
		} else if (rand <= 5) {
			return zoneMaker.makeZone("Industrial");
		} else if (rand <= 9) {
			return zoneMaker.makeZone("AverageDenResidential");
		} else if (rand <= 13) {
			return zoneMaker.makeZone("HighDenResidential");
		} else {
			return zoneMaker.makeZone("Commercial");
		}
	}

}
