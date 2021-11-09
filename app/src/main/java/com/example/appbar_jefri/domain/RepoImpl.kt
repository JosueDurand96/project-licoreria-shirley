package com.example.appbar_jefri.domain

import com.example.appbar_jefri.data.model.DataSource
import com.example.appbar_jefri.data.model.Drink
import com.example.appbar_jefri.vo.Resource

class RepoImpl(private val dataSource: DataSource): Repo {

    override fun getTragosList(): Resource<List<Drink>> {
        return dataSource.generateTragosList

    }
}