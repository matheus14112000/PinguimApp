package br.com.pinguimzera.pinguimapp

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_mapas.*

class MapasActivity : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Mapas"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recyclerDisciplinas?.layoutManager = LinearLayoutManager(this)
        recyclerDisciplinas?.itemAnimator = DefaultItemAnimator()
        recyclerDisciplinas.setHasFixedSize(true)
    }

    var disciplinas = listOf<Disciplina>()

    override fun onResume() {
        super.onResume()
        disciplinas = DisciplinaService.getDisciplinas(this)

        recyclerDisciplinas?.adapter = DisciplinaAdapter(disciplinas) {onClickDisciplina(it)}
    }

    fun onClickDisciplina(disciplina: Disciplina){
        Toast.makeText(this, "Clicou em Disciplina ${disciplina.nome}", Toast.LENGTH_SHORT).show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}
