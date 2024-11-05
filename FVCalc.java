// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double interest = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double futureValue = currentValue * Math.pow((1 + interest / 100), (double) years);
		System.out.println("After " + years + " years, $" + currentValue + " saved at " + interest + "% will yield $" +  (int) futureValue);
	}
}