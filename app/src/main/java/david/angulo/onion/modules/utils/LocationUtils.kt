package david.angulo.onion.modules.utils

import android.content.Context
import android.location.Location
import android.location.Geocoder
import androidx.lifecycle.MutableLiveData
import david.angulo.onion.model.Geo
import java.util.*
import kotlin.collections.HashMap


object LocationUtils {

    fun getDistance(lat1: Double, lon1: Double, lat2: Double, lon2: Double): Float {
        val distance = FloatArray(2)
        Location.distanceBetween(lat1, lon1, lat2, lon2, distance)
        return distance[0]
    }

    fun getLocationDetails(context: Context, geo: Geo): MutableLiveData<HashMap<String, String>> {
        val locationDetails: MutableLiveData<HashMap<String,String>> = MutableLiveData()
        val geoCoder = Geocoder(context, Locale.getDefault())
        val addresses = geoCoder.getFromLocation(geo.lat, geo.lng, 1)

        locationDetails.value?.put("city",addresses[0].getAddressLine(0))
        locationDetails.value?.put("country",addresses[0].getAddressLine(2))

        return locationDetails

    }

}