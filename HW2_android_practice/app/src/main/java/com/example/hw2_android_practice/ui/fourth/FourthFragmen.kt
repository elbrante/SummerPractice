package com.example.hw2_android_practice.ui.fourth

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw2_android_practice.R

class FourthFragmen : Fragment() {

    companion object {
        fun newInstance() = FourthFragmen()
    }

    private lateinit var viewModel: FourthViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fourth, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FourthViewModel::class.java)
        // TODO: Use the ViewModel
    }

}