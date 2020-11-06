package practica1;

import java.util.ArrayList;

public class Jugador {
	
	private Integer valor1;
	private Integer valor2;
	private Integer valor3;
	private Integer valor4;
	private ArrayList <String> lista = new ArrayList <String>();
	
	
	public Jugador(Integer n1, Integer n2, Integer n3, Integer n4) {
		this.valor1 = n1;
		this.valor2 = n2;
		this.valor3 = n3;
		this.valor4 = n4;
	}
	
	
	
	public Integer getValor1() {
		return valor1;
	}
	
	public Integer getValor2() {
		return valor2;
	}
	
	public Integer getValor3() {
		return valor3;
	}
	
	public Integer getValor4() {
		return valor4;
	}
	
}
