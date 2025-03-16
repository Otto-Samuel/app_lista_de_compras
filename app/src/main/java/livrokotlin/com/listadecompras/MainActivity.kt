package livrokotlin.com.listadecompras

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        // Referências aos componentes do layout
        val txt_produto = findViewById<EditText>(R.id.txt_produto)
        val list_view_produtos = findViewById<ListView>(R.id.list_view)
        val btn_inserir = findViewById<Button>(R.id.btn_inserir)

        // Criando o ArrayAdapter para a ListView
        val produtosAdapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1
        )
        list_view_produtos.adapter = produtosAdapter

        // Ação do botão inserir

        list_view_produtos.setOnItemLongClickListener { adapterView:AdapterView <*>, view: View,
                                                        position: Int, id: Long ->
            val item = produtosAdapter.getItem(position)
            produtosAdapter.remove(item)

            true
        }

    }
}