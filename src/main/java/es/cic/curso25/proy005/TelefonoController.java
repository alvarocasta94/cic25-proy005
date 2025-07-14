package es.cic.curso25.proy005;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/telefono")
public class TelefonoController {

    // private int contador = 0;

    // private Telefono telefono;
    // C R U D


    @GetMapping
    public List<Telefono> get() {
        // contador++;

        List<Telefono> resultado = new ArrayList<>();

        Telefono telefono1 = new Telefono();
        telefono1.setId(1);
        telefono1.setNumero("55555555");
        telefono1.setTipoContrato(3);
        telefono1.setTitular("Juan");

        resultado.add(telefono1);

        Telefono telefono2 = new Telefono();
        telefono2.setId(2);
        telefono2.setNumero("55555556");
        telefono2.setTipoContrato(1);
        telefono2.setTitular("Antonio");

        resultado.add(telefono2);

        return resultado;
    }



    @GetMapping("/{id}")
    public Telefono get(@PathVariable long id) {
        Telefono telefono1 = new Telefono();
        telefono1.setId(id);
        telefono1.setNumero("55555555");
        telefono1.setTipoContrato(3);
        telefono1.setTitular("Juan");
        
        return telefono1;
    }

}
