package com.example.departemny_service.controller;

import com.example.departemny_service.entity.Departemnt;
import com.example.departemny_service.service.DepartemntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("departement")
public class DepartemntController {
    @Autowired
    private DepartemntService departemntService;
 @PostMapping
    public Departemnt saveDepartemnt( @RequestBody Departemnt departemnt){

    return departemntService.saveDepartemnt(departemnt);

}
@GetMapping("/{id}")
public  Departemnt findDepartemnt( @PathVariable("id") Long departemtnid){
     return  departemntService.finddepartmentbyid(departemtnid);

}
   @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }
}
