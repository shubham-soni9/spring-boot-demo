package com.example.demo.dao

import com.example.demo.model.Person
import org.springframework.stereotype.Repository
import java.util.*

@Repository("fakeDao")
class FakePersonDataService : PersonDao {
    companion object {
        val DB = arrayListOf<Person>()
    }

    override fun insertPerson(id: UUID, name: String): Int {
        DB.add(Person(id, name))
        return 1
    }

    override fun getAllPerson(): List<Person> {
        return DB
    }

    override fun getPersonById(id: UUID): Optional<Person> {
        return DB.stream().filter { it.id == id }.findFirst()
    }
}