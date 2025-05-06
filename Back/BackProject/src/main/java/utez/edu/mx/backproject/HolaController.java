package utez.edu.mx.backproject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")

@RestController
@RequestMapping("/api")
public class HolaController {

    @GetMapping("/hola")
    public String decirHola() {
        return "Hola desde mi backend";
    }
}
