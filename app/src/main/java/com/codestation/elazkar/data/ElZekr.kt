package com.codestation.elazkar.data

import com.google.gson.annotations.SerializedName

data class ElZekr(
    @SerializedName("id")
    var id: Int,
    @SerializedName("alzekr")
    var alzekr: String,
    @SerializedName("numberOfRepetition")
    var numberOfRepetition: String
)