package com.codestation.elazkar.ui.fragments.elsabha


import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ElsabhaViewModel(
    app: Application
) : AndroidViewModel(app) {


    private val _counterList: MutableLiveData<Int> = MutableLiveData<Int>()

    val counterList: LiveData<Int> = _counterList

    private var counter = 0


    fun addNumbersInCounterList() {
        counter++
        _counterList.value = counter
    }

    fun resetCounter() {
        counter = 0
        _counterList.value = counter
    }




}