import java.util.Random;
public class ObjetoEquipable {
private String atributo;
private int mejoraTotal;
private int rangoEstrellas;
private int rango;
private String tipo;
private String[]tipos= {"espada","escudo","armadura","botas"};

public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
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
public String getAtributo() {
	return atributo;
}
public void setAtributo(String atributo) {
	this.atributo = atributo;
}
public int getRangoEstrellas() {
	return rangoEstrellas;
}
public void setRangoEstrellas(int rangoEstrellas) {
	this.rangoEstrellas = rangoEstrellas;
}
public ObjetoEquipable() {
	this.atributo=atributoAleatoria(tipo);
	this.mejoraTotal=mejoraTotal(rangoEstrellas, rango);
	this.rangoEstrellas=rangoEstrellas();
	this.rango=rango();
	this.tipo=tipoAleatorio();
}
private static String atributoAleatoria(String tipo) {
	String atributo="";
    if (tipo=="espada") {
    	atributo="atk";
    }else if(tipo=="armadura") {
    	atributo="hp";
    }else if (tipo=="escudo") {
    	atributo="def";
    }else if(tipo=="botas") {
    	atributo="spd";
    }
    return atributo;
}
private static int rango() {
	int rango;
	rango=(int)(Math.random()*9+1);
	return rango;
}
private static int rangoEstrellas() {
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
private int mejoraTotal(int rangoEstrellas, int rango) {
	int mejoraTotal;
	mejoraTotal= rangoEstrellas*rango;
	return mejoraTotal;
}
private String tipoAleatorio() {
	Random rnd= new Random();
	String tipo=tipos[rnd.nextInt(tipos.length)];
	return tipo;
}

public void mostrar() {
	System.out.println("Atributo= "+ getAtributo());
	System.out.println("Mejora Total= "+getMejoraTotal());
	System.out.println("Rango= "+ getRango());
	System.out.println("Rango de estrellas= "+ getRangoEstrellas());
	System.out.println("Tipo= "+ getTipo());
}
	}

