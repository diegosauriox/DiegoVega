import java.util.ArrayList;

public class Batalla {
	private InventarioLuchadores inventarioL= new InventarioLuchadores();
private Luchador luchador= new Luchador();
private ArrayList<Luchador> cantLuchadores= new ArrayList<Luchador>();
private ArrayList<Luchador> luchadoresBatalla= new ArrayList<Luchador>();
private Monstruo monstruo= new Monstruo();
private Dados dados= new Dados();
private static Luchador uno= new Luchador();


public void pelear(ArrayList<Luchador> luchadoresBatalla) {

}


private void crearlista(ArrayList<Luchador> cantLuchadores,ArrayList<Luchador> luchadoresBatalla) {
	if(cantLuchadores.size()==0) {
	  cantLuchadores.add(uno);
	}
	for(int i=0; i<cantLuchadores.size();i++) {
		luchadoresBatalla.add(cantLuchadores.get(i));
	}
	inventarioL.mostrarLuchadores(luchadoresBatalla);
}
private void compararVelocidad(ArrayList<Luchador> luchadoresBatalla) {

	
}

private int dañoLuchador(ArrayList<Luchador> luchadoresBatalla) {
  int daño=luchadoresBatalla.get(0).getAtk()- monstruo.getDef();
  if(daño<0) {
	  daño=0;
  }
  return daño;
}
private int dañoMonstruo(ArrayList<Luchador> luchadoresBatalla) {
  int daño = monstruo.getAtk()-luchadoresBatalla.get(0).getDef();
  if(daño<0) {
	  daño=0;
  }
  return daño;
}
public void dañoFaccion(ArrayList<Luchador> luchadoresBatalla) {
	
}
}
