package com.nahroto.simpleandroid.sample.simplefragment

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.nahroto.simpleandroid.SimpleFragment

class MainMenuFragment : SimpleFragment() {

    override val layoutResource = R.layout.fragment_mainmenu

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        startBtn.setOnClickListener {
            Toast.makeText(context, "Hello World", Toast.LENGTH_LONG).show()
        }
    }
}