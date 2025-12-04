/**
 * Muestra por pantalla la frase "¡Hola Mundo!"
 *
 * @author Raúl Lumbreras
 */

public class holaMundo{
	public static void main(String[] args){
		String naranja = "\033[33m";
		String azul = "\033[34m";
		System.out.print(naranja + "¡Hola Mundo!\n");
		System.out.print(azul + "Aquí estamos haciendo pruebas con Git.");
	}
}
