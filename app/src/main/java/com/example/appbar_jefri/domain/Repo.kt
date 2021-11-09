package com.example.appbar_jefri.domain

import com.example.appbar_jefri.data.model.Drink
import com.example.appbar_jefri.vo.Resource

interface Repo {
    fun  getTragosList(): Resource<List<Drink>>
}