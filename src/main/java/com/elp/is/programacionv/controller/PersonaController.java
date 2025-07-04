package com.elp.is.programacionv.controller;

import com.elp.is.programacionv.controller.dto.PersonaRequest;
import com.elp.is.programacionv.controller.dto.PersonaResponse;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1")
public class PersonaController {

    @GetMapping("/persona")
    public String persona() {
        return "Hola Mundo";
    }

    /*GetMapping("/personas")
    public List<Persona> personaList() {
        return personas();
    }*/

    @PostMapping("/guardar/persona")
    public List<PersonaRequest> guardarPersona(@RequestBody PersonaRequest persona) {
        List<PersonaRequest> listPersona = new ArrayList<>();
        listPersona.add(persona);

        return listPersona;
    }
    
    @PostMapping("/nombre/persona")
    public PersonaResponse guardarPersonaUnica(@RequestBody PersonaRequest persona) {
    	PersonaResponse respuesta = new PersonaResponse();
    	respuesta.setNombreCompleto(persona.getNombre().concat(" ").concat(persona.getApellido()));

        return respuesta;
    }


}
