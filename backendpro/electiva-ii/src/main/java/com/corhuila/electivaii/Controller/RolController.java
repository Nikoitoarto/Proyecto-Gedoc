package com.corhuila.electivaii.Controller;


import com.corhuila.electivaii.Entity.Rol;
import com.corhuila.electivaii.IService.IRolService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/rol")
public class RolController extends ABaseController<Rol, IRolService> {
    public RolController(IRolService service) {
        super(service, "Rol");
    }
}
