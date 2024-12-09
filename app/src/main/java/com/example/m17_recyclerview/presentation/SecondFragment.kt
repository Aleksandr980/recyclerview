package com.example.m17_recyclerview.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.m17_recyclerview.databinding.FragmentSecondBinding
import com.example.m17_recyclerview.entity.Photo
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!
    private val args by navArgs<SecondFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        updateUi(args.photo)

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    fun updateUi(photo: Photo) {
        Glide
            .with(binding.photoView)
            .load(photo.img_src.replace("http", "https"))
            .into(binding.photo)
    }
}

