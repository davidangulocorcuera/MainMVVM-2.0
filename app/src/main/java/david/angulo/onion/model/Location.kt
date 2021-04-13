package david.angulo.onion.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import david.angulo.onion.model.Geo
import java.io.Serializable

class Location(
    @SerializedName("geo")
    @Expose
    val geo: Geo? = null,
    @SerializedName("city")
    @Expose
    val city: String? = null,
    @SerializedName("countryCode")
    @Expose
    val countryCode: String? = null,
    @SerializedName("ccountry")
    @Expose
    val country: String? = null,
    @SerializedName("postalCode")
    @Expose
    val postalCode: String? = null
) : Serializable