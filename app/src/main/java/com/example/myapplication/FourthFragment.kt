package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentFourthBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class FourthFragment : Fragment() {

    private var _binding: FragmentFourthBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFourthBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond16.setOnClickListener {
            findNavController().navigate(R.id.action_FourthFragment_to_SecondFragment)
        }
        binding.buttonSecond15.setOnClickListener {
            findNavController().navigate(R.id.action_FourthFragment_to_SixthFragment)
        }
        binding.buttonSecond17.setOnClickListener {
            findNavController().navigate(R.id.action_FourthFragment_to_FifthFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}