package com.example.m17_recyclerview.entity

import android.os.Parcelable
import com.example.m17_recyclerview.data.EntityDto
import com.example.m17_recyclerview.data.RepositoryEntity
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import javax.inject.Inject

@Parcelize
data class CameraX(
    @SerializedName("full_name")
    val full_name: String
) : Parcelable