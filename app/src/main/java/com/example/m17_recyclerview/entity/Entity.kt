package com.example.m17_recyclerview.entity

import com.example.m17_recyclerview.data.EntityDto
import com.example.m17_recyclerview.data.RepositoryEntity
import javax.inject.Inject

interface Entity {
    val photos: List<Photo>
}