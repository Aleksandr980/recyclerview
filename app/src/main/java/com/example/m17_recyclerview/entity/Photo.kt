package com.example.m17_recyclerview.entity

import android.graphics.Camera
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@kotlinx.parcelize.Parcelize
data class Photo(
    @SerializedName("camera")
    val camera: com.example.m17_recyclerview.entity.Camera,
    @SerializedName("earth_date")
    val earth_date: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("img_src")
    val img_src: String,
    @SerializedName("rover")
    val rover: Rover,
    @SerializedName("sol")
    val sol: Int
) : Parcelable
