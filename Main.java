import java.util.ArrayList;
import java.util.Scanner;
public class Main {
private static InventarioLuchadores luchadores = new InventarioLuchadores();
private static InventarioObjeto objetos= new InventarioObjeto();
private static ArrayList<ObjetoEquipable> cantObjetos= new ArrayList<ObjetoEquipable>();
private static Scanner sca = new Scanner(System.in);
private static ArrayList<Luchador> cantLuchadores= new ArrayList<Luchador>();
private static ArrayList<ObjetoEquipable> objetoequip= new ArrayList<ObjetoEquipable>();
private static Luchador luchador= new Luchador();
public static void main(String[] args) {
	int opcion;
	System.out.println("Bienvenido a Dragones y Calabozos");
	do {
		System.out.println("");
		System.out.println( "opcion 1: menu guerrero");
		System.out.println("opcion 2: Batalla");
		System.out.println("opcion 0: Salir");
		System.out.println("");
		System.out.println("");
    opcion= sca.nextInt();
    if(opcion==1) {
     menuGuerrero();
    }else if(opcion==2) {
     menuBatalla();
    }
	}while(opcion !=0);
}
public static void menuGuerrero() {
	int opcion;
	do {
	System.out.println("");
	System.out.println("");
	System.out.println( "opcion 1: Agregar luchador");
	System.out.println("opcion 2: Mostrar cantidad Luchadores");
	System.out.println("opcion 3: Eliminar luchador");
	System.out.println("opcion 4: Filtrar luchador");
	System.out.println("opcion 5: Mostrar luchadores");
	System.out.println("opcion 6: Mostrar Objetos");
	System.out.println("opcion 7: Agregar Objetos");
	System.out.println("opcion 8: equipar objeto");
	System.out.println("opcion 9: Quitar objetos");
	System.out.println("opcion 10: filtrar objetos");
	System.out.println("opcion 11: mostrar objeto equipado en alguien");
	System.out.println("opcion 0: Salir");
	System.out.println("");
	System.out.println("");
	opcion=sca.nextInt();
	if (opcion==1) {
		luchadores.agregarLuchadores(cantLuchadores);
	}else if(opcion==2) {
		luchadores.mostrarCantidad(cantLuchadores);
	}else if(opcion==3) {
		luchadores.eliminarLuchador(cantLuchadores);
	}else if(opcion==4) {
		luchadores.filtrarLuchadores(cantLuchadores);
	}else if(opcion==5) {
		luchadores.mostrarLuchadores(cantLuchadores);
	}else if(opcion==6) {
		objetos.mostrarObjetos(cantObjetos);
	}else if(opcion==7) {
		objetos.agregarObjeto(cantObjetos);
	}else if(opcion==8) {
		
	}else if(opcion==9) {
		objetos.quitarObjeto(cantObjetos);
	}else if (opcion ==10) {
		objetos.filtrarObjeto(cantObjetos);
	}else if(opcion==11){
	  
	}
	}while(opcion !=0);
}
public static void menuBatalla() {
	
}
}
