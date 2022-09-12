package com.example.demo.service

import com.example.demo.dao.PersonDao
import com.example.demo.model.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service
import java.util.*

@Service
class PersonService @Autowired constructor(@Qualifier("fakeDao") val personDao: PersonDao) {

    fun addPerson(person: Person) {
        personDao.addPerson(person)
    }

    fun getAllPerson(): List<Person> {
        return personDao.getAllPerson()
    }

    fun getPersonById(id: UUID): Optional<Person> {
        return personDao.getPersonById(id)
    }
}