package com.tispunshahryar960103.metro.views

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tispunshahryar960103.metro.R
import com.tispunshahryar960103.metro.adapter.LinesAdapter
import com.tispunshahryar960103.metro.databinding.FragmentLineBinding
import com.tispunshahryar960103.metro.di.application.MyApplication
import com.tispunshahryar960103.metro.models.Line
import com.tispunshahryar960103.metro.viewModels.LineViewModel
import com.tispunshahryar960103.metro.viewModels.StationViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_line.*
import javax.inject.Inject

@AndroidEntryPoint
class LineFragment : Fragment() {

    private lateinit var binding: FragmentLineBinding

    private val lineViewModel: LineViewModel by viewModels()


    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentLineBinding.inflate(inflater, container, false)
        actionBarDrawerToggle =
            ActionBarDrawerToggle(requireActivity(),
                binding.drawer,
                binding.toolbar,
                R.string.open,
                R.string.close)
        actionBarDrawerToggle.syncState()
        actionBarDrawerToggle.isDrawerSlideAnimationEnabled=true


        lineViewModel.getLines()
        lineViewModel.mutableLiveData.observe(requireActivity(), Observer {

            Log.e("", "")
            binding.recyclerViewLine.layoutManager=LinearLayoutManager(MyApplication.appContext,RecyclerView.VERTICAL,false)
            binding.recyclerViewLine.adapter=LinesAdapter(it)


        })

        lineViewModel.mutableError.observe(requireActivity(), Observer {
            Toast.makeText(MyApplication.appContext, it, Toast.LENGTH_SHORT).show()
        })





        return binding.root
    }


}