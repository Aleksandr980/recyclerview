package com.example.m17_recyclerview.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.m17_recyclerview.data.EntityDto
import com.example.m17_recyclerview.domain.GetRepositoryEntityCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val getRepositoryEntityCase: GetRepositoryEntityCase) :
    ViewModel() {
    private val _listPhoto = MutableStateFlow(EntityDto(emptyList()))
    val listPhoto = _listPhoto.asStateFlow()

    init {
        loadPhotos()
    }
    fun loadPhotos() {
        viewModelScope.launch(Dispatchers.IO) {
            kotlin.runCatching {
                getRepositoryEntityCase.execute()
            }.fold(
                onSuccess = { _listPhoto.value = it },
                onFailure = { Log.d("MainViewModel", it.message?:"")}
            )
        }
    }
}
