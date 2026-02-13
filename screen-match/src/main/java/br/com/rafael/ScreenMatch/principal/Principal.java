package br.com.rafael.ScreenMatch.principal;

import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);

    private final String endereco;
    private final String apiKey;

    public Principal(String endereco, String apiKey) {
        this.endereco = endereco;
        this.apiKey = apiKey;
    }

    public void exibMenu(){
        System.out.println("https://omdbapi.com/?t=impuros&season=1&episode=1&apikey=5fffbc20&");
        var nomeSerie = leitura.nextLine();
        //"https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c"
    }
}