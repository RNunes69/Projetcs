package br.com.rafael.ScreenMatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(@JsonAlias({"Title", "Titulo"}) String titulo,
                            @JsonAlias("Episode")Integer numero,
                            @JsonAlias("imdbRating")String avaliacao,
                            @JsonAlias("Released")Integer dataDeLancamento) {
}

//use int quando quiser simplicidade e desempenho; use Integer quando precisar tratar o número como objeto