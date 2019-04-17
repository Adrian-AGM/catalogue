package com.luismunyoz.catalogue.ui.screens.main.categoryproducts.adapter

import android.app.Activity
import android.content.Intent
import androidx.cardview.widget.CardView
import com.luismunyoz.catalogue.R
import com.luismunyoz.catalogue.ui.util.list.BaseAdapter
import com.luismunyoz.catalogue.ui.entity.UIProduct
import com.luismunyoz.catalogue.ui.screens.DetailActivity
import com.luismunyoz.catalogue.ui.util.DataBindingViewHolder
import androidx.core.app.ActivityOptionsCompat

const val PRODUCT_ARG = "PRODUCT"
const val SHARED_ELEMENT = "productCard"

class CategoryProductsAdapter(var items: List<UIProduct>,var activity: Activity): BaseAdapter() {
    override fun onBindViewHolder(holder: DataBindingViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)
        val productCard: CardView = holder.itemView.findViewById(R.id.productCard)
        val product: UIProduct = getItemForPosition(position)
        productCard.setOnClickListener{ v ->
            val intent = Intent(activity, DetailActivity::class.java)
            intent.putExtra(PRODUCT_ARG, product)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, productCard, SHARED_ELEMENT).toBundle()
            activity.startActivity(intent,options)
        }
    }
    override fun getItemForPosition(position: Int): UIProduct {
        return items[position]
    }

    override fun getListener(): Any = Any()

    override fun getLayoutIdForPosition(position: Int): Int  = R.layout.layout_product_item

    override fun getItemCount(): Int = items.size

}