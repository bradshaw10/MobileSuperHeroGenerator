package com.eoghandev.randomsuperherogenerator.models.hero

data class Events(
    val available: Int,
    val collectionURI: String,
    val items: List<ItemX>,
    val returned: Int
)