package com.franlops.stores

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.franlops.stores.databinding.ItemStoreBinding

class StoreAdapter {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val binding = ItemStoreBinding.bind(view)
    }
}