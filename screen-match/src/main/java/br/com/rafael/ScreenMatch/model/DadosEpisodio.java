package br.com.rafael.ScreenMatch.model;

public record DadosEpisodio(String titulo,
                            Integer numero,
                            String avaliacao,
                            String dataLancamento,
                            Integer temporada) {
}
//use int quando quiser simplicidade e desempenho; use Integer quando precisar tratar o número como objeto