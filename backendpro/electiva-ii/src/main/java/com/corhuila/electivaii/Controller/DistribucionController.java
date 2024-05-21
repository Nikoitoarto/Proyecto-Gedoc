package com.corhuila.electivaii.Controller;

import com.corhuila.electivaii.Entity.Distribucion;
import com.corhuila.electivaii.IService.IDistribucionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/distribucion")
public class DistribucionController extends ABaseController<Distribucion, IDistribucionService> {
    public DistribucionController(IDistribucionService service) {
        super(service, "Distribucion");
    }
}