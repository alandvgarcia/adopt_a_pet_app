package com.solinftecstudy.adoptapetapp.data.model

import java.util.*

data class Pet(
    val id: UUID,
    val name: String,
    val description: String,
    val sex: PetSexEnum,
    val color: String,
    val imageResource: Int? = null
)

enum class PetSexEnum{
    FEMALE, MALE
}
