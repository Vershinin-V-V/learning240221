package com.classic117.classicproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity

private const val ARG_PERSON_ID = "id"

class ContactDetailsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater : LayoutInflater,
        container : ViewGroup?,
        savedInstanceState : Bundle?
    ): View? {
        return inflater.inflate(R.layout.contact_details_fragment, container, false)
    }

    override fun onViewCreated(view : View, savedInstanceState : Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity?)?.supportActionBar?.apply{
            setTitle(R.string.contact_details_bar)
        }
    }

    companion object {
        fun newInstance(personId : Int) = ContactDetailsFragment().apply{
            arguments = Bundle().apply{
                putSerializable(ARG_PERSON_ID, 1) //заменить на id будущего класса Person
            }
        }
    }

}