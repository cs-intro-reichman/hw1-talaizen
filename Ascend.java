// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]); 
		int randomInt1 = (int) (Math.random() * limit);
		int randomInt2 = (int) (Math.random() * limit);
		int randomInt3 = (int) (Math.random() * limit);

		// find min, max and middle values
		int min = Math.min((Math.min(randomInt1, randomInt2)), randomInt3);
		int max = Math.max((Math.max(randomInt1, randomInt2)), randomInt3);
		int middle = (randomInt1 + randomInt2 + randomInt3) - (max + min);

		//prints the generated random numbers then again in ascending order
		System.out.println(randomInt1 + " " + randomInt2 + " " + randomInt3);
		System.out.println(min + " " + middle + " " + max);
	}
}
