package com.tispunshahryar960103.metro.views

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.tispunshahryar960103.metro.R
import com.tispunshahryar960103.metro.databinding.FragmentStationDetailsBinding
import com.tispunshahryar960103.metro.models.Station


class StationDetailsFragment : Fragment() {

    lateinit var binding:FragmentStationDetailsBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentStationDetailsBinding.inflate(inflater,container,false)

        val station: Station? =arguments?.getParcelable("station")
        binding.station=station
        Log.e("", "" )
        binding.imgBack.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(it).navigate(R.id.stationFragment)
        })


        return binding.root
    }

}