package br.com.gabrielferreira.filmes.main;

import br.com.gabrielferreira.filmes.model.Filme;
import br.com.gabrielferreira.filmes.repository.impl.FilmeRepositoryImpl;
import br.com.gabrielferreira.filmes.service.FilmeService;
import br.com.gabrielferreira.filmes.service.impl.FilmeServiceImpl;

import java.time.Clock;
import java.time.LocalDate;

public class SalvarFilme {

    public static void main(String[] args) {
        FilmeService filmeService = new FilmeServiceImpl(new FilmeRepositoryImpl(), Clock.systemDefaultZone());

        Filme filme = new Filme();
        filme.setTitulo("Matrix");
        filme.setDataLancamento(LocalDate.of(1999, 3, 31));

        filmeService.salvar(filme);

        filme = new Filme();
        filme.setTitulo("Matrix Reloaded");
        filme.setDataLancamento(LocalDate.of(2003, 5, 15));

        filmeService.salvar(filme);

        filme = new Filme();
        filme.setTitulo("Capitão América: Admirável Mundo Novo");
        filme.setDataLancamento(LocalDate.of(2025, 2, 14));

        filmeService.salvar(filme);
    }
}
