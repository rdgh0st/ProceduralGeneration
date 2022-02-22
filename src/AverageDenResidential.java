import java.util.Random;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class AverageDenResidential extends Zone {

	public AverageDenResidential() {
		super(Color.gray, 10, 10);
	}

	@Override
	public void drawSelf(Graphics painter, int currentX, int currentY) {
		painter.setColor(color);
		painter.fillRect(currentX, currentY, width, height);
	}

	@Override
	public Zone GenerateNeighbor() {
		// TODO Auto-generated method stub
		/*
		 * 20%  -  HighDenResidential 
		 * 30%  -  AverageDenResidential 
		 * 5% -  LowDenResidential 
		 * 20%  -  Commercial 
		 * 5% -  Industrial 
		 * 20%  -  RecreationSpace
		 */
		Random random = new Random();
		int rand = random.nextInt(20);
		if (rand == 0) {
			return zoneMaker.makeZone("Industrial");
		} else if (rand == 1) {
			return zoneMaker.makeZone("LowDenResidential");
		} else if (rand <= 5) {
			return zoneMaker.makeZone("HighDenResidential");
		} else if (rand <= 9) {
			return zoneMaker.makeZone("Recreation");
		} else if (rand <= 13) {
			return zoneMaker.makeZone("Commercial");
		} else {
			return zoneMaker.makeZone("AverageDenResidential");
		}
	}

}
