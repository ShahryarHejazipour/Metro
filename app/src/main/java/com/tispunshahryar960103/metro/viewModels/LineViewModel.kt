package com.tispunshahryar960103.metro.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tispunshahryar960103.metro.models.Line
import com.tispunshahryar960103.metro.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LineViewModel @Inject constructor(private val repository: Repository) : ViewModel() {


    lateinit var job: Job


    var mutableLiveData = MutableLiveData<List<Line>>()
    val mutableError = MutableLiveData<String>()

    fun getLines() {

        job = viewModelScope.launch {

            try {

                val linesList = repository.getLines()
                mutableLiveData.value = linesList
            } catch (e: Exception) {
                mutableError.value = e.toString()
            }


        }

    }


    override fun onCleared() {
        super.onCleared()
        if (::job.isInitialized) job.cancel()
    }


}