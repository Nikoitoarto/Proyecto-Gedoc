package com.corhuila.electivaii.Service;

import com.corhuila.electivaii.Entity.Usuario;
import com.corhuila.electivaii.IRepository.IBaseRepository;
import com.corhuila.electivaii.IService.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService extends ABaseService<Usuario> implements IUsuarioService {

    @Override
    protected IBaseRepository<Usuario, Long> getRepository() {
        return repository;
    }

    @Autowired
    private IBaseRepository<Usuario, Long> repository;
}
