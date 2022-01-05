package com.solinftecstudy.adoptapetapp.data

import com.solinftecstudy.adoptapetapp.R
import com.solinftecstudy.adoptapetapp.data.model.Pet
import com.solinftecstudy.adoptapetapp.data.model.PetSexEnum
import java.util.*

object PetsData {
    val allPets = listOf<Pet>(
        Pet(
            UUID.randomUUID(),
            "Nikki",
            "Nikki tem 8 anos, ela é amável e adora crianças",
            PetSexEnum.FEMALE,
            "Caramelo",
            R.drawable.dog_nikki
        ),
        Pet(
            UUID.randomUUID(),
            "Midori",
            "Midori bebê linda siamêsa, vermifugada de 2 meses e meio está procurando um lar seguro e com bastante carinho",
            PetSexEnum.FEMALE,
            "Branco",
            R.drawable.cat_midori
        ),
        Pet(
            UUID.randomUUID(),
            "Misha",
            "Misha lindo gatinho bebê, peludinho, vermifugado de 2 meses e meio está procurando um lar seguro e com bastante carinho!",
            PetSexEnum.FEMALE,
            "Branco",
            R.drawable.cat_misha
        ),
        Pet(
            UUID.randomUUID(),
            "Stella",
            "Stella Linda gatinha tigrada ruivinha peludinha ,vermifugada e castrada de 11 meses está procurando um lar seguro e com bastante carinho!",
            PetSexEnum.FEMALE,
            "Cinza",
            R.drawable.cat_stella
        ),
        Pet(
            UUID.randomUUID(),
            "Biscoito",
            "Biscoito é um grande amigo, adorável e dócil de 1 ano",
            PetSexEnum.MALE,
            "Preto",
            R.drawable.dog_nikki
        ),
        Pet(
            UUID.randomUUID(),
            "Caramelo",
            "Caramelo é um grande amigo de 2 anos de idade, só não deixa ele pra fora, ele tem mania correr atrás de motoqueiros e carteiros.",
            PetSexEnum.MALE,
            "Caramelo",
            R.drawable.dog_caramelo
        ),
    )


}