package com.corhuila.electivaii.Controller;


import com.corhuila.electivaii.Entity.Comunicado;
import com.corhuila.electivaii.IService.IComunicadoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/comunicado")
public class ComunicadoController extends ABaseController<Comunicado, IComunicadoService> {
    public ComunicadoController(IComunicadoService service) {
        super(service, "Comunicado");
    }
}
