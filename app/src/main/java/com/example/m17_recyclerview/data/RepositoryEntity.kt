package com.example.m17_recyclerview.data

import com.example.m17_recyclerview.utils.Constants.Companion.API_KEY
import com.example.m17_recyclerview.utils.Constants.Companion.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import javax.inject.Inject

class RepositoryEntity @Inject constructor() {
    private  val interceptor =
        HttpLoggingInterceptor().apply {
            setLevel(HttpLoggingInterceptor.Level.BODY)
        }
    private val client = OkHttpClient.Builder().addInterceptor(interceptor).build()
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val apiSearchPhoto: ApiSearchPhoto = retrofit.create(ApiSearchPhoto::class.java)

    interface ApiSearchPhoto {
        @GET(API_KEY)
        suspend fun getPhoto(): EntityDto
    }

    suspend fun getPhotoNew(): EntityDto {
        return apiSearchPhoto.getPhoto()
    }
}