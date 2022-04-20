package com.uppgift.vning.sahraBile.person;

import java.util.List;

public interface personService {
    PersonModel getPersonById(Long id);

    List<PersonModel> getAllPersons();

    PersonModel savePersons(PersonModel personModel);

    void deletePersonById(Long id);

    PersonModel updatePerson(PersonModel personModel, Long id);
}
