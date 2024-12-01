package com.projetoPW.RotaCerta.controller;

import com.projetoPW.RotaCerta.entity.Despesa;
import com.projetoPW.RotaCerta.service.DespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/despesas")
public class DespesaController {

        @Autowired
        private DespesaService service;

        // Listar todas as despesas
        @GetMapping
        public List<Despesa> listar() {
            return service.listar();
        }

        // Buscar despesa por ID
        @GetMapping("/{id}")
        public Despesa buscarPorId(@PathVariable Long id) {
            return service.buscaPorId(id);
        }

        // Cadastrar uma nova despesa
        @PostMapping
        public Despesa cadastrar(@RequestBody Despesa despesa) {return service.cadastrarDespesa(despesa);}

        // Alterar dados de um despesa
        @PutMapping("/{id}")
        public Despesa alterar(@RequestBody Despesa despesa, @PathVariable Long id) {
            despesa.setId(id);
            return service.alterarDespesa(despesa);
        }

        // Excluir despesa por ID
        @DeleteMapping("/{id}")
        public void excluir (@PathVariable Long id) {
            service.removerDespesa(id);
        }
    }


