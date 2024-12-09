package com.example.m17_recyclerview.entity

import android.graphics.Camera
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Rover(
    @SerializedName("cameras")
    val cameras: List<CameraX>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("landing_date")
    val landing_date: String,
    @SerializedName("launch_date")
    val launch_date: String,
    @SerializedName("max_date")
    val max_date: String,
    @SerializedName("max_sol")
    val max_sol: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("total_photos")
    val total_photos: Int
) : Parcelable