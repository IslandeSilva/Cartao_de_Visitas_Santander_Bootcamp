package br.com.agenciathauros.cartaodevisitas.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class BusinessCard(


    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nome: String,
    val enterprise: String,
    val phone: String,
    val email: String,
    val fundoPersonalizado: String
)