package com.android.example.boxingbuddy.ui.main


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.android.example.boxingbuddy.R
import com.android.example.boxingbuddy.databinding.WorkoutFragmentBinding

/**
 * A fragment where the user starts to workout
 */
class WorkoutFragment : Fragment() {

    private lateinit var binding: WorkoutFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.workout_fragment,
            container,
            false
        )

        binding.exerciseText.text = "Ass"
        binding.doneButton.setOnClickListener{hitButton()}
        // Inflate the layout for this fragment
        return binding.root
    }

    private fun hitButton(){
        Toast.makeText(activity, "Game has just finished. Mike is great.", Toast.LENGTH_SHORT).show()
    }

}
