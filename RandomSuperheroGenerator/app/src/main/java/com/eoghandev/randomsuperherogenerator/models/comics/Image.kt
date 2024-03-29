package com.eoghandev.randomsuperherogenerator.models.comics

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Image (
    @SerializedName("path")
    @Expose
    var path: String? = null,
    @SerializedName("extension")
    @Expose
    var extension: String? = null
)