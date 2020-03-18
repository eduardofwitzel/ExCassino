package corona;

public class Main {

	public static void main(String[] args) {
		
		for (int id = 0; id<10;id++) {
			Thread ob = new Cassino(id);
			ob.start();
			
			
		}

	}

}
