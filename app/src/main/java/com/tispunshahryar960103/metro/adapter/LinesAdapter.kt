package com.tispunshahryar960103.metro.adapter

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.tispunshahryar960103.metro.R
import com.tispunshahryar960103.metro.databinding.RowLineBinding
import com.tispunshahryar960103.metro.di.application.MyApplication
import com.tispunshahryar960103.metro.models.Line

class LinesAdapter(private val linesList: List<Line>) :
    RecyclerView.Adapter<LinesAdapter.LinesVH>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinesVH {

        val binding: RowLineBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),
            R.layout.row_line,
            parent,
            false)

        return LinesVH(binding)

    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: LinesVH, position: Int) {

        val line: Line = linesList[position]
        holder.binding.line = line

        when (line.id) {

            "1" -> {
                holder.binding.relLine.setBackgroundResource(R.color.Red)

            }
            "2" -> {
                holder.binding.relLine.setBackgroundResource(R.color.Blue)

            }
            "3" -> {
                holder.binding.relLine.setBackgroundResource(R.color.LowBlue)

            }
            "4" -> {
                holder.binding.relLine.setBackgroundResource(R.color.Yellow)

            }
            "5" -> {
                holder.binding.relLine.setBackgroundResource(R.color.Purple)

            }
            "7" -> {
                holder.binding.relLine.setBackgroundResource(R.color.Green)

            }

        }

        holder.binding.cardLine.setOnClickListener(View.OnClickListener {
            val bundle = Bundle()
            // bundle.putString("id",line.id)
            bundle.putParcelable("line", line)
            Navigation.findNavController(it).navigate(R.id.stationFragment, bundle)



        })

    }



    override fun getItemCount(): Int {
        return linesList.size
    }


    class LinesVH(val binding: RowLineBinding) : RecyclerView.ViewHolder(binding.root)

}