package com.corhuila.electivaii.Controller;

import com.corhuila.electivaii.Entity.Vista;
import com.corhuila.electivaii.IService.IVistaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/vista")
public class VistaController extends ABaseController<Vista, IVistaService> {
    public VistaController(IVistaService service) {
        super(service, "Vista");
    }
}
