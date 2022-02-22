import java.util.Random;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class LowDenResidential extends Zone {

	public LowDenResidential() {
		super(Color.lightGray, 10, 10);
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
		 * 0%   -  HighDenResidential 
		 * 20%  -  AverageDenResidential 
		 * 40%  -  LowDenResidential 
		 * 5% -  Commercial 
		 * 0% -  Industrial 
		 * 35%  -  RecreationSpace
		 */
		Random random = new Random();
		int rand = random.nextInt(20);
		if (rand == 0) {
			return zoneMaker.makeZone("Commercial");
		} else if (rand <= 7) {
			return zoneMaker.makeZone("Recreation");
		} else if (rand <= 11) {
			return zoneMaker.makeZone("AverageDenResidential");
		} else {
			return zoneMaker.makeZone("LowDenResidential");
		}
	}

}
