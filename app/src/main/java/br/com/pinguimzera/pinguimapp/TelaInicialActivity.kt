package br.com.pinguimzera.pinguimapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_tela_inicial.*
import kotlinx.android.synthetic.main.toolbar.*

class TelaInicialActivity : DebugActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)
        supportActionBar?.title = "PinguimApp"

        // LISTENERS
        button1.setOnClickListener{ onClickBotao1() }
        button2.setOnClickListener{ onClickBotao2() }
        button3.setOnClickListener{ onClickBotao3() }
    }

    private fun onClickBotao1(){
        val intent = Intent(this, SkinsActivity::class.java)
        startActivity(intent)
    }
    private fun onClickBotao2(){
        val intent = Intent(this, ArmasActivity::class.java)
        startActivity(intent)
    }
    private fun onClickBotao3(){
        val intent = Intent(this, MapasActivity::class.java)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        if (id == R.id.action_atualizar) {
            progressBar.visibility = View.VISIBLE
            progressBar.postDelayed({
                progressBar.visibility = View.GONE
            }, 10000)

        } else if (id == R.id.action_configurar) {
            val intent = Intent(this, TelaConfiguracaoActivity::class.java)
            startActivity(intent)

        } else if (id == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}