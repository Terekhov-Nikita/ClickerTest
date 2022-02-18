package com.example.clickertest.controller;

import com.example.clickertest.model.Click;
import com.example.clickertest.repository.ClickerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/click")
public class ClickController {

    @Autowired
    ClickerRepository clickerRepository;

    @PostMapping
    public @ResponseBody
    ResponseEntity<Integer> incrementCounter(){
        Optional<Click> n = clickerRepository.findById(1L);
        if (n.isEmpty()){
            clickerRepository.save(new Click(1));
            return ResponseEntity.ok(1);
        } else {
            Click click = n.get();
            click.setClickAmount(click.getClickAmount()+1);
            click = clickerRepository.save(click);
            return ResponseEntity.ok(click.getClickAmount());
        }
    }

    @GetMapping
    public @ResponseBody
    ResponseEntity<Integer> getClick(){
        Optional<Click> n = clickerRepository.findById(1L);
        Click click;
        if (n.isEmpty())
            click = clickerRepository.save(new Click(1));
        else
            click = n.get();
        return ResponseEntity.ok(click.getClickAmount());
    }

}
