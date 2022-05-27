package br.com.senaibrasilia.projetofinal.dao;

import javax.persistence.EntityManager;

import br.com.senaibrasilia.projetofinal.model.Categoria;

public class CategoriaDao {

	private EntityManager em;
	
	public CategoriaDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Categoria categoria) {		
		em.persist(categoria);		
	}
	
	public void atualizar(Categoria categoria) {
		em.merge(categoria);
	}
	
	public Categoria buscarPorId(int id) {
		return em.find(Categoria.class, id);
		
	}
	
	public void remover(Categoria categoria) {
		categoria = em.merge(categoria);
		this.em.remove(categoria);
	}
	
}
