import java.util.ArrayList;
import java.util.Scanner;
public class inventarioLuchadores {
private ArrayList<luchador_DiegoVega> cantLuchadores= new ArrayList<luchador_DiegoVega>();
private static Scanner sca= new Scanner(System.in);

private static void agregarLuchadores(ArrayList<luchador_DiegoVega>luchadores) {
	if( luchadores.size()<26) {
		luchadores.add(new luchador_DiegoVega());	
	}else {
		System.out.println("Usted no puede crear mas luchadres");
	}
}
private static void MostrarCantidad(ArrayList<luchador_DiegoVega>luchadores)	{	
 System.out.println(luchadores.size());
}
private static void EliminarLuchador(ArrayList<luchador_DiegoVega>luchadores) {
	System.out.println("elija el numero del luchador que desee eliminar");
	int numero= sca.nextInt();
	luchadores.remove(numero-1);
}
private  void filtrarLuchadores(ArrayList<luchador_DiegoVega>luchadores) {
	 System.out.println("filtrar por rango o por faccion");
	 String filtro= sca.nextLine();
	 if (filtro=="rango") {
			rangoPedido(luchadores);
		 }else if ( filtro=="faccion") {
			faccionPedida(luchadores);
				 }else {
					 System.out.println("debe elejir entre rango o filtro");
				 }
	             }    
private  void faccionPedida(ArrayList<luchador_DiegoVega>luchadores) {
	System.out.println("elija la faccion que desea filtrar");
	 String faccion= sca.nextLine();
	 for(int i=0; i<luchadores.size();i++) {
		 if(luchadores.get(i).getFaccion()==faccion) {
			 System.out.println(luchadores.get(i));
}
}
}
private  void rangoPedido(ArrayList<luchador_DiegoVega>luchadores) {
	System.out.println("elija el rango que desea filtrar");
	 int rango= sca.nextInt();
	 for(int i=0; i<luchadores.size();i++) {
		if(luchadores.get(i).getRango()==rango) {
		System.out.println(luchadores.get(i));
	 }
	 }
}
private  void MostrarLuchadores(ArrayList<luchador_DiegoVega>luchadores) {
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
