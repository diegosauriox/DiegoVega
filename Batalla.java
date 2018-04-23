import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Batalla {

	public ArrayList<Luchador> pelear(ArrayList<Luchador> cantLuchadores, Monstruo monstruo) {
		System.out.println("***************************** COMIENZA LA PELEA *******************************");
		ArrayList<Luchador> listaLuchadoresPeleando = crearlista(cantLuchadores);

		boolean monstruoAtaco = false;
		float totalHp = 0;
		Dados dados = new Dados();
		int totalDados = dados.getCaras6() - dados.getCaras8();
		System.out.println("El total entre los dados es: " + totalDados);
		
		while (listaLuchadoresPeleando.size() > 0 && monstruo.getHp() > 0) {

			for (int i = 0; i < listaLuchadoresPeleando.size(); i++) {
				if (listaLuchadoresPeleando.get(i).getSpd() > monstruo.getSpd()) {// luchador mas rapido que monstruo
					System.out.println("Es turno del luchador " + listaLuchadoresPeleando.get(i).getNombre() + "(Rango " + listaLuchadoresPeleando.get(i).getRango() +" "+ listaLuchadoresPeleando.get(i).getFaccion() +")");
					System.out.println("El luchador ha hecho un dano de " + danoLuchador(listaLuchadoresPeleando.get(i), monstruo, totalDados));
					totalHp = monstruo.getHp() - danoLuchador(listaLuchadoresPeleando.get(i), monstruo, totalDados);
					monstruo.setHp(totalHp);
					System.out.println("El monstruo ha quedado con " + totalHp + " HP");
					if (monstruo.getHp() <= 0) {
						System.out.println("El monstruo ha muerto");
						break;
					}
					
					if (i+1 == listaLuchadoresPeleando.size()) {
						System.out.println("Es turno del monstruo " + monstruo.toString());
						System.out.println("El monstruo ha hecho un dano de " + danoMonstruo(listaLuchadoresPeleando.get(0), monstruo, totalDados));
						totalHp = listaLuchadoresPeleando.get(0).getHp() - danoMonstruo(listaLuchadoresPeleando.get(0), monstruo, totalDados);
						listaLuchadoresPeleando.get(0).setHp(totalHp);
						System.out.println("El luchador " + listaLuchadoresPeleando.get(0).getNombre() +" ha quedado con " + totalHp + " HP");
						if (listaLuchadoresPeleando.get(0).getHp() <= 0) {
							System.out.println("El luchador " + listaLuchadoresPeleando.get(0).getNombre() + " ha caido en combate");
							listaLuchadoresPeleando.remove(0);
							if (listaLuchadoresPeleando.size() == 0) {
								System.out.println("Los luchadores han perdido el combate");
								break;
							}
						}
					}

				} else {
					if (monstruoAtaco == false) {
						System.out.println("Es turno del monstruo " + monstruo.toString());
						System.out.println("El monstruo ha hecho un dano de " + danoMonstruo(listaLuchadoresPeleando.get(0), monstruo, totalDados));
						totalHp = listaLuchadoresPeleando.get(0).getHp() - danoMonstruo(listaLuchadoresPeleando.get(0), monstruo, totalDados);
						listaLuchadoresPeleando.get(0).setHp(totalHp);
						System.out.println("El luchador " + listaLuchadoresPeleando.get(0).getNombre() +" ha quedado con " + totalHp + " HP");
						
						if (listaLuchadoresPeleando.get(0).getHp() <= 0) {
							System.out.println("El luchador " + listaLuchadoresPeleando.get(0).getNombre() + " ha caido en combate");
							listaLuchadoresPeleando.remove(0);
							if (listaLuchadoresPeleando.size() == 0) {
								System.out.println("Los luchadores han perdido el combate");
								break;
							}
						} else {
							System.out.println("Es turno del luchador " + listaLuchadoresPeleando.get(i).getNombre() + "(Rango " + listaLuchadoresPeleando.get(i).getRango() +" "+ listaLuchadoresPeleando.get(i).getFaccion() +")");
							System.out.println("El luchador ha hecho un dano de " + danoLuchador(listaLuchadoresPeleando.get(i), monstruo, totalDados));
							totalHp = monstruo.getHp() - danoLuchador(listaLuchadoresPeleando.get(i), monstruo, totalDados);
							monstruo.setHp(totalHp);
							System.out.println("El monstruo ha quedado con " + totalHp + " HP");
							monstruoAtaco = true;
							if (monstruo.getHp() <= 0) {
								System.out.println("El monstruo ha muerto");
								break;
							}
						}
					} else {
						System.out.println("Es turno del luchador " + listaLuchadoresPeleando.get(i).getNombre() + "(Rango " + listaLuchadoresPeleando.get(i).getRango() +" "+ listaLuchadoresPeleando.get(i).getFaccion() +")");
						System.out.println("El luchador ha hecho un dano de " + danoLuchador(listaLuchadoresPeleando.get(i), monstruo, totalDados));
						totalHp = monstruo.getHp() - danoLuchador(listaLuchadoresPeleando.get(0), monstruo, totalDados);
						monstruo.setHp(totalHp);
						System.out.print("El monstruo ha quedado con " + totalHp + " HP");
						if (monstruo.getHp() <= 0) {
							System.out.println("El monstruo ha muerto");
							break;
						}
					}
				}
				
			}
			monstruoAtaco = false;
		}
		return listaLuchadoresPeleando;
	}

	public ArrayList<Luchador> crearlista(ArrayList<Luchador> cantLuchadores) {
		if (cantLuchadores.size() == 0) {
			cantLuchadores.add(new Luchador());
		}

		ArrayList<Luchador> nuevaListaLuchadores = new ArrayList<Luchador>();
		for (int i = 0; i < cantLuchadores.size(); i++) {
			nuevaListaLuchadores.add(cantLuchadores.get(i));
		}

		while (nuevaListaLuchadores.size() > 6) {
			nuevaListaLuchadores.remove((int) (Math.random() * nuevaListaLuchadores.size()));
		}

		ordenarLuchadoresPorVelocidad(nuevaListaLuchadores);

		return nuevaListaLuchadores;
	}

	public void ordenarLuchadoresPorVelocidad(ArrayList<Luchador> luchadoresBatalla) {
		Collections.sort(luchadoresBatalla, new Comparator<Luchador>() {
			public int compare(Luchador p1, Luchador p2) {
				return new Integer(p2.getSpd()).compareTo(new Integer(p1
						.getSpd()));
			}
		});
	}

	private float danoLuchador(Luchador luchador, Monstruo monstruo, int totalDados) {
		float dano = 0;
		float atk = 0;
		if(totalDados > 0){
			atk = luchador.getAtk()*totalDados;
			atk = calculaAtkAdicional(atk, luchador.getFaccion(), monstruo.getFaccion());
			dano = atk - monstruo.getDef();
		} else {
			dano = luchador.getAtk() - monstruo.getDef();
		}
		if (dano < 0) {
			dano = 0;
		}
		return dano;
	}

	private float danoMonstruo(Luchador luchador, Monstruo monstruo, int totalDados) {
		float dano = 0;
		float atk = 0;
		if(totalDados < 0){
			atk = monstruo.getAtk()*totalDados*-1;
			atk = calculaAtkAdicional(atk, luchador.getFaccion(), monstruo.getFaccion());
			dano = atk - luchador.getDef();
		} else {
			dano = monstruo.getAtk() - luchador.getDef();
		}
		if (dano < 0) {
			dano = 0;
		}
		return dano;
	}
	
	private float calculaAtkAdicional(float dano, String faccionLuchador, String faccionMonstruo){
		float danoTotal = dano;
		if(faccionLuchador.equals("Fuego")){
			if(faccionMonstruo.equals("Fuego") || faccionMonstruo.equals("Agua")){
				danoTotal = (float) (dano*0.75);
			} else if(faccionMonstruo.equals("Planta")){
				danoTotal = (float) (dano*1.5);
			}
		} else if(faccionLuchador.equals("Agua")){
				if(faccionMonstruo.equals("Planta") || faccionMonstruo.equals("Agua")){
					danoTotal = (float) (dano*0.75);
				} else if(faccionMonstruo.equals("Fuego")){
					danoTotal = (float) (dano*1.5);
				}
		} else if(faccionLuchador.equals("Planta")){
			if(faccionMonstruo.equals("Planta") || faccionMonstruo.equals("Fuego")){
				danoTotal = (float) (dano*0.75);
			} else if(faccionMonstruo.equals("Agua")){
				danoTotal = (float) (dano*1.5);
			}
		}
		
		return danoTotal;
	}
}
