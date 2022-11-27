package codeexchange.controller;

import codeexchange.model.TransacaoModel;
import codeexchange.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {

    @Autowired
    private TransacaoService transacaoService;

    @PostMapping
    public ResponseEntity<TransacaoModel> create (@RequestBody TransacaoModel transacao){
        return ResponseEntity.ok(transacaoService.create(transacao));
    }

    @GetMapping
    public ResponseEntity<List<TransacaoModel>> viewAllTransactions (){
        return ResponseEntity.ok(transacaoService.list());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        transacaoService.delete(id);
    }
}
