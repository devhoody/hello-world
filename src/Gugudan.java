import java.util.Scanner;

public class Gugudan {

public static void main(String[] args) {
		System.out.println("원하는 구구단?");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] splitValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitValue[0]);
		int second = Integer.parseInt(splitValue[1]);
		
		int[] result1 = new int[first];
		int[] result2 = new int[second];
		
		for (int j=2; j<=result1.length; j++) {
			for(int i=1; i<=result2.length; i++) {
				System.out.println(j * i);
		}
	}
}
}