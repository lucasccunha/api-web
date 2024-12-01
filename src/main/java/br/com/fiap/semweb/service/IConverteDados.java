package br.com.fiap.semweb.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
