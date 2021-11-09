package com.example.appbar_jefri

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appbar_jefri.data.model.DataSource
import com.example.appbar_jefri.domain.RepoImpl
import com.example.appbar_jefri.presentation.MainViewModel
import com.example.appbar_jefri.domain.viewmodel.VMFactory

class MainFragment : Fragment() {

    class rv_tragos

    private val viewModel by viewModels<MainViewModel> { VMFactory(RepoImpl(DataSource())) }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }


    private fun setupRecyclerView() {
        rv_tragos.layoutManager = LinearLayoutManager(requireContext())
        rv_tragos.addItemDecoration(
            DividerItemDecoration(
                requireContext(),
                DividerItemDecoration.VERTICAL
            )
        )
    }


}