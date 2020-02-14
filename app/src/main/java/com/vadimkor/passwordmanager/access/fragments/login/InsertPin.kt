package com.vadimkor.passwordmanager.access.fragments.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.vadimkor.passwordmanager.R

class InsertPin : Fragment() {

    companion object {
        fun newInstance() = InsertPin()
    }

    private lateinit var viewModel: InsertPinViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.insert_pin_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InsertPinViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
