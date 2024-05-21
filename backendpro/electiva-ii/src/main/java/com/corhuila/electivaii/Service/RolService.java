package com.corhuila.electivaii.Service;

import com.corhuila.electivaii.Entity.Rol;
import com.corhuila.electivaii.IRepository.IBaseRepository;
import com.corhuila.electivaii.IService.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService extends ABaseService<Rol> implements IRolService {

    @Override
    protected IBaseRepository<Rol, Long> getRepository() {
        return repository;
    }

    @Autowired
    private IBaseRepository<Rol, Long> repository;
}
