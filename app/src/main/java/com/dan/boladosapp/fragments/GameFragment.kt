package com.dan.boladosapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dan.boladosapp.R
import com.dan.boladosapp.databinding.FragmentGameBinding

class GameFragment : Fragment() {

    private var _binding: FragmentGameBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = arguments?.getString("name")

        binding.tvName.text = name

        if(true){  //Gano
            binding.btnLaunch.setOnClickListener {
                findNavController().navigate(R.id.action_gameFragment_to_winFragment)
            }
        }else{ //Perdio
            binding.btnLaunch.setOnClickListener {
                findNavController().navigate(R.id.action_gameFragment_to_loseFragment)
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}