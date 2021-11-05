package com.tispunshahryar960103.metro.views


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.tispunshahryar960103.metro.BuildConfig
import com.tispunshahryar960103.metro.R
import com.tispunshahryar960103.metro.databinding.FragmentStationDetailsBinding
import com.tispunshahryar960103.metro.models.Line
import com.tispunshahryar960103.metro.models.Station
import com.tispunshahryar960103.metro.utils.AppConfig
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class StationDetailsFragment : Fragment() {

    lateinit var binding: FragmentStationDetailsBinding

    @Inject
    lateinit var appConfig: AppConfig


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStationDetailsBinding.inflate(inflater, container, false)

        val station: Station? = arguments?.getParcelable("station")
        /*val line:Line?=arguments?.getParcelable("line")
        binding.line=line*/
        binding.station = station
        binding.appConfig=appConfig


        when (station?.LineId) {


            "1" -> {
                binding.linearFeatures.setBackgroundColor(resources.getColor(R.color.Red))
                binding.linearStation.setBackgroundColor(resources.getColor(R.color.Red))
            }
            "2" -> {
                binding.linearFeatures.setBackgroundColor(resources.getColor(R.color.Blue))
                binding.linearStation.setBackgroundColor(resources.getColor(R.color.Blue))
            }
            "3" -> {
                binding.linearFeatures.setBackgroundColor(resources.getColor(R.color.LowBlue))
                binding.linearStation.setBackgroundColor(resources.getColor(R.color.LowBlue))
            }
            "4" -> {
                binding.linearFeatures.setBackgroundColor(resources.getColor(R.color.Yellow))
                binding.linearStation.setBackgroundColor(resources.getColor(R.color.Yellow))
            }
            "5" -> {
                binding.linearFeatures.setBackgroundColor(resources.getColor(R.color.Purple))
                binding.linearStation.setBackgroundColor(resources.getColor(R.color.Purple))
            }
            "7" -> {
                binding.linearFeatures.setBackgroundColor(resources.getColor(R.color.Green))
                binding.linearStation.setBackgroundColor(resources.getColor(R.color.Green))
            }


        }

        if (station?.atm == "0") {
            binding.imgAtm.setColorFilter(R.color.WhiteDark)
            binding.txtAtm.setTextColor(resources.getColor(R.color.WhiteDark))

        }
        if (station?.bus == "0") {
            binding.imgBus.setColorFilter(R.color.WhiteDark)
            binding.txtBusStation.setTextColor(resources.getColor(R.color.WhiteDark))
        }
        if (station?.water == "0") {
            binding.imgWater.setColorFilter(R.color.WhiteDark)
            binding.txtWater.setTextColor(resources.getColor(R.color.WhiteDark))
        }
        if (station?.taxi == "0") {
            binding.imgTaxi.setColorFilter(R.color.WhiteDark)
            binding.txtTaxi.setTextColor(resources.getColor(R.color.WhiteDark))
        }
        if (station?.elevator == "0") {
            binding.imgElevator.setColorFilter(R.color.WhiteDark)
            binding.txtElevator.setTextColor(resources.getColor(R.color.WhiteDark))
        }
        if (station?.escalator == "0") {
            binding.imgEscalator.setColorFilter(R.color.WhiteDark)
            binding.txtEscalator.setTextColor(resources.getColor(R.color.WhiteDark))
        }
        if (station?.parking == "0") {
            binding.imgParking.setColorFilter(R.color.WhiteDark)
            binding.txtParking.setTextColor(resources.getColor(R.color.WhiteDark))

        }
        if (station?.phone == "0") {
            binding.imgPhone.setColorFilter(R.color.WhiteDark)
            binding.txtPhone.setTextColor(resources.getColor(R.color.WhiteDark))
        }
        if (station?.lost == "0") {
            binding.imgLost.setColorFilter(R.color.WhiteDark)
            binding.txtLost.setTextColor(resources.getColor(R.color.WhiteDark))
        }


        binding.imgBack.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(it).navigate(R.id.lineFragment)

        })


        return binding.root
    }

}