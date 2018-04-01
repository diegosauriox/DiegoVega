import java.util.ArrayList;
import java.util.Scanner;
public class inventarioLuchadores {
private ArrayList<luchador_DiegoVega> cantLuchadores= new ArrayList<luchador_DiegoVega>();
private static Scanner sca= new Scanner(System.in);

public static void agregarLuchadores(ArrayList<luchador_DiegoVega>luchadores) {
	if( luchadores.size()<25) {
		luchadores.add(new luchador_DiegoVega());	
	}else {
		System.out.println("Usted no puede crear mas luchadres");
	}
}
public static void MostrarCantidad(ArrayList<luchador_DiegoVega>luchadores)	{	
 System.out.println(luchadores.size());
}
public static void EliminarLuchador(ArrayList<luchador_DiegoVega>luchadores) {
	System.out.println("elija el numero del luchador que desee eliminar");
	int numero= sca.nextInt();
	luchadores.remove(numero-1);
}
   public  void filtrarLuchadores(ArrayList<luchador_DiegoVega>luchadores) {
	 System.out.println("filtrar por rango o por faccion");
	 String filtro= sca.nextLine();
	 if (filtro=="rango") {
			rangoPedido(luchadores);
		 }else if ( filtro=="faccion") {
			faccionPedida(luchadores);
				 }
	             }    
public  void faccionPedida(ArrayList<luchador_DiegoVega>luchadores) {
	System.out.println("elija la faccion que desea filtrar");
	 String faccion= sca.nextLine();
	 for(int i=0; i<luchadores.size();i++) {
		 if(luchadores.get(i).getFaccion()==faccion) {
			 System.out.println(luchadores.get(i));
}
}
}
 public  void rangoPedido(ArrayList<luchador_DiegoVega>luchadores) {
	System.out.println("elija el rango que desea filtrar");
	 int rango= sca.nextInt();
	 for(int i=0; i<luchadores.size();i++) {
		if(luchadores.get(i).getRango()==rango) {
		System.out.println(luchadores.get(i));
	 }
	 }
}
public  void MostrarLuchadores(ArrayList<luchador_DiegoVega>luchadores) {
	for(int i=0; i<luchadores.size();i++) {
		System.out.println(luchadores.get(i).getNombre()+ luchadores.get(i).getFaccion()+luchadores.get(i).getRango());
	}
	System.out.println("Elija el nombre de un luchador");
	String nombre= sca.nextLine();
	for(int i=0; i<luchadores.size();i++) {
		if (luchadores.get(i).getNombre()==nombre) {
			luchadores.get(i).mostrar();
		}
	}
}
}
