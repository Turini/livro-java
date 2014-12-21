package threads;

public class TestandoThread {

	public static void main (String... args) {

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Rodando em paralelo!");
			}
		}).start();
		System.out.println("Terminei de rodar o main");
	}
}