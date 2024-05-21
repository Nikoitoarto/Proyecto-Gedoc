package com.corhuila.electivaii.Service;


import com.corhuila.electivaii.Entity.Notificacion;
import com.corhuila.electivaii.IRepository.IBaseRepository;
import com.corhuila.electivaii.IService.INotificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificacionService extends ABaseService<Notificacion> implements INotificacionService {

    @Override
    protected IBaseRepository<Notificacion, Long> getRepository() {
        return repository;
    }

    @Autowired
    private IBaseRepository<Notificacion, Long> repository;
}