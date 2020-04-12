package com.bash.dicoding.resepmakanan

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bash.dicoding.resepmakanan.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val actionBar = supportActionBar
        actionBar!!.title = "About"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val imgProfil: ImageView = findViewById(R.id.img_profil)

        val img = R.drawable.avatar
        Glide.with(this)
            .load(img)
            .apply(RequestOptions())
            .into(imgProfil)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}