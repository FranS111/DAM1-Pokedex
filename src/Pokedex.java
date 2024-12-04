import java.util.Arrays;
import java.util.Scanner;

public class Pokedex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean on = true;
		boolean go = false;
		int slot_vacio = 0;
		int pos = 0;
		boolean repetido = false, repetido1 = false, repetido2 = false, repetido3 = false, repetido4 = false,
				repetido5 = false;
		String pokemon_input;
		boolean repeat = false;
		String nada = "Null";

		// Creamos array de la Pokedex entera.
		String[] array1;
		// El array es de 151 slots pero puedes cambiarlo a 15 por ejemplo si te es mas
		// comodo para corregir la practica :).
		array1 = new String[15];
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		for (int i = 0; i < array1.length; i++) {
			array1[i] = nada;
		}

		while (on) {
			repeat = false;
			// Print cada vez que se repita el while de todas las opciones para elegir
			System.out.println("Introduzca la opcion que desea ejecutar:");
			System.out.println(
					"<------------------------------------------------------------------------------------------------------------------------------------------ >");
			System.out.println(
					"| 1) | Fill Pokedex            ||···|| 4) | Delete Pokemon             ||···|| 7) | Show All Pokemon        ||···|| 10)| Hack Pokedex       |");
			System.out.println(
					"| 2) | Add Pokemon             ||···|| 5) | Delete Pokemon at position ||···|| 8) | Get Pokemon at position ||···|| 11)| Erase Pokedex info |");
			System.out.println(
					"| 3) | Add Pokemon at position ||···|| 6) | Find Pokemon               ||···|| 9) | Count Pokemon           ||···|| 12)| Exit               |");
			System.out.println(
					"<------------------------------------------------------------------------------------------------------------------------------------------ >");
			System.out.println("Opcion:");
			int opcion = sc.nextInt();

			// Este sera el switch principal donde pongamos todos los cases, es decir, cada
			// opcion a elegir de las de arriba
			switch (opcion) {
			case 1:
				System.out.println("1) Fill Pokedex");
				System.out.println("-   -   -   -   -   -   -   -   -   -");
				// Comprobamos que los 5 slots uno al lado del otro del array estan vacios para
				// tener espacio para los 5 pokemon.
				// Comprobamos que no este repetido
				for (int i = 0; i < array1.length; i++) {
					if (array1[i] == nada && array1[i + 1] == nada && array1[i + 2] == nada && array1[i + 3] == nada
							&& array1[i + 4] == nada) {
						slot_vacio = i;
						i = 151;
					}
				}
				// Creamos un for para poder ver si cada introduccido no esta repetido en cada
				// Pokemon introducido
				for (int i = 0; i < array1.length; i++) {
					if (array1[i] == "Oshawott") {
						repetido = true;
					}
				}
				for (int i = 0; i < array1.length; i++) {
					if (array1[i] == "Snivy") {
						repetido2 = true;
					}
				}
				for (int i = 0; i < array1.length; i++) {
					if (array1[i] == "Tepig") {
						repetido3 = true;
					}
				}
				for (int i = 0; i < array1.length; i++) {
					if (array1[i] == "Ampharos") {
						repetido4 = true;
					}
				}
				for (int i = 0; i < array1.length; i++) {
					if (array1[i] == "Sylveon") {
						repetido5 = true;
					}
				}

				// Si no esta repetido se introducira la opcion correctamente con estos if
				if (repetido == false) {
					array1[slot_vacio] = "Oshawott";
				}
				if (repetido2 == false) {
					array1[slot_vacio + 1] = "Snivy";
				}
				if (repetido3 == false) {
					array1[slot_vacio + 2] = "Tepig";
				}
				if (repetido4 == false) {
					array1[slot_vacio + 3] = "Ampharos";
				}
				if (repetido5 == false) {
					array1[slot_vacio + 4] = "Sylveon";
				}
				break;
//2
			case 2:
				// Comprobamos el slot disponible recorriendo la array hasta que encuentre un
				// Null
				for (int i = 0; i < array1.length; i++) {
					if (array1[i] == nada) {
						slot_vacio = i;
						i = 151;
					}
				}
				System.out.println("2) Add Pokemon");
				System.out.println("-   -   -   -   -   -   -   -   -   -");
				System.out.println("Introduzca el nombre del pokemon a introducir: ");
				String pokemon_intro = sc.next();

				// Comprobamos que el imput no este repetido
				for (int i = 0; i < array1.length; i++) {
					if (array1[i].equals(pokemon_intro)) {
						repeat = true;
					}
				}
				// Introduccion del pokemon a la pokedex si no esta repetido
				if (repeat == false) {
					array1[slot_vacio] = pokemon_intro;
					System.out.println("Pokemon registrado correctamente!");
					System.out.println("- - - - - - - - - - - - - - - - - - - -");

				} else {
					// Al estar repetido, avisamos al usuario
					System.out.println("Este Pokemon ya ha sido registrado anteriormente.");
					System.out.println("- - - - - - - - - - - - - - - - - - - -");
				}

				break;

			case 3:
				System.out.println("3) Add Pokemon at position");
				System.out.println("-   -   -   -   -   -   -   -   -   -");
				boolean continuar = false;
				// Bucle hasta que no se de un imput correcto de posicion
				while (continuar == false) {
					System.out.println("Introduzca una posicion:");
					int position = sc.nextInt();
					pos = position;

					if (array1[position].equals(nada)) {
						continuar = true;
					} else {
						System.out.println("Posicion ya usada, introduzca una vacia.");
						System.out.println("- - - - - - - - - - - - - - - - - - - -");
					}
				}
				// Pedimos imput para el nombre que se quiera introducir
				System.out.println("Introduzca el nombre del pokemon a introducir: ");
				String pokemon_intro2 = sc.next();
				// Comprobacion de que no este repetido
				for (int i = 0; i < array1.length; i++) {
					if (array1[i].equals(pokemon_intro2)) {
						repeat = true;
					}
				}
				// Introduccion del pokemon a la pokedex
				if (repeat == false) {
					array1[pos] = pokemon_intro2;
					System.out.println("Pokemon registrado correctamente!");
					System.out.println("- - - - - - - - - - - - - - - - - - - -");

				} else {
					System.out.println("Este Pokemon ya ha sido registrado anteriormente.");
					System.out.println("- - - - - - - - - - - - - - - - - - - -");
				}
				break;

			case 4:
				System.out.println("4) Delete Pokemon");
				System.out.println("-   -   -   -   -   -   -   -   -   -");
				boolean existe = false;
				System.out.println("Introduzca el nombre del Pokemon que desee eliminar.");
				String pokemon_intro3 = sc.next();
				// Recorrer el array para mirar si el imput se iguala a algun pokemon de la
				// misma. Si es igual se eliminara.
				for (int i = 0; i < array1.length; i++) {
					if (array1[i].equals(pokemon_intro3)) {
						array1[i] = nada;
						existe = true;
						System.out.println("Pokemon eliminado correctamente!");
						System.out.println("- - - - - - - - - - - - - - - - - - - -");
					}
				}
				if (existe == false) {
					System.out.println("No existe ningun pokemon con ese nombre en la pokedex.");
					System.out.println("- - - - - - - - - - - - - - - - - - - -");
				}

				break;

			case 5:
				System.out.println("5) Delete Pokemon at position");
				System.out.println("-   -   -   -   -   -   -   -   -   -");
				boolean existe2 = false;
				System.out.println("Introduzca la posicion del Pokemon que desee eliminar.");
				int position2 = sc.nextInt();
				// Recorrer el array para mirar si el imput se iguala a algun pokemon de la
				// misma. Si es igual se eliminara.
				if (array1[position2] != nada) {
					array1[position2] = nada;
					existe2 = true;
					System.out.println("Pokemon eliminado correctamente!");
					System.out.println("- - - - - - - - - - - - - - - - - - - -");
				}
				if (existe2 == false) {
					System.out.println("No existe ningun pokemon en esta posicion la pokedex.");
					System.out.println("- - - - - - - - - - - - - - - - - - - -");
				}
				break;

			case 6:
				System.out.println("6) Find Pokemon");
				System.out.println("-   -   -   -   -   -   -   -   -   -");
				boolean existe3 = false;
				System.out.println("Introduzca el nombre del pokemon que quiere buscar.");
				String pokemon_intro4 = sc.next();
				// Busca en el array si existe un pokemon igual al imput indicado. Si existe
				// imprimira la posicion y nombre del pokemon.
				for (int i = 0; i < array1.length; i++) {
					if (array1[i].equals(pokemon_intro4)) {
						System.out.println("|" + i + " - " + array1[i]);
						System.out.println("- - - - - - - - - - - - - - - - - - - -");
						existe3 = true;
					} 
				}
				if (existe3 == false) {
					System.out.println("No existe ningun pokemon con ese nombre en la pokedex.");
					System.out.println("- - - - - - - - - - - - - - - - - - - -");

				}
				break;

			case 7:
				System.out.println("7) Show all Pokemon");
				System.out.println("-   -   -   -   -   -   -   -   -   -");
				// Creamos un for que recorra el array y para cada posicion imprima el nombre
				// solo si no es igual a un espacio en blanco.
				boolean existe4 = false;
				for (int i = 0; i < array1.length; i++) {
					if (array1[i] != nada) {
						System.out.println(" - " + array1[i]);
						existe4 = true;
					}
				}
				// Si en el if de arriba existe4 no se ha activado, significa que no existe
				// ningun pokemon que emprimir, entonces notificaremos al usuario.
				if (existe4 == false) {
					System.out.println("No hay ningun pokemon en la pokedex");
				}
				System.out.println("- - - - - - - - - - - - - - - - - - - -");

				break;

			case 8:
				System.out.println("8) Get Pokemon at position");
				System.out.println("-   -   -   -   -   -   -   -   -   -");
				boolean existe5 = false;
				System.out.println("Introduzca la posicion del pokemon que quiere buscar.");
				int position3 = sc.nextInt();
				// Busca en el array si existe un pokemon igual a la posicion indicada, si lo
				// encuentra lo imprimira.
				if (!nada.equals(array1[position3])) {
					System.out.println("|" + position3 + " - " + array1[position3]);
					System.out.println("- - - - - - - - - - - - - - - - - - - -");
					existe5 = true;
				}
				if (existe5 == false) {
					System.out.println("No existe ningun pokemon en esa posicion en la pokedex.");
					System.out.println("- - - - - - - - - - - - - - - - - - - -");

				}
				break;

			case 9:
				System.out.println("9) Count Pokemon");
				System.out.println("-   -   -   -   -   -   -   -   -   -");
				// El for recorrera el array, si la posicion no es igual a Null entonces se
				// añadira +1 a la variable counter, que nos contara cuantos pokemon encuentra.
				int counter = 0;
				for (int i = 0; i < array1.length; i++) {
					if (array1[i] != nada) {
						counter++;
					}
				}
				// Si el counter es como minimo 1, se imprimira el mensaje de cuantos pokemon
				// hay.
				if (counter != 0) {
					System.out.println("El total de pokemon en la pokedex es de: " + counter);
					System.out.println("- - - - - - - - - - - - - - - - - - - -");
				} else {
					System.out.println("No hay ningun pokemon registrado en la pokedex");
					System.out.println("- - - - - - - - - - - - - - - - - - - -");
				}
				break;

			case 10:
				System.out.println("10) Hack Pokedex");
				System.out.println("-   -   -   -   -   -   -   -   -   -");
				System.out.println("Introduzca el metodo a usar para rellenar la pokedex (1 o 2)");
				int eleccion = sc.nextInt();
				// En este caso he preferido hacer elegir al usuario para que se vea que
				// funcionan las dos maneras de rellenar el array. 1 para la "manual" con el for
				// y 2 para la automatica con el .fill.
				if (eleccion == 1) {
					for (int i = 0; i < array1.length; i++) {
						array1[i] = "Ditto";
					}
				}
				if (eleccion == 2) {
					Arrays.fill(array1, "Ditto");
				}
				break;

			case 11:
				System.out.println("11) Erase Pokedex info");
				System.out.println("-   -   -   -   -   -   -   -   -   -");
				// Ya que justo en el anterior case hemos visto el .fill lo usare en este
				// tambien para hacerlo mas sencillo.
				Arrays.fill(array1, nada);
				break;

			case 12:
				System.out.println("12) Exit");
				System.out.println("-   -   -   -   -   -   -   -   -   -");
				// Cambiaremos la variable on a false para que el while se pare de ejecutar.
				on = false;
				System.out.println("- - - Pokedex Apagada - - -");
				break;

			default:
				// Si no se introduce un imput de los mostrados en pantalla se activara el
				// default, con el mensaje de error.
				System.out.println("- - - Opcion incorrecta - - -");
				break;
			}
			// Este for es el print de toda la pokedex cada vez que el while itera.
			// El if es simplemente para colocar en linea todos los pokemon en la consola,
			// proposito meramente estetico.
			for (int i = 0; i < array1.length; i++) {
				if (i < 10) {
					System.out.println("|0" + i + " -> " + array1[i]);
				} else {
					System.out.println("|" + i + " -> " + array1[i]);
				}
			}
			System.out.println("-   -   -   -   -   -   -   -   -   -");
		}
		sc.close();
		sc2.close();
	}

}