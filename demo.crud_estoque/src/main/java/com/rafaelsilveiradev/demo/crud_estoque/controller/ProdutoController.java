package com.rafaelsilveiradev.demo.crud_estoque.controller;

import com.rafaelsilveiradev.demo.crud_estoque.Dao.ProdutoDao;
import com.rafaelsilveiradev.demo.crud_estoque.entity.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("produtos")
    public class ProdutoController {

        @Autowired
        private ProdutoDao dao;

        @PostMapping
        public Produto salvar(@RequestBody Produto produto) {
            dao.save(produto);
            return produto;
        }

        @PutMapping
        public Produto atualizar(@RequestBody Produto produto) {
            dao.update(produto);
            return produto;
        }


        @DeleteMapping("{id}")
        public String remover(@PathVariable Long id) {
            dao.delete(id);
            return "Produto id = " + id + "foi excluido com sucesso";
        }





        @GetMapping ("{id}")
        public Produto getById(@PathVariable Long id){
            return dao.findById(id);
        }


        @GetMapping
        public   List<Produto> getAll(){
            return dao.findAll();
        }


    }