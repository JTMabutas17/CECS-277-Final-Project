
public class FactoryAdultBilliardsLounge {
	/**
	 * createRoom function which returns the room as a BaseRoom
	*/
	public BaseRoom createRoom() {
		return new KaraokeLounge();
	}
}
