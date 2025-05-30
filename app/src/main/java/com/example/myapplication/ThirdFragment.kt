package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentThirdBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class ThirdFragment : Fragment() {

    private var _binding: FragmentThirdBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond9.setOnClickListener {
            findNavController().navigate(R.id.action_ThirdFragment_to_SixthFragment)
        }
        binding.buttonSecond10.setOnClickListener {
            findNavController().navigate(R.id.action_ThirdFragment_to_SeventhFragment)
        }
        binding.buttonSecond11.setOnClickListener {
            findNavController().navigate(R.id.action_ThirdFragment_to_SecondFragment2)
        }

        binding.buttonSecond4.setOnClickListener {
            findNavController().navigate(R.id.action_ThirdFragment_to_FourthFragment)
        }
        binding.buttonSecond5.setOnClickListener {
            findNavController().navigate(R.id.action_ThirdFragment_to_FourthFragment)
        }
        binding.buttonSecond14.setOnClickListener {
            findNavController().navigate(R.id.action_ThirdFragment_to_FourthFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}