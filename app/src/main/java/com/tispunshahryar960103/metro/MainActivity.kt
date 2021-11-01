package com.tispunshahryar960103.metro

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.tispunshahryar960103.metro.databinding.ActivityMainBinding
import com.tispunshahryar960103.metro.di.application.MyApplication
import com.tispunshahryar960103.metro.utils.Constants
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    @ApplicationContext
    lateinit var context: Context


    private lateinit var binding: ActivityMainBinding


    companion object {
        init {
            System.loadLibrary(Constants.NDK_LIB_NAME.str)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)



    }


    private external fun stringFromJNI(): String

    override fun onSupportNavigateUp(): Boolean {
        return super.onSupportNavigateUp()
    }
}