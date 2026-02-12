package br.com.rafael.ScreenMatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosTemporada(@JsonAlias("") numero,
                             List<DadosEpisodio> episodios) {
}
