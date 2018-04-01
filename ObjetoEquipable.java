import java.util.Random;
public class ObjetoEquipable {
private String caracteristica;
private int mejoraTotal;
private int estrellas;
private int rango;


public int getMejoraTotal() {
	return mejoraTotal;
}
public void setMejoraTotal(int mejoraTotal) {
	this.mejoraTotal = mejoraTotal;
}
public int getRango() {
	return rango;
}
public void setRango(int rango) {
	this.rango = rango;
}
public String getCaracteristica() {
	return caracteristica;
}
public void setCaracteristica(String caracteristica) {
	this.caracteristica = caracteristica;
}
public int getEstrellas() {
	return estrellas;
}
public void setMejora(int estrellas) {
	this.estrellas = estrellas;
}
public ObjetoEquipable() {
	this.caracteristica=caracteristicaAleatoria();
	this.mejoraTotal(estrellas, rango);
	this.estrellas=estrellas();
	this.rango=rango();
}
public static String caracteristicaAleatoria() {
	String[] caracteristica= {"atk","hp","def","spd"};
	Random rnd= new Random();
	String caract;
    caract=caracteristica[rnd.nextInt(caracteristica.length)];
    return caract;
}
public static int rango() {
	int rango;
	rango=(int)(Math.random()*9+1);
	return rango;
}
public static int estrellas() {
	int estrellas=0;
	int rangoEstrellas;
	rangoEstrellas=(int)(Math.random()*100+1);
	if(rangoEstrellas<=20) {
		estrellas=1;
	}else if(rangoEstrellas<=40) {
		estrellas=2;
	}else if(rangoEstrellas<=60) {
		estrellas=3;
	}else if(rangoEstrellas<=75) {
		estrellas=4;
	}else if (rangoEstrellas<=85) {
		estrellas=5;
	}else if (rangoEstrellas<=90) {
		estrellas=6;
	}else if(rangoEstrellas<=94) {
	    estrellas=7;
	}else if (rangoEstrellas<=97) {
		estrellas=8;
	}else if (rangoEstrellas<=99) {
		estrellas=9;
	}else if (rangoEstrellas==100) {
		estrellas=10;
	}	
	return estrellas;
	
}
public int mejoraTotal(int estrellas, int rango) {
	int mejoraTotal;
	mejoraTotal= estrellas*rango;
	return mejoraTotal;
}
	}

