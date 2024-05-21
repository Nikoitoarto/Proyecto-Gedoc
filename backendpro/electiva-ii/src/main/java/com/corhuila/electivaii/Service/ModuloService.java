package com.corhuila.electivaii.Service;


import com.corhuila.electivaii.Entity.Modulo;
import com.corhuila.electivaii.IRepository.IBaseRepository;
import com.corhuila.electivaii.IService.IModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuloService extends ABaseService<Modulo> implements IModuloService {

    @Override
    protected IBaseRepository<Modulo, Long> getRepository() {
        return repository;
    }

    @Autowired
    private IBaseRepository<Modulo, Long> repository;
}
