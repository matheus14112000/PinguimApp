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

        campo_usuario.setText(Prefs.getString("lembrarNome"))
        campo_senha.setText(Prefs.getString("lembrarSenha"))
        cb_lembrar_senha.isChecked = Prefs.getBoolean("checkLembrar")
    }

    private fun onClickBotao(){

        val usuario = campo_usuario.text.toString()
        val senha = campo_senha.text.toString()
        val checkBox = cb_lembrar_senha.isChecked
        Prefs.setBoolean("cb_lembrar_senha", checkBox)

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

        if (checkBox){
            Prefs.setString("lembrarNome", usuario)
            Prefs.setString("lembrarSenha", senha)
        } else{
            Prefs.setString("lembrarNome","")
            Prefs.setString("lembrarSenha","")
        }
    }
}
