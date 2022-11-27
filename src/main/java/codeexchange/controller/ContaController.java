package codeexchange.controller;

import codeexchange.model.ContaModel;
import codeexchange.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @Autowired
    private ContaService contaService;

    @PostMapping
    public ResponseEntity<ContaModel> create (@RequestBody ContaModel conta){
        return ResponseEntity.ok(contaService.create(conta));
    }

    @GetMapping
    public List<ContaModel> list(){
        return contaService.list();
    }

    @PutMapping
    public ResponseEntity<ContaModel> update (@RequestBody ContaModel conta){
        return ResponseEntity.ok(contaService.update(conta));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        contaService.delete(id);
    }

}
