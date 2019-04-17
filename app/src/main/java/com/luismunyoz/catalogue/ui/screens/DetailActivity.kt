package com.luismunyoz.catalogue.ui.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.luismunyoz.catalogue.R
import com.luismunyoz.catalogue.databinding.ActivityDetailBinding
import com.luismunyoz.catalogue.ui.entity.UIProduct
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    lateinit var item: UIProduct

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_detail)
        item = intent.getSerializableExtra(com.luismunyoz.catalogue.ui.screens.main.categoryproducts.adapter.PRODUCT_ARG) as UIProduct
        binding.product.item = item
        binding.item = item

        setSupportActionBar(detailToolbar)
    }
}
