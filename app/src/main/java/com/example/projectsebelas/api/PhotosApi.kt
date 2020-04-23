package com.example.projectsebelas.api

import com.example.projectsebelas.model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List <Photo>>
}