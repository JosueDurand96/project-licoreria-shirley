package com.example.appbar_jefri.data.model

import com.example.appbar_jefri.vo.Resource

class DataSource {

    val generateTragosList = Resource.Success(listOf(
        Drink("https://www.recetasderechupete.com/wp-content/uploads/2020/06/Margarita.jpg", "Margarita","Con azucar, vodka y nueces"),
        Drink("https://www.recetas-argentinas.com/base/stock/Recipe/2-image/2-image_web.jpg", "Fernet", "Fernet con coca y 2 hielos"),
        Drink("https://pbs.twimg.com/media/CERSHJwXIAATqjl.jpg", "Toro", "Toro con pritty"),
        Drink("https://http2.mlstatic.com/D_NQ_NP_912053-MLA44239860586_122020-O.jpg", "Ganciat"),
        ))

}