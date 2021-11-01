package com.tispunshahryar960103.metro.models

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Station(
    @SerializedName("CrossLine_ID")
    @Expose
    val CrossLine_ID: String,
    @SerializedName("LineId")
    @Expose
    val LineId: String,
    @SerializedName("OrderID")
    @Expose
    val OrderID: String,
    @SerializedName("Station_Duration")
    @Expose
    val Station_Duration: String,
    @SerializedName("Title")
    @Expose
    val Title: String,
    @SerializedName("Title_English")
    @Expose
    val Title_English: String,
    @SerializedName("addr")
    @Expose
    val addr: String,
    @SerializedName("atm")
    @Expose
    val atm: String,
    @SerializedName("bus")
    @Expose
    val bus: String,
    @SerializedName("elevator")
    @Expose
    val elevator: String,
    @SerializedName("escalator")
    @Expose
    val escalator: String,
    @SerializedName("id")
    @Expose
    val id: String,
    @SerializedName("latitude")
    @Expose
    val latitude: String,
    @SerializedName("longitude")
    @Expose
    val longitude: String,
    @SerializedName("lost")
    @Expose
    val lost: String,
    @SerializedName("parking")
    @Expose
    val parking: String,
    @SerializedName("phone")
    @Expose
    val phone: String,
    @SerializedName("taxi")
    @Expose
    val taxi: String,
    @SerializedName("ticket")
    @Expose
    val ticket: String,
    @SerializedName("water")
    @Expose
    val water: String,
):Parcelable