package com.example.myapplication

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.R

class Counter : BaseObservable() {
    private var count: Int = 0

    @Bindable
    fun getCount(): Int {
        return count
    }

    fun increment() {
        count++
        notifyPropertyChanged(R.count)
    }
}