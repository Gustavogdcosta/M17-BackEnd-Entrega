package br.com.M17Entrega;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Carros> Colecao = new ArrayList<>();
		Colecao.add(new HRV());
		Colecao.add(new HondaCivic());
		Colecao.add(new EcoSport());
		imprimirCarros(Colecao);
		
	}

	
	public static void imprimirCarros(List<? extends Carros> lista) {
		for (Carros Colecao: lista) {
			System.out.println(Colecao);
		}
	}
}
