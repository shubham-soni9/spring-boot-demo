package com.example.demo.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.UUID

data class Person(
    @JsonProperty("id")
    val id: UUID? = null,

    @JsonProperty("name")
    val name: String
)
