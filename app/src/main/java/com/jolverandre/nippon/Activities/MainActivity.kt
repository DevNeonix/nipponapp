package com.jolverandre.nippon.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.jolverandre.nippon.Fragments.ArticulosFragment
import com.jolverandre.nippon.Fragments.ClientesFragment
import com.jolverandre.nippon.Fragments.PedidosFragment
import com.jolverandre.nippon.R
import com.ogaclejapan.smarttablayout.SmartTabLayout
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var mToolbar: Toolbar
    lateinit var mViewPager: ViewPager
    lateinit var mTabLayout: SmartTabLayout
    lateinit var mFab: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding()
        setupViewPager(mViewPager);
    }

    private fun binding() {
        mToolbar = findViewById(R.id.aMain_toolbar)
        mViewPager = findViewById(R.id.viewpager)
        mTabLayout = findViewById(R.id.aMain_tabs)

        mFab = findViewById(R.id.aMain_fab)
        mToolbar.setTitle("Inicio")
        setSupportActionBar(mToolbar)


        mFab.setOnClickListener {
            startActivity(Intent(applicationContext, NuevoPedidoActivity::class.java))
        }

    }

    private fun setupViewPager(viewPager: ViewPager) {

        val pages = FragmentPagerItems(this)

        pages.add(FragmentPagerItem.of("Articulos", ArticulosFragment::class.java))
        pages.add(FragmentPagerItem.of("Clientes", ClientesFragment::class.java))
        pages.add(FragmentPagerItem.of("Pedidos", PedidosFragment::class.java))


        val adapter = FragmentPagerItemAdapter(
            supportFragmentManager, pages
        )

        viewPager.adapter = adapter
        mTabLayout.setViewPager(viewPager)

    }


}