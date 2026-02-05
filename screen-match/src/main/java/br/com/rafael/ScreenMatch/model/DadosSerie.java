package br.com.rafael.ScreenMatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias({"Title", "Titulo"}) String titulo,
                         @JsonAlias("totalSeasons")Integer totaltemporadas,
                         @JsonAlias("imdbRating")String avaliacao) {
                         //@JsonProperty("imdbVotes")String votos
                         //ALIAS ELE SO LE O JSON, O PROPERTY LE E TENTA DEVOLVEER IGUAL AO ESCRITO
                         //TMB E POSSIVEL FAZER ARRAY DE BUSCAS PARA O JSON
}
