package com.tispunshahryar960103.metro.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tispunshahryar960103.metro.R
import com.tispunshahryar960103.metro.databinding.FragmentMetroGraphBinding


class MetroGraphFragment : Fragment() {

    lateinit var binding:FragmentMetroGraphBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentMetroGraphBinding.inflate(inflater,container,false)
        return binding.root
    }


}