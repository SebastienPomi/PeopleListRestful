/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.presentation.beans;

import ch.hearc.ig.odi.peoplelist.business.Person;
import ch.hearc.ig.odi.peoplelist.service.Services;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author sebastie.pomi
 */
@Named(value = "peopleBean")
@RequestScoped
public class PeopleBean extends Person {

    @Inject
    Services services;
    private Person personToDelete;

    /**
     * Creates a new instance of PeopleAddBean
     */

    public PeopleBean() {
        super();
    }

    public String addPeople() {
        services.savePerson(super.getGender(), super.getFirstName(), super.getLastName(), super.getMarried(), super.getBirthDate());
        return "index.xhtml";
    }

    public String deletePeople() {
        services.deletePerson(personToDelete);
        return "index.xhtml";
    }

    public Person getPersonToDelete() {
        return personToDelete;
    }

    public void setPersonToDelete(Person personToDelete) {
        this.personToDelete = personToDelete;
    }

}
