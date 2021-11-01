package com.tispunshahryar960103.metro.webService

import com.tispunshahryar960103.metro.models.Line
import com.tispunshahryar960103.metro.models.Station
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface IService {

    @GET("getLines.php")
    suspend fun getLines():List<Line>

    @POST("getStations.php")
    @FormUrlEncoded
    suspend fun getStationsByLine(@Field("id") lineId:Int):List<Station>




}