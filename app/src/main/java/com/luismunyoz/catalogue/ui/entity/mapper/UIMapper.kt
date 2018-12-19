package com.luismunyoz.catalogue.ui.entity.mapper

import com.luismunyoz.catalogue.domain.entity.Category
import com.luismunyoz.catalogue.domain.entity.Product
import com.luismunyoz.catalogue.ui.entity.UICategory
import com.luismunyoz.catalogue.ui.entity.UIProduct
import javax.inject.Inject

class UIMapper @Inject constructor() {

    @JvmName("mapCategories")
    fun map(categories: List<Category>) : List<UICategory> = categories.map { map(it) }

    fun map(category: Category) : UICategory = UICategory(category.name)

    @JvmName("mapItems")
    fun map(products: List<Product>) : List<UIProduct> = products.map { map(it) }

    fun map(product: Product) : UIProduct = UIProduct(product.id, product.name, product.isSoldOut(), product.numLikes, product.numComments, product.price, product.photo)

}