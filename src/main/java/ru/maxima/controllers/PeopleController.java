package ru.maxima.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.maxima.dao.PersonDAO;
import ru.maxima.model.Person;

@Controller
@RequestMapping("/people")
public class PeopleController {
    private final PersonDAO personDAO;

    @Autowired
    public PeopleController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping()
    public String showAllPeople(Model model) {
        model.addAttribute("allPeople", personDAO.getAllPeople());
        return "view-with-all-people";
    }

    @GetMapping("/{id}")
    public String showPersonById(@PathVariable("id") Long id, Model model) {
        model.addAttribute("personById", personDAO.findById(id));
        return "view-with-person-by-id";
    }

    @GetMapping("/new")
    public String givToUserPAgeToCreateNewPerson(Model model) {

        model.addAttribute("newPerson", new Person());
        return "view-to-create-new-person";
    }

    @PostMapping()
    public String createNewPerson(@ModelAttribute("newPerson") Person person) {
        personDAO.save(person);
        return "redirect:/people";
    }

    @GetMapping("/{id}/edit")
    public String givToUserPAgeToEditNewPerson(@PathVariable("id") Long id, Model model) {
        model.addAttribute("editedPerson", personDAO.findById(id));
        return "view-to-edit-person";
    }

    @PatchMapping("/{id}")
    public String updateEditedPerson(@PathVariable("id") Long id,
                                     @ModelAttribute("editedPerson") Person editedPerson) {
        personDAO.update(id, editedPerson);
        return "redirect:/people";
    }

}
