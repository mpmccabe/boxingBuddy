package com.android.example.boxingbuddy.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.android.example.boxingbuddy.R
import com.android.example.boxingbuddy.databinding.TitleFragmentBinding

class TitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate layout for fragment
        val binding: TitleFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.title_fragment, container, false
        )

//      TODO Implement safe args
        binding.playButton.setOnClickListener{
            findNavController().navigate(R.id.action_title_destination_to_workoutFragment)
        }

        return binding.root
    }
}
