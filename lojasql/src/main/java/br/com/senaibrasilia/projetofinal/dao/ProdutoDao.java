package br.com.senaibrasilia.projetofinal.dao;


import java.util.List;

import javax.persistence.EntityManager;

import br.com.senaibrasilia.projetofinal.model.Produto;



public class ProdutoDao {

	private EntityManager em;
	
	public ProdutoDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Produto produto) {
		em.persist(produto);
	}
	
	public void altualizar(Produto produto) {
		em.merge(produto);
	}
	
	public void remover(Produto produto) {
		produto = em.merge(produto);
		this.em.remove(produto);
	}
		
	public Produto pesquisarId(Long id) {
		return em.find(Produto.class, id);
	}
	
	public List<Produto> pesquisarPorNome(String nome) {
		String jpql= "SELECT p FROM Produto p WHERE p.nome= :nome";
		return em.createQuery(jpql ,Produto.class)
				.setParameter("nome",nome)
				.getResultList();
	}
	
	public List<Produto> pesquisarTodos() {
		String jpql= "SELECT p FROM Produto p";
		return em.createQuery(jpql ,Produto.class).getResultList();
	}
	
}
