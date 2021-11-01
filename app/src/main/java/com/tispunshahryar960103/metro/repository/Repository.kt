package com.tispunshahryar960103.metro.repository

import com.tispunshahryar960103.metro.models.Line
import com.tispunshahryar960103.metro.models.Station
import com.tispunshahryar960103.metro.webService.IService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class Repository @Inject constructor(private val iService: IService) {


    private val dispatcher = Dispatchers.IO


    suspend fun getLines(): List<Line> {

        return withContext(dispatcher) {
            iService.getLines()
        }

    }

    suspend fun getStationsByLine(lineId:Int):List<Station>{

        return withContext(dispatcher){
            iService.getStationsByLine(lineId)
        }

    }
}