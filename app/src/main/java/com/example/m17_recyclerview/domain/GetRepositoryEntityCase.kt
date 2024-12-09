package com.example.m17_recyclerview.domain

import com.example.m17_recyclerview.data.EntityDto
import com.example.m17_recyclerview.data.RepositoryEntity
import javax.inject.Inject

class GetRepositoryEntityCase @Inject constructor(private val repositoryEntity: RepositoryEntity) {
    suspend fun execute(): EntityDto {
        val getExecute = repositoryEntity.getPhotoNew()
        return getExecute
    }

}