package com.tispunshahryar960103.metro.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tispunshahryar960103.metro.models.Line
import com.tispunshahryar960103.metro.models.Station
import com.tispunshahryar960103.metro.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class StationViewModel @Inject constructor(private val repository: Repository) : ViewModel() {


    lateinit var job: Job


    var mutableLiveData = MutableLiveData<List<Station>>()
    val mutableError = MutableLiveData<String>()

    fun getStations(lineId: Int) {

        job = viewModelScope.launch {

            try {

                val stationList = repository.getStationsByLine(lineId)
                mutableLiveData.value = stationList
            } catch (e: Exception) {
                mutableError.value = e.toString()
            }


        }


    }
}