package com.uppgift.vning.sahraBile.person;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class personServiceImpl implements personService {

    private  personRepository personRepository;
    @Override
    public PersonModel getPersonById(Long id) {
        return personRepository.getById(id);
    }

    @Override
    public List<PersonModel> getAllPersons() {
        return personRepository.findAll();
    }

    @Override
    public PersonModel savePersons(PersonModel personModel) {
        return personRepository.save(personModel);
    }

    @Override
    public void deletePersonById(Long id) {
        personRepository.deleteById(id);
    }

    @Override
    public PersonModel updatePerson(PersonModel personModel, Long id) {


        return null;
    }
}
