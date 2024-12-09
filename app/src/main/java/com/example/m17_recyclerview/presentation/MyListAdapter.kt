package com.example.m17_recyclerview.presentation

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.m17_recyclerview.databinding.MyListphotoBinding
import com.example.m17_recyclerview.entity.Photo

class MyListAdapter(
    val onClickPhoto: (Photo) -> Unit,
) : ListAdapter<Photo, MyListAdapter.MyViewHolder>(DiffUtilCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            MyListphotoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = getItem(position)
        holder.binding.rover.text = "Rover: ${item?.rover?.name}"
        holder.binding.camera.text = "Camera: ${item?.camera?.full_name}"
        holder.binding.sol.text = "Sol: ${item?.sol}"
        holder.binding.date.text = "Data: ${item?.earth_date}"
        Glide
            .with(holder.binding.image)
            .load(item.img_src.replace("http", "https"))
            .into(holder.binding.image)

        holder.binding.root.setOnClickListener {
            onClickPhoto(item)
            Toast.makeText(it.context, "Clicked item: $item", Toast.LENGTH_SHORT).show()
        }
    }

    class DiffUtilCallback : DiffUtil.ItemCallback<Photo>() {
        override fun areItemsTheSame(oldItem: Photo, newItem: Photo): Boolean =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Photo, newItem: Photo): Boolean =
            oldItem == newItem
    }

    class MyViewHolder(val binding: MyListphotoBinding) : RecyclerView.ViewHolder(binding.root)
}


