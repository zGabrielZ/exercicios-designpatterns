package br.com.gabrielferreira.contador.contadores.impl;

import br.com.gabrielferreira.contador.contadores.GerarContador;
import br.com.gabrielferreira.contador.contadores.factory.impl.ContadorArquivoFactoryImpl;
import br.com.gabrielferreira.contador.contadores.factory.ContadorFactory;

public class GerarContadorArquivoImpl extends GerarContador {

    @Override
    protected ContadorFactory criarContador() {
        return new ContadorArquivoFactoryImpl();
    }
}
