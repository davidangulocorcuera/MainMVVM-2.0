package david.angulo.cheapy.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class User(
    @SerializedName("name")
    @Expose
    val name: String?,
    @SerializedName("id")
    @Expose
    val id: Int?,
    @SerializedName("email")
    @Expose
    val email: String?,
    @SerializedName("gender")
    @Expose
    val gender: Gender?,
    @SerializedName("age")
    @Expose
    val age: Int?,
    @SerializedName("location")
    @Expose
    val location: Location?
): Serializable