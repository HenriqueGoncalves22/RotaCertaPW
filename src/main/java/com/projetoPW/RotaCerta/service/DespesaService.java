package com.projetoPW.RotaCerta.service;

import com.projetoPW.RotaCerta.entity.Despesa;
import com.projetoPW.RotaCerta.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DespesaService {
    @Autowired
    private DespesaRepository repository;

    public List<Despesa> listar(){ return repository.findAll();}

    public Despesa buscaPorId(Long id)
    {
        var existe = repository.findById(id);
        if (existe.isPresent())
            return existe.get();
        return null;
    }

    public Despesa cadastrarDespesa (Despesa despesa)
    {
        return repository.save(despesa);
    }

    public Despesa alterarDespesa (Despesa despesa){return repository.save(despesa);}


    public void removerDespesa (Long id)
    {
        var existe = buscaPorId(id);
        if(existe != null)
            repository.deleteById(id);
    }
}
