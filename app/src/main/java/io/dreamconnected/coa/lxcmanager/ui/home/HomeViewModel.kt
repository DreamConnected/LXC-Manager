package io.dreamconnected.coa.lxcmanager.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.dreamconnected.coa.lxcmanager.util.ShellClient

class HomeViewModel : ViewModel() {
    var shellClient = ShellClient.instance ?: throw IllegalStateException("ShellClient not initialized")

    private val _text = MutableLiveData<String>().apply {
        val currentText = StringBuilder()
    }
    val text: LiveData<String> = _text
}