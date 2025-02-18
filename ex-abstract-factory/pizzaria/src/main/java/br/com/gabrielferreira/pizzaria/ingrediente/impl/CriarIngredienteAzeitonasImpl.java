package br.com.gabrielferreira.pizzaria.ingrediente.impl;

import br.com.gabrielferreira.pizzaria.ingrediente.CriarIngrediente;
import br.com.gabrielferreira.pizzaria.model.Ingrediente;

public class CriarIngredienteAzeitonasImpl implements CriarIngrediente {

    @Override
    public Ingrediente criarIngrediente() {
        return new Ingrediente("Azeitonas verdes");
    }
}
