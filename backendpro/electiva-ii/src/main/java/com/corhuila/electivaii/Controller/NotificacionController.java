package com.corhuila.electivaii.Controller;

import com.corhuila.electivaii.Entity.Notificacion;
import com.corhuila.electivaii.IService.INotificacionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/notificacion")
public class NotificacionController extends ABaseController<Notificacion, INotificacionService> {
    public NotificacionController(INotificacionService service) {
        super(service, "Notificacion");
    }
}