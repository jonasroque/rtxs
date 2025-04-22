package br.com.rtxs.Infra.crud.controller;

/**
 * Ancestral básica para controllers CRUD.
 *
 * @author PD Case (2024), Jonas Roque
 *
 * @param <T> Tipo do recurso
 * @param <I> Tipo do ID
 * @param <F> Tipo do DTO de filtro de pesquisa
 */
public abstract class CrudController<T, I, F> {


    public CrudController() {

    }
}
