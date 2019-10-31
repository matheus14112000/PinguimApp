package br.com.pinguimzera.pinguimapp

import android.content.Context

object DisciplinaService {

    fun getDisciplinas(context: Context): List<Disciplina> {

        val disciplinas = mutableListOf<Disciplina>()

        for (i in 1..10){
            val d = Disciplina()
            d.nome = "Disciplina $i"
            d.ementa = "Ementa $i"
            d.professor = "Professor $i"
            d.foto = "https://www.android.com/static/images/logos/andy-lg.png"
            disciplinas.add(d)
        }
        return disciplinas
    }
}