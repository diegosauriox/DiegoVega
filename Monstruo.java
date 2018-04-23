import java.util.Random;
import java.util.ArrayList;

public class Monstruo {
	private ArrayList<ObjetoEquipable> listaObjetosDropeables = new ArrayList<ObjetoEquipable>();
	private float hp;
	private int atk;
	private int def;
	private int spd;
	private String faccion;

	public float getHp() {
		return hp;
	}

	public void setHp(float hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public String getFaccion() {
		return faccion;
	}

	public void setFaccion(String faccion) {
		this.faccion = faccion;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getSpd() {
		return spd;
	}

	public void setSpd(int spd) {
		this.spd = spd;
	}

	public Monstruo() {
		this.hp = valorHp();
		this.atk = valorAtk();
		this.def = valorDef();
		this.spd = valorSpd();
		this.faccion = faccion();
		crearObjetoDropeable();
	}

	private static int valorAtk() {
		int valor;
		valor = (1000 + (int) (Math.random() * 500 + 1));
		return valor;
	}

	private static int valorDef() {
		int valor;
		valor = (5 + (int) (Math.random() * 20 + 1));
		return valor;
	}

	private static int valorHp() {
		int valor;
		valor = (3500 + (int) (Math.random() * 500 + 1));
		return valor;
	}

	private static int valorSpd() {
		int valor;
		valor = (10 + (int) (Math.random() * 90 + 1));
		return valor;
	}

	private void crearObjetoDropeable() {
		ObjetoEquipable objeto1 = new ObjetoEquipable(1);
		ObjetoEquipable objeto2 = new ObjetoEquipable(3);
		ObjetoEquipable objeto3 = new ObjetoEquipable(5);
		this.listaObjetosDropeables.add(objeto1);
		this.listaObjetosDropeables.add(objeto2);
		this.listaObjetosDropeables.add(objeto3);
	}

	public void dropear(ArrayList<ObjetoEquipable> drop) {
		int porcentaje = (int) (Math.random() * 10 + 1);
		if (porcentaje <= 6) {
			drop.get(0).mostrar();
		} else if (porcentaje <= 9) {
			drop.get(1).mostrar();
		} else if (porcentaje == 10) {
			drop.get(2).mostrar();
		}
	}

	private static String faccion() {
		Random rnd = new Random();
		String faccion;
		String[] elementos = { "Fuego", "Agua", "Planta" };
		faccion = elementos[rnd.nextInt(elementos.length)];
		return faccion;
	}

	public ArrayList<ObjetoEquipable> getListaObjetosDropeables() {
		return listaObjetosDropeables;
	}

	public void setListaObjetosDropeables(
			ArrayList<ObjetoEquipable> listaObjetosDropeables) {
		this.listaObjetosDropeables = listaObjetosDropeables;
	}
	
	@Override
	public String toString(){
		return "HP/ATK/DEF/SPD/FACCION - " + this.getHp()+"/"+this.getAtk()+"/"+ this.getDef()+"/"+ this.getSpd()+"/"+ this.getFaccion();
	}
	
}
