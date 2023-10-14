package org.techtales.Calculators_Onein3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.techtales.Calculators_Onein3.databinding.FragmentBmiBinding


class FragmentBmi : Fragment() {
    private var _binding: FragmentBmiBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentBmiBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.calculation.setOnClickListener {
            val weight = binding.weightInput.text.toString()
            val height = binding.heightInput.text.toString()

            if (validateInput(weight, height)) {
                val bmi = weight.toDouble() / ((height.toDouble() / 100) * (height.toDouble() / 100))
                val bmiDigit = String.format("%.2f", bmi).toDouble()
                displayResult(bmiDigit)
            }
        }
    }

    private fun displayResult(bmi: Double) {
        // Your displayResult function remains the same
    }

    private fun validateInput(weight: String?, height: String?): Boolean {
        // Your validateInput function remains the same
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }





}
