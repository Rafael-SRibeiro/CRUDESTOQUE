package com.rafaelsilveiradev.demo.crud_estoque.Dao;

import com.rafaelsilveiradev.demo.crud_estoque.entity.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ProdutoDao {


@PersistenceContext
private EntityManager manager;


    @Transactional(readOnly = false)
    public void save(Produto produto){
        this.manager.persist(produto);
    }



    @Transactional(readOnly = false)
    public void update(Produto produto){
        this.manager.merge(produto);
    }

    @Transactional(readOnly = false)
    public void delete(Long id){
        this.manager.remove(this.manager.getReference(Produto.class, id));
    }

    @Transactional(readOnly = true)
    public Produto findById(Long id){
        return  this.manager.find(Produto.class ,id);

    }

    @Transactional(readOnly = true)
    public List<Produto> findAll(){
        String query = "select a from Produto a";
        return this.manager.createQuery(query, Produto.class).getResultList();

    }


}
