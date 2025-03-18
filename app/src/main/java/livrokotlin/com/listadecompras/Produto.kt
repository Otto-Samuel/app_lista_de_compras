package livrokotlin.com.listadecompras

import android.graphics.Bitmap
// data -> indicando que é uma classe de dados
data class Produto(
    val nome:String,
    val quantidade:Int,
    val valor:Double,
    val foto: Bitmap? = null)


