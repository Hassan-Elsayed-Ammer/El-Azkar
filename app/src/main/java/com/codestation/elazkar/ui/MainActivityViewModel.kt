package com.codestation.elazkar.ui


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {


    //1- counter mutable liveData
    private val _counterList: MutableLiveData<Int> = MutableLiveData<Int>()

    //2- counter LiveData
    val counterList: LiveData<Int> = _counterList

    var counter = 0


    //add data in mutable LiveData
    fun addNumbersInCounterList() {
        counter++
        _counterList.value = counter
    }


    // observer from live data

    // sigin table live data to live data
}