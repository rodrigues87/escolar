package com.padrao.controllers.rest;

import com.padrao.models.Usuario;
import com.padrao.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioRestController {

    @Autowired
    UsuarioService service;

    @GetMapping
    public ResponseEntity<?> findAll() {

        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {

        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Usuario obj) {

        return new ResponseEntity<>(service.save(obj), HttpStatus.CREATED);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<?> update(@RequestBody Usuario obj)  {

        return new ResponseEntity<>(service.save(obj), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        service.delete(id);

        return ResponseEntity.noContent().build();
    }
}
