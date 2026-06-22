package com.example.multiplicationtable

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MultiplicationViewModel : ViewModel() {

    var table by mutableStateOf(
        "Enter a number and press generate."
    )
        private set

    fun generateTable(number: Int) {
        var result = "Multiplication Table of $number\n\n"

        for (i in 1..10) {
            result += "$number x $i = ${number * i}\n"
        }

        table = result
    }
}
