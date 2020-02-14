package com.vadimkor.passwordmanager.access.fragments.add_pin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.vadimkor.passwordmanager.R

class AddPinCode : Fragment() {

    companion object {
        fun newInstance() =
            AddPinCode()
    }

    private lateinit var viewModel: AddPinCodeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_pin_code_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddPinCodeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
