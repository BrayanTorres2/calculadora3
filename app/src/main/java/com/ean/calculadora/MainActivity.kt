package com.ean.calculadora

import Mundo.dividir
import Mundo.multiplicar
import Mundo.resta
import Mundo.suma
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //vista-modelo
        //lamado de botones
        val boton_suma=findViewById<Button>(R.id.bn_suma_am)
        val boton_resta=findViewById<Button>(R.id.bn_resta_am)
        val boton_multiplicacion=findViewById<Button>(R.id.bn_multiplicar_am)
        val boton_dividir=findViewById<Button>(R.id.bt_divide_am)
        val imagen=findViewById<ImageView>(R.id.iv_logo_am)
        val boton_mensaje=findViewById<Button>(R.id.bn_ir_am)
        //boton sumar
        boton_suma.setOnClickListener {
            val text_numero_uno = findViewById<EditText>(R.id.etn_numero_uno_am)
            val text_numero_dos = findViewById<EditText>(R.id.etn_numero_dos_am)
            val label_resultado = findViewById<TextView>(R.id.tv_resultado_am)
            try {
                val numero_uno = text_numero_uno.text.toString().toInt()
                val numero_dos = text_numero_dos.text.toString().toInt()
                val resultado = suma(numero_uno, numero_dos)
                label_resultado.text = resultado.toString()
            } catch (e: Exception) {
                Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
            }
        }
        //boton resta
            boton_resta.setOnClickListener{
                val text_numero_uno=findViewById<EditText>(R.id.etn_numero_uno_am)
                val text_numero_dos=findViewById<EditText>(R.id.etn_numero_dos_am)
                val label_resultado=findViewById<TextView>(R.id.tv_resultado_am)
                try{
                    val numero_uno=text_numero_uno.text.toString().toInt()
                    val numero_dos=text_numero_dos.text.toString().toInt()
                    val resultado= resta(numero_uno,numero_dos)
                    label_resultado.text=resultado.toString()
                }
                catch (e:Exception){
                    Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
                }

        }
       //multiplicacion
        boton_multiplicacion.setOnClickListener{
            val text_numero_uno=findViewById<EditText>(R.id.etn_numero_uno_am)
            val text_numero_dos=findViewById<EditText>(R.id.etn_numero_dos_am)
            val label_resultado=findViewById<TextView>(R.id.tv_resultado_am)
            try{
                val numero_uno=text_numero_uno.text.toString().toInt()
                val numero_dos=text_numero_dos.text.toString().toInt()
                val resultado= multiplicar(numero_uno,numero_dos)
                label_resultado.text=resultado.toString()
            }
            catch (e:Exception){
                Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
            }

        }
        //division
        boton_dividir.setOnClickListener{
            val text_numero_uno=findViewById<EditText>(R.id.etn_numero_uno_am)
            val text_numero_dos=findViewById<EditText>(R.id.etn_numero_dos_am)
            val label_resultado=findViewById<TextView>(R.id.tv_resultado_am)
            try{
                val numero_uno=text_numero_uno.text.toString().toInt()
                val numero_dos=text_numero_dos.text.toString().toInt()
                val resultado= dividir(numero_uno,numero_dos)
                label_resultado.text=resultado.toString()
            }
            catch (e:Exception){
                Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
            }
        }
        ///Imagen
        imagen.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.calculadora.org/"))
            startActivity(intent)
        }
        //Boton que va a otra ventana
        boton_mensaje.setOnClickListener{
            val intent=Intent(this,Mensaje::class.java)
            startActivity(intent)
        }
    }
}