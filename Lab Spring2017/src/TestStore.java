/*
 * Lab 16 test class
 */
public class TestStore {
	public static void main(String[] args){
		WebStore webStore = new WebStore("Web Store.inc", "12-34 web street", 12345, "Mr.Web", "12-34 internet adress street", "java");
		System.out.println("This is web store.");
		System.out.print(webStore);
		System.out.println();
		System.out.println();
		
		MusicStore musicStore = new MusicStore("Music Store.inc", "12-34 music street", 123456, "Mrs.music", 100);
		System.out.println("This is music store.");
		System.out.print(musicStore);
		System.out.println();
		System.out.println();
		
		BikeAndSkateboardStore bikeAndSkateboardStore = new BikeAndSkateboardStore("Bike and Skateboard Store.inc", "12-34 bike street skateboard ave.", 1234567, "Ms.bike", 500, true);
		System.out.println("This is bike and skateboard store.");
		System.out.print(bikeAndSkateboardStore);
	}
}