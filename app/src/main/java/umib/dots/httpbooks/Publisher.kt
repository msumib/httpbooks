package umib.dots.httpbooks

import com.google.gson.annotations.SerializedName

data class Publisher (
    @SerializedName("novatec")
    var categories: List<Category> = emptyList()
)