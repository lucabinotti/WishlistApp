package com.example.wishlistapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val STRING_LIST = "stringList"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ContentFragment : Fragment() {

    private var stringList: ArrayList<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            stringList = it.getStringArrayList(STRING_LIST)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the ListView by its ID in the fragment layout
        val listView = view.findViewById<ListView>(R.id.listView)

        // Set up an ArrayAdapter to populate the ListView
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, stringList ?: arrayListOf())
        listView.adapter = adapter
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         */
        @JvmStatic
        fun newInstance(stringList: ArrayList<String>) =
            ContentFragment().apply {
                arguments = Bundle().apply {
                    putStringArrayList(STRING_LIST, stringList)
                }
            }
    }
}