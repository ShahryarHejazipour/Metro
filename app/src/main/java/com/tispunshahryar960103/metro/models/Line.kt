package com.tispunshahryar960103.metro.models

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Line(
    @SerializedName("EnglishTitle")
    @Expose
    val EnglishTitle: String,
    @SerializedName("id")
    @Expose
    val id: String,
    @SerializedName("title")
    @Expose
    val title: String
):Parcelable