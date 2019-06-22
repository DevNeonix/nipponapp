package com.jolverandre.nippon.Fragments


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.ArrayAdapter
import androidx.core.view.ViewCompat
import com.jolverandre.nippon.Adapters.ArticuloAdapter
import com.jolverandre.nippon.Models.Articulo
import com.jolverandre.nippon.R


class ArticulosFragment : Fragment() {
    lateinit var lvArticulos: ListView;
    var vView: View? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_articulos, container, false)
        this.vView = view;
        bind();
        var list = ArrayList<Articulo>()
        for (i in 0..30) {
            list.add(Articulo())
        }
        Log.e("AFragment", list.size.toString())
        val adapter = ArticuloAdapter(context, R.layout.item_articulo, list);
        lvArticulos.adapter = adapter
        ViewCompat.setNestedScrollingEnabled(lvArticulos, true)



        return view;
    }

    private fun bind() {
        lvArticulos = vView!!.findViewById(R.id.fArticulos_listArticulos);
    }


}
