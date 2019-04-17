package com.luismunyoz.catalogue.ui.entity

import java.io.Serializable

data class UIProduct (
    val id: String,
    val name: String,
    val isSoldOut: Boolean,
    val numLikes: Int,
    val numComments: Int,
    val price: Int,
    val photo: String,
    val title: String,
    val description: String
) : Serializable {
    fun getLikes(): String = numLikes.toString()

    fun getComments(): String = numComments.toString()

    fun getReadablePrice(): String = "$price€"
}