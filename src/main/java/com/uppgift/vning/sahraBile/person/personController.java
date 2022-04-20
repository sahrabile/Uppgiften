package com.uppgift.vning.sahraBile.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")

public class personController {

    @Autowired
    private personService personService;


    @GetMapping("/{id}")
    // Build get persson by id Rest API
    @CrossOrigin
    public ResponseEntity<PersonModel> getPersonById(@PathVariable("id") Long id){
        return new ResponseEntity<PersonModel>(personService.getPersonById(id), HttpStatus.OK);
    }

    // Build create get all customer REST API
    @GetMapping("/all")
    @CrossOrigin
    public List<PersonModel> getAllPersons(){
        return personService.getAllPersons();

    }

    //build create customer REST API
    @PostMapping
    @CrossOrigin
    public ResponseEntity<PersonModel> createPerson(@RequestBody PersonModel personModel){
        return new ResponseEntity<PersonModel>(personService.savePersons(personModel), HttpStatus.CREATED);

    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deletePersonById(@PathVariable("id") Long id){

        // delete Customer from databasen
        personService.deletePersonById(id);
        return  new ResponseEntity<String>("Person deleted successful!" ,HttpStatus.OK);
    }


    @PutMapping(path = "/{id}")

    public ResponseEntity<PersonModel> updatePerson(@PathVariable("id") Long id, @RequestBody PersonModel personModel){
        return new ResponseEntity<PersonModel>(personService.updatePerson(personModel, id),HttpStatus.OK);
    }

}


