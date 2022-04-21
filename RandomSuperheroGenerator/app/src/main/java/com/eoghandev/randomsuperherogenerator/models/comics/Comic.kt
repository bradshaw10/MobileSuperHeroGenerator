package com.eoghandev.randomsuperherogenerator.models.comics

import com.eoghandev.randomsuperherogenerator.models.hero.Thumbnail
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Comic(
    @SerializedName("id")
    @Expose
    var id: String? = null,
    @SerializedName("title")
    @Expose
    var title: String? = null,
    @SerializedName("thumbnail")
    @Expose
    var thumbnail: Thumbnail? = null,
    @SerializedName("description")
    @Expose
    var description: String? = null,
): Serializable
