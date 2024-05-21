package com.corhuila.electivaii.Service;

import com.corhuila.electivaii.Entity.Vista;
import com.corhuila.electivaii.IRepository.IBaseRepository;
import com.corhuila.electivaii.IService.IVistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VistaService extends ABaseService<Vista> implements IVistaService {

    @Override
    protected IBaseRepository<Vista, Long> getRepository() {
        return repository;
    }

    @Autowired
    private IBaseRepository<Vista, Long> repository;
}
