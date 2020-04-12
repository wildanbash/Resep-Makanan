package com.bash.dicoding.resepmakanan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bash.dicoding.resepmakanan.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val actionBar = supportActionBar
        actionBar!!.title = intent.getStringExtra(EXTRA_NAME)
        actionBar.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.tv_detail_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_detail)
        val tvSetDescrip: TextView = findViewById(R.id.tv_detail_overview)
        val tvSetIngredient: TextView = findViewById(R.id.tv_detail_ingredient)
        val tvSetStep: TextView = findViewById(R.id.tv_detail_overview_step)

        val tvName = intent.getStringExtra(EXTRA_NAME)
        val imgPhoto = intent.getStringExtra(EXTRA_PHOTO)
        val tvDescrip = intent.getStringExtra(EXTRA_DESCRIPTION)
        val tvIngredient = intent.getStringExtra(EXTRA_INGREDIENT)
        val tvStep = intent.getStringExtra(EXTRA_STEP)

        tvSetName.text = "Resep " + tvName
        Glide.with(this)
            .load(imgPhoto)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tvSetDescrip.text = tvDescrip
        tvSetIngredient.text = tvIngredient
        tvSetStep.text = tvStep

    }
    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DESCRIPTION = "extra_description"
        const val EXTRA_INGREDIENT = "extra_ingredient"
        const val EXTRA_STEP = "extra_step"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}