package com.tispunshahryar960103.metro.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.tispunshahryar960103.metro.R
import com.tispunshahryar960103.metro.databinding.RowStationBinding
import com.tispunshahryar960103.metro.models.Station

class StationAdapter(val stationList: List<Station>) :
    RecyclerView.Adapter<StationAdapter.StationVH>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StationVH {

        val binding: RowStationBinding =
            DataBindingUtil.inflate(LayoutInflater.from(parent.context),
                R.layout.row_station,
                parent,
                false)
        return StationVH(binding)


    }

    override fun onBindViewHolder(holder: StationVH, position: Int) {

        val station:Station=stationList[position]
        holder.binding.station=station

        val bundle=Bundle()
        bundle.putParcelable("station",station)
        holder.binding.relStation.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(it).navigate(R.id.stationDetailsFragment,bundle)
        })

        when(station.LineId){
            "1"->{holder.binding.relStation.setBackgroundResource(R.color.Red)}
            "2"->{holder.binding.relStation.setBackgroundResource(R.color.Blue)}
            "3"->{holder.binding.relStation.setBackgroundResource(R.color.LowBlue)}
            "4"->{holder.binding.relStation.setBackgroundResource(R.color.Yellow)}
            "5"->{holder.binding.relStation.setBackgroundResource(R.color.Purple)}
            "7"->{holder.binding.relStation.setBackgroundResource(R.color.Green)}
        }

    }

    override fun getItemCount(): Int {
        return stationList.size
    }


    class StationVH(val binding: RowStationBinding) : RecyclerView.ViewHolder(binding.root)


}