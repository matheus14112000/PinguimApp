package br.com.pinguimzera.pinguimapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.login.*

class MainActivity : DebugActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        imagemLogin.setImageResource(R.drawable.imagem_inicial)
        botao_login.setOnClickListener{ onClickBotao() }
    }

    private fun onClickBotao(){

        val usuario = campo_usuario.text.toString()
        val senha = campo_senha.text.toString()

        if (usuario == "aluno" && senha == "impacta"){
            Toast.makeText(this, "Bem vindo $usuario",
                Toast.LENGTH_SHORT).show()

            val intent = Intent(this, TelaInicialActivity::class.java)
            startActivity(intent)
        }
        else{
            Toast.makeText(this, "Usuário ou senha incorretos",
                Toast.LENGTH_SHORT).show()
        }
    }
}
