package com.corhuila.electivaii.Service;


import com.corhuila.electivaii.Entity.Respuesta;
import com.corhuila.electivaii.IRepository.IBaseRepository;
import com.corhuila.electivaii.IService.IRespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestaService extends ABaseService<Respuesta> implements IRespuestaService {

    @Override
    protected IBaseRepository<Respuesta, Long> getRepository() {
        return repository;
    }

    @Autowired
    private IBaseRepository<Respuesta, Long> repository;
}