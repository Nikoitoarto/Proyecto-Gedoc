package com.corhuila.electivaii.Service;

import com.corhuila.electivaii.Entity.Comunicado;
import com.corhuila.electivaii.IRepository.IBaseRepository;
import com.corhuila.electivaii.IService.IComunicadoService;
import com.corhuila.electivaii.IService.IDistribucionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComunicadoService extends ABaseService<Comunicado> implements IComunicadoService {

    @Override
    protected IBaseRepository<Comunicado, Long> getRepository() {
        return repository;
    }

    @Autowired
    private IBaseRepository<Comunicado, Long> repository;
}