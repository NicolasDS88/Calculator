import java.util.Scanner;

public class calcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a, b, res;
		char ch;
		Scanner scan = new Scanner(System.in);

		do {
			mensajePricipal();
			ch = scan.next().charAt(0);
			switch (ch) {
			case '1':
				mensajeNumero();
				a = escanear(scan);
				mensajeNumero();
				b = escanear(scan);
				// res = suma(a, b);
				// mensajeNumero(res);
				mensajeNumero(suma(a, b));
				break;
			case '2':
				mensajeNumero();
				a = scan.nextFloat();
				b = scan.nextFloat();
				res = a - b;
				mensajeNumero(res);
				break;
			case '3':
				mensajeNumero();
				a = scan.nextFloat();
				b = scan.nextFloat();
				res = a * b;
				mensajeNumero(res);
				break;
			case '4':
				mensajeNumero();
				a = scan.nextFloat();
				b = scan.nextFloat();
				res = a / b;
				mensajeNumero(res);
				break;
			case '5':
				System.exit(0);
				break;
			default:
				System.out.print("Error!!!");
			}
		} while (ch != '5');

	}

	public static void mensajePricipal() {
		System.out.println("(1) Suma\n");
		System.out.println("(2) Resta\n");
		System.out.println("(3) Multiplicacion\n");
		System.out.println("(4) Division\n");
		System.out.println("(5) Exit\n\n");
		System.out.println("Seleccione una opcion : ");
	}

	public static void mensajeNumero() {
		System.out.println("Ingrese numero : ");
	}

	public static void mensajeNumero(float res) {
		System.out.print("Resultado = " + res);
	}

	public static float escanear(Scanner scan) {
		float num = scan.nextFloat();
		return num;
	}

	public static float suma(float a, float b) {
		float num = a + b;
		return num;
	}

}
