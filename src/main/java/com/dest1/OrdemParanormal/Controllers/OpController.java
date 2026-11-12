package com.dest1.OrdemParanormal.Controllers;

import com.dest1.OrdemParanormal.Repositories.OpRepository;
import com.dest1.OrdemParanormal.entities.OrdemParanormal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("Thing Of The Paranormal")
public class OpController {

    @Autowired
    OpRepository repository;

    @PostMapping
    public OrdemParanormal p(@RequestBody OrdemParanormal op){
        return repository.save(op);
    }

    @GetMapping
    public List<OrdemParanormal>mostrar(){
        return repository.findAll();
    }
}
