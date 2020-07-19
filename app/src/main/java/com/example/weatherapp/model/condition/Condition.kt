/* 
Copyright (c) 2020 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */
package com.example.weatherapp.model.condition

import com.google.gson.annotations.SerializedName
import java.text.SimpleDateFormat
import java.util.*

data class Condition (

	@SerializedName("LocalObservationDateTime") val localObservationDateTime : String,
	@SerializedName("EpochTime") val epochTime : Int,
	@SerializedName("WeatherText") val weatherText : String,
	@SerializedName("WeatherIcon") val weatherIcon : Int,
	@SerializedName("HasPrecipitation") val hasPrecipitation : Boolean,
	@SerializedName("PrecipitationType") val precipitationType : String,
	@SerializedName("IsDayTime") val isDayTime : Boolean,
	@SerializedName("Temperature") val temperature : Temperature,
	@SerializedName("RealFeelTemperature") val realFeelTemperature : RealFeelTemperature,
	@SerializedName("RealFeelTemperatureShade") val realFeelTemperatureShade : RealFeelTemperatureShade,
	@SerializedName("RelativeHumidity") val relativeHumidity : Int,
	@SerializedName("IndoorRelativeHumidity") val indoorRelativeHumidity : Int,
	@SerializedName("DewPoint") val dewPoint : DewPoint,
	@SerializedName("Wind") val wind : Wind,
	@SerializedName("WindGust") val windGust : WindGust,
	@SerializedName("UVIndex") val uVIndex : Int,
	@SerializedName("UVIndexText") val uVIndexText : String,
	@SerializedName("Visibility") val visibility : Visibility,
	@SerializedName("ObstructionsToVisibility") val obstructionsToVisibility : String,
	@SerializedName("CloudCover") val cloudCover : Int,
	@SerializedName("Ceiling") val ceiling : Ceiling,
	@SerializedName("Pressure") val pressure : Pressure,
	@SerializedName("PressureTendency") val pressureTendency : PressureTendency,
	@SerializedName("Past24HourTemperatureDeparture") val past24HourTemperatureDeparture : Past24HourTemperatureDeparture,
	@SerializedName("ApparentTemperature") val apparentTemperature : ApparentTemperature,
	@SerializedName("WindChillTemperature") val windChillTemperature : WindChillTemperature,
	@SerializedName("WetBulbTemperature") val wetBulbTemperature : WetBulbTemperature,
	@SerializedName("Precip1hr") val precip1hr : Precip1hr,
	@SerializedName("PrecipitationSummary") val precipitationSummary : PrecipitationSummary,
	@SerializedName("TemperatureSummary") val temperatureSummary : TemperatureSummary,
	@SerializedName("MobileLink") val mobileLink : String,
	@SerializedName("Link") val link : String
) {
	fun convertEpochTime(): String {
		val time = epochTime * 1000L
		val df = SimpleDateFormat("EEE hh:mm a", Locale.getDefault())
		return df.format(Date(time))
	}

	fun getHumidity(): String {
		return "$relativeHumidity%"
	}
}