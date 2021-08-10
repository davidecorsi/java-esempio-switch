import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		switch(x) { // il selettore deve essere di tipo short, byte, char, int, String
		case 1:
			System.out.println("uno");
			break; // passa ad eseguire il codice dopo il blocco switch
		case 2:
			System.out.println("due");
			break;
		case 3:
			System.out.println("tre");
			break;
		default:
			System.out.println("nullo");
		}
	}
}
