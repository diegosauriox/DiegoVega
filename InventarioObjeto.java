<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;
public class InventarioObjeto {
private ArrayList<ObjetoEquipable> cantObjetos= new ArrayList<ObjetoEquipable>();
private static Scanner sca= new Scanner(System.in);

private static void agregarObjeto(ArrayList<ObjetoEquipable>objetos) {
	if (objetos.size()<11) {	
	objetos.add(new ObjetoEquipable());
	}else { 
	System.out.println(" no puede agregar mas objetos");
	}
}

private static void quitarObjeto(ArrayList<ObjetoEquipable>objetos) {
	System.out.println("elija el numero del objeto que quiera eliminar");
	int num= sca.nextInt();
	objetos.remove(num-1);
}
private static void filtrarObjeto(ArrayList<ObjetoEquipable>objetos) {
	System.out.println("por cual rango desea filtrar?");
	int rango= sca.nextInt();
	for(int i=0; i<objetos.size();i++) {
		if(objetos.get(i).getRangoEstrellas() == rango) {
			System.out.println(objetos.get(i));
		}
	}
}
private static void mostrarObjetos(ArrayList<ObjetoEquipable>objetos) {
	for(int i=0;i<objetos.size();i++) {
		objetos.get(i).mostrar();
	}
}

}
=======
import java.util.ArrayList;
import java.util.Scanner;
public class InventarioObjeto {
private ArrayList<ObjetoEquipable> cantObjetos= new ArrayList<ObjetoEquipable>();
private static Scanner sca= new Scanner(System.in);

private static void agregarObjeto(ArrayList<ObjetoEquipable>objetos) {
		objetos.add(new ObjetoEquipable());
	}

private static void quitarObjeto(ArrayList<ObjetoEquipable>objetos) {
	System.out.println("elija el numero del objeto que quiera eliminar");
	int num= sca.nextInt();
	objetos.remove(num-1);
}
private static void filtrarObjeto(ArrayList<ObjetoEquipable>objetos) {
	System.out.println("por cual rango desea filtrar?");
	int rango= sca.nextInt();
	for(int i=0; i<objetos.size();i++) {
		if(objetos.get(i).getRangoEstrellas() == rango) {
			System.out.println(objetos.get(i));
		}
	}
}
private static void mostrarObjetos(ArrayList<ObjetoEquipable>objetos) {
	for(int i=0;i<objetos.size();i++) {
		objetos.get(i).mostrar();
	}
}

}
>>>>>>> ccd9a15c5b5b2acd29792f4f8d35abaccf7e8679
