package com.corhuila.electivaii.Service;

import com.corhuila.electivaii.Entity.Distribucion;
import com.corhuila.electivaii.IRepository.IBaseRepository;
import com.corhuila.electivaii.IService.IDistribucionService;
import com.corhuila.electivaii.IService.INotificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistribucionService extends ABaseService<Distribucion> implements IDistribucionService {

    @Override
    protected IBaseRepository<Distribucion, Long> getRepository() {
        return repository;
    }

    @Autowired
    private IBaseRepository<Distribucion, Long> repository;
}