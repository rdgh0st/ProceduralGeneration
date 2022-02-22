
public class ZoneGenerator {

	public ZoneGenerator() {
		
	}
	
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
