import java.util.Random;

public class ZoneGenerator {

	public ZoneGenerator() {
		
	}
	
	/**
	 * Picks a random zone from all possible options
	 * @return a Random Zone
	 */
	public Zone makeRandomZone() {
		Zone zone = null;
		
		Random random = new Random();
		int rand = random.nextInt(6);
		
		switch (rand) {
		case 0:
			zone = new HighDenResidential();
			break;
		case 1:
			zone = new AverageDenResidential();
			break;
		case 2:
			zone = new LowDenResidential();
			break;
		case 3:
			zone = new Commercial();
			break;
		case 4:
			zone = new Industrial();
			break;
		case 5:
			zone = new RecreationSpace();
			break;
		}
		
		return zone;
	}
	
	/**
	 * Makes a new zone object using the specified input
	 * @param type - String value indicating what kind of Zone should be made
	 * @return a new Zone object of the given type
	 */
	public Zone makeZone(String type) {
		Zone zone = null;
		
		switch (type) {
		case "HighDenResidential":
			zone = new HighDenResidential();
			break;
		case "AverageDenResidential":
			zone = new AverageDenResidential();
			break;
		case "LowDenResidential":
			zone = new LowDenResidential();
			break;
		case "Commercial":
			zone = new Commercial();
			break;
		case "Industrial":
			zone = new Industrial();
			break;
		case "Recreation":
			zone = new RecreationSpace();
			break;
		}
		
		return zone;
	}

}
