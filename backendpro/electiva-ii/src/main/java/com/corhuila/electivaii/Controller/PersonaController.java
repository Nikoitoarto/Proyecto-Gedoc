package com.corhuila.electivaii.Controller;


import com.corhuila.electivaii.Entity.Persona;
import com.corhuila.electivaii.IService.IPersonaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/persona")
public class PersonaController extends ABaseController<Persona, IPersonaService> {
    public PersonaController(IPersonaService service) {
        super(service, "Persona");
    }
}
