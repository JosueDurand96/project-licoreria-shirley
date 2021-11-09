package com.example.appbar_jefri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.appbar_jefri.data.model.DataSource
import com.example.appbar_jefri.domain.RepoImpl
import com.example.appbar_jefri.presentation.MainViewModel
import com.example.appbar_jefri.domain.viewmodel.VMFactory

class   MainActivity : AppCompatActivity() {


    private lateinit var navcContoller:NavController

    private val viewModel by viewModels<MainViewModel> { VMFactory(RepoImpl(DataSource())) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navcContoller = findNavController(R.id.nav_host_fragment)
        NavigationUI.setupActionBarWithNavController(this, navcContoller)
        }

    override fun onSupportNavigateUp(): Boolean {
        return navcContoller.navigateUp()
    }
}
