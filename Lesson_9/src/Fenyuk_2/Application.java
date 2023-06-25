package Fenyuk_2;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws MyException {
		
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int b;

		System.out.println("Введіть перше ціле число:");

		if (scanner.hasNextInt()) {
			a = scanner.nextInt();

			System.out.println("Введіть друге ціле число:");

			if (scanner.hasNextInt()) {
				b = scanner.nextInt();

				Methods calc = new Methods(a, b);

				Methods.viewCalcResult(calc.plus());
				Methods.viewCalcResult(calc.minus());
				Methods.viewCalcResult(calc.multiply());
				Methods.viewCalcResult(calc.devide());
			}

			else
				System.out.println("Помилка! Необхідно було ввести ЦІЛЕ число");
		}

		else
			System.out.println("Помилка! Необхідно було ввести ЦІЛЕ число");

	}

}
