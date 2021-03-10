package com.classic117.classicproject

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.classic117.classicproject.databinding.FragmentContactListBinding


class ContactListFragment : Fragment(R.layout.fragment_contact_list) {
    private var binding : FragmentContactListBinding? = null
    private var cardClicListener : PersonSelect? = null

    override fun onAttach(context : Context) {
        super.onAttach(context)

        if (context is PersonSelect) cardClicListener = context
    }

    override fun onViewCreated(view : View, savedInstanceState : Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentContactListBinding.bind(view).apply {
            personCard.root.setOnClickListener {
                cardClicListener?.onPersonSelected(1)//заменить на id будущего класса Person
            }
        }

        (activity as AppCompatActivity?)?.supportActionBar?.apply {
            setTitle(R.string.contact_list_bar)
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }

    override fun onDetach() {
        cardClicListener = null
        super.onDetach()
    }
}