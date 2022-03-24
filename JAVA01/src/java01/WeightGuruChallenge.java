package java01;
import java.util.*;

public class WeightGuruChallenge {

	public static void main(String[] args) {
		/*
		 * Create a Java program that tells whether your body to weight ratio is good or
		 * could be better. The java app should take in your weight and height from the
		 * console and calculate your body to weight ratio. You can use this article as
		 * a standardized guide for how to apply the logic.
		 * 
		 */
		double IMC;
		double Weight;
		double Height;

		Scanner SC = new Scanner(System.in);
		System.out.println("introduce your Weight: ");
		Weight = SC.nextDouble();
		System.out.println("introduce your Height: ");
		Height = SC.nextDouble();

		// nutrition formula ...

		// peso / (estatura*estatura)
		IMC = Weight / (Math.pow(Height, 2));

		System.out.println("your IMC is :" + IMC);

		if (IMC < 19) {
			System.out.println("Puede que estés en desnutrición");
		} else if ((IMC >= 19) && (IMC <= 25)) {
			System.out.println("Estás saludable según la relación de tu peso con tu estatura");
		} else if ((IMC > 25) && (IMC <= 30)) {
			System.out.println("Puede que estés en sobrepeso");
		} else if (IMC > 30) {
			System.out.println("Puede que estés en obesidad");
		}

	}

}
