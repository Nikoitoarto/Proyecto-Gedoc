package com.corhuila.electivaii.Controller;

import com.corhuila.electivaii.Entity.Respuesta;
import com.corhuila.electivaii.IService.IRespuestaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/respuesta")
public class RespuestaController extends ABaseController<Respuesta, IRespuestaService> {
    public RespuestaController(IRespuestaService service) {
        super(service, "Respuesta");
    }
}