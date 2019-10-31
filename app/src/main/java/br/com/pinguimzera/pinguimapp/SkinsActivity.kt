package br.com.pinguimzera.pinguimapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class SkinsActivity : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skins)
        supportActionBar?.title = "Skins"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}
