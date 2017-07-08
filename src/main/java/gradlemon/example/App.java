package gradlemon.example;

public class App {

	public static void main(String[] args) {
		new App(args);
	}

	public App(String[] args) {
		System.out.println("Up and running");
		while (true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("Got interrupted in my sleep. Something isn't right. Quitting.");
				return;
			}
			System.out.println("Still running");
		}
	}

}
