package com.corhuila.electivaii.Controller;


import com.corhuila.electivaii.Entity.Modulo;
import com.corhuila.electivaii.IService.IModuloService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/modulo")
public class ModuloController extends ABaseController<Modulo, IModuloService> {
    public ModuloController(IModuloService service) {
        super(service, "Modulo");
    }
}
