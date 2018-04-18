
import java.util.Random;

public class Monstruo {
private int hp;
private int atk;
private int def;
private int spd;
private String faccion;

public int getHp() {
	return hp;
}
public void setHp(int hp) {
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
	this.hp=valorHp();
	this.atk=valorAtk();
	this.def=valorDef();
	this.spd=valorSpd();
	this.faccion=faccion();
}
private static int valorAtk() {
	int valor;
	valor=(1000+(int)(Math.random()*500+1));
	return valor;
}
private static int valorDef() {
	int valor;
	valor=(5+(int)(Math.random()*20+1));
	return valor;
}
private static int valorHp() {
	int valor;
	valor=(3500+(int)(Math.random()*500+1));
	return valor;
}
private static int valorSpd() {
	int valor;
	valor=(10+(int)(Math.random()*90+1));
	return valor;
}
private void crearObjetoDropeable() {
	ObjetoEquipable objeto= new ObjetoEquipable();
	objeto.mostrar();
}
private static String faccion() {
	Random rnd=new Random();
	String faccion;
	String[] elementos= {"Fuego","Agua","Planta"};
	faccion= elementos[rnd.nextInt(elementos.length)];
	return faccion;
}
}

