package com.example.hw2_android_practice.ui.fifth

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw2_android_practice.R

class FIifthFragmen : Fragment() {

    companion object {
        fun newInstance() = FIifthFragmen()
    }

    private lateinit var viewModel: FIifthViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_f_iifth, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FIifthViewModel::class.java)
        // TODO: Use the ViewModel
    }

}