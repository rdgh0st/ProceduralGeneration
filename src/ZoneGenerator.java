
public class ZoneGenerator {

	public ZoneGenerator() {
		
	}
	
	public Zone makeZone(String type) {
		Zone zone = null;
		
		switch (type) {
		case "HighDenResidential":
			zone = new HighDenResidential();
		}
		
		return zone;
	}

}
