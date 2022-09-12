package com.example.demo.api

import com.example.demo.model.Person
import com.example.demo.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class PersonController @Autowired constructor(val personService: PersonService) {

    @PostMapping("api/v1/person")
    fun addPerson(@RequestBody person: Person) {
        personService.addPerson(person)
    }

    @GetMapping("api/v1/person_list")
    fun getPersonList(): List<Person> {
        return personService.getAllPerson()
    }

    @GetMapping("api/v1/get_person")
    fun getPersonById(@RequestParam("id") id: UUID): Optional<Person> {
        return personService.getPersonById(id)
    }
}