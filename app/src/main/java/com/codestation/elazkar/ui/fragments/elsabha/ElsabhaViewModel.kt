package com.codestation.elazkar.ui.fragments.elsabha


import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ElsabhaViewModel(
    app: Application
) : AndroidViewModel(app) {


    //1- counter mutable liveData
    private val _counterList: MutableLiveData<Int> = MutableLiveData<Int>()

    //2- counter LiveData
    val counterList: LiveData<Int> = _counterList

    private var counter = 0


    //add data in mutable LiveData
    fun addNumbersInCounterList() {
        counter++
        _counterList.value = counter
    }

    fun resetCounter() {
        counter = 0
        _counterList.value = counter
    }




}