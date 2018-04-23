import java.util.ArrayList;
import java.util.Scanner;

public class InventarioObjeto {
	private static Scanner sca = new Scanner(System.in);

	public static void agregarObjeto(ArrayList<ObjetoEquipable> objetos) {
		objetos.add(new ObjetoEquipable());
	}

	public static void quitarObjeto(ArrayList<ObjetoEquipable> objetos) {
		System.out.println("elija el numero del objeto que quiera eliminar");
		int num = sca.nextInt();
		objetos.remove(num - 1);
	}

	public static void filtrarObjeto(ArrayList<ObjetoEquipable> objetos) {
		System.out.println("por cual rango desea filtrar?");
		int rango = sca.nextInt();
		for (int i = 0; i < objetos.size(); i++) {
			if (objetos.get(i).getRangoEstrellas() == rango) {
				System.out.println(objetos.get(i));
			}
		}
	}

	public static void mostrarObjetos(ArrayList<ObjetoEquipable> objetos) {
		if (objetos.size() == 0) {
			System.out.println(" no posee objetos en el inventario");
		} else {
			for (int i = 0; i < objetos.size(); i++) {
				objetos.get(i).mostrar();
			}
		}
	}
	
	public static void mostrarListaObjetos(ArrayList<ObjetoEquipable> objetos) {
		String datosObjeto = null;
		for (int i = 0; i < objetos.size(); i++) {
			datosObjeto = objetos.get(i).getTipo() + " - " + objetos.get(i).getAtributo() + " - " + objetos.get(i).getMejoraTotal() + " - " 
					+ objetos.get(i).getRango() + " - " + objetos.get(i).getRangoEstrellas();
			System.out.println(i+1 +". " + datosObjeto);
		}
	}
}
