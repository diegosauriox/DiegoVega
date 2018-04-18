
public class Batalla {
private Monstruo mons= new Monstruo();
private Dados dados= new Dados();

public void pelear() {
	int num1=dados.dado8();
	int num2=dados.dado6();
	int valor= num1-num2;
	if(valor>0) {
		
	}else if(valor<0) {
		mons.setAtk(mons.getAtk()*(valor*-1));
	}
}
	
}
