package com.corhuila.electivaii.Service;

import com.corhuila.electivaii.Entity.Persona;
import com.corhuila.electivaii.IRepository.IBaseRepository;
import com.corhuila.electivaii.IService.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService extends ABaseService<Persona> implements IPersonaService {

    @Override
    protected IBaseRepository<Persona, Long> getRepository() {
        return repository;
    }

    @Autowired
    private IBaseRepository<Persona, Long> repository;
}