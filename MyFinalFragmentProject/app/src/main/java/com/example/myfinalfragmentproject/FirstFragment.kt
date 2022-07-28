package com.example.myfinalfragmentproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myfinalfragmentproject.databinding.FragmentFirstBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */



class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirstBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater , container , false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {

            var name = binding.etName.text.toString().trim()
            var message = binding.etMessage.text.toString().toString()

            var bundle = Bundle()
            bundle.putString("NAME" , name)
            bundle.putString("MSG" , message)

            var fragment = SecondFragment()
            fragment.arguments = bundle

            requireActivity().supportFragmentManager.beginTransaction().apply {

                replace(R.id.fragment_container , fragment)
                addToBackStack(null)
                commit()
            }
        }
    }

}