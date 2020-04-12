package com.bash.dicoding.resepmakanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bash.dicoding.resepmakanan.R

class MainActivity : AppCompatActivity() {
    private lateinit var rvMakanan: RecyclerView
    private var list: ArrayList<Makanan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        actionBar!!.title = "Resep Makanan"

        rvMakanan = findViewById(R.id.rv_makanan)
        rvMakanan.setHasFixedSize(true)

        list.addAll(MakananData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvMakanan.layoutManager = LinearLayoutManager(this)
        val listMakananAdapter = ListMakananAdapter(list)
        rvMakanan.adapter = listMakananAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedItem: Int) {
        when(selectedItem){
            R.id.about ->{
                val about = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(about)
            }
        }
    }
}
