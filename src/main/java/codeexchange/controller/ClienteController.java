package codeexchange.controller;

import codeexchange.model.ClienteModel;
import codeexchange.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteModel> create (@RequestBody ClienteModel cliente){
        return ResponseEntity.ok(clienteService.create(cliente));
    }

    @GetMapping
    public List<ClienteModel> list(){
        return clienteService.list();
    }

    @PutMapping
    public ResponseEntity<ClienteModel> update(@RequestBody ClienteModel cliente) {
        return ResponseEntity.ok(clienteService.update(cliente));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        clienteService.delete(id);
    }

}
