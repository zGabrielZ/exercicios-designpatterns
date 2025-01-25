package br.com.gabrielferreira.factory;

public class NomeSobrenomeFactory implements NomeFactory {

    @Override
    public String gerarNomeSobrenome(String nome, String sobrenome) {
        return nome.concat(" ").concat(sobrenome);
    }
}
