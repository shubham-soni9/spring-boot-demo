package com.example.demo.dao

import com.example.demo.model.Person
import java.util.*

interface PersonDao {

    fun insertPerson(id: UUID, name: String): Int

    fun addPerson(person: Person): Int {
        val id = UUID.randomUUID()
        return insertPerson(id, person.name)
    }

    fun getAllPerson(): List<Person>

    fun getPersonById(id: UUID): Optional<Person>

}