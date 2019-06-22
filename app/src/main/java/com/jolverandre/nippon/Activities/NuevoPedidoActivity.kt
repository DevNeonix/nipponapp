package com.jolverandre.nippon.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.widget.Toolbar
import com.jolverandre.nippon.R

class NuevoPedidoActivity : AppCompatActivity() {
    lateinit var toolbar: Toolbar

    lateinit var mListView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuevo_pedido)
        binding()
    }

    private fun binding() {
        toolbar = findViewById(R.id.aNPedido_toolbar)
        mListView = findViewById(R.id.aNPedido_listpedido)
        toolbar.title = "Nuevo Pedido"
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        var list = ArrayList<String>()


        for (i:Int in 0..100 ){
            list.add("item "+i)
        }



        val adapter = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, list)
        mListView.adapter = adapter
    }
}
