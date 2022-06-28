package br.com.agenciathauros.cartaodevisitas.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import br.com.agenciathauros.cartaodevisitas.App
import br.com.agenciathauros.cartaodevisitas.R
import br.com.agenciathauros.cartaodevisitas.data.BusinessCard
import br.com.agenciathauros.cartaodevisitas.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater)}

    private val mainViewModel: MainViewModel by viewModels{
        MainViewModelFactory((application as App).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertLister()
    }

    private fun insertLister (){
        binding.btnClose.setOnClickListener(){
            finish()
        }

        binding.btnConfirm.setOnClickListener(){
        val businessCard = BusinessCard(
            nome = binding.tilName.editText?.text.toString(),
            enterprise = binding.tilEnterprise.editText?.text.toString(),
            phone = binding.tilPhone.editText?.text.toString(),
            email = binding.tilEmail.editText?.text.toString(),
            fundoPersonalizado = binding.tilCor.editText?.text.toString()


            )
            mainViewModel.insert(businessCard)
            Toast.makeText(this, R.string.label_show_success, Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}