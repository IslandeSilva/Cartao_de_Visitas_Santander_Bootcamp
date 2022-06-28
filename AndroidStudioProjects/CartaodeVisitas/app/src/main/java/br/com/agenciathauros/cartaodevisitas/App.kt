package br.com.agenciathauros.cartaodevisitas

import android.app.Application
import br.com.agenciathauros.cartaodevisitas.data.AppDatabase
import br.com.agenciathauros.cartaodevisitas.data.BusinessCardRepository

class App : Application() {
    val database by lazy {AppDatabase.getDatabase(this)}
    val repository by lazy {BusinessCardRepository(database.businessDao())}
}