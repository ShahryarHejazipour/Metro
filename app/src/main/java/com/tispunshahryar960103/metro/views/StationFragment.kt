package com.tispunshahryar960103.metro.views

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tispunshahryar960103.metro.R
import com.tispunshahryar960103.metro.adapter.StationAdapter
import com.tispunshahryar960103.metro.databinding.FragmentStationBinding
import com.tispunshahryar960103.metro.models.Line
import com.tispunshahryar960103.metro.viewModels.StationViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StationFragment : Fragment() {

    lateinit var binding:FragmentStationBinding

    private val stationViewModel: StationViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentStationBinding.inflate(inflater,container,false)

        binding.imgBack.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(it).navigate(R.id.lineFragment)
        })

        val line: Line? = arguments?.getParcelable("line")
        val lineId=line?.id
        binding.line=line

        if (lineId != null) {
            stationViewModel.getStations(lineId.toInt())
        }
        stationViewModel.mutableLiveData.observe(requireActivity(), Observer {

            Log.e("", "" )

            binding.recyclerViewStation.adapter=StationAdapter(it)
            binding.recyclerViewStation.layoutManager=LinearLayoutManager(requireActivity(),RecyclerView.VERTICAL,false)




        })



        return binding.root
    }


}