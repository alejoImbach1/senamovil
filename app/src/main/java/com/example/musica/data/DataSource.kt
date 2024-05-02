package com.example.musica.data

import com.example.musica.model.Album

class DataSource {
    fun getAlbmes(): MutableList<Album>{
        var  albumes:MutableList<Album> = mutableListOf()
        albumes.add(Album("caver","2003","https://images.pexels.com/photos/19871842/pexels-photo-19871842/free-photo-of-tecnologia-negocio-maquina-equipo.jpeg"))

       /* albumes.add(Album("caver","2003","https://www.educaciontrespuntocero.com/wp-content/uploads/2020/04/mejores-bancos-de-imagenes-gratis.jpg"))
        albumes.add(Album("caver","2003","https://www.educaciontrespuntocero.com/wp-content/uploads/2020/04/mejores-bancos-de-imagenes-gratis.jpg"))
        albumes.add(Album("caver","2003","https://www.educaciontrespuntocero.com/wp-content/uploads/2020/04/mejores-bancos-de-imagenes-gratis.jpg"))
        albumes.add(Album("caver","2003","https://www.educaciontrespuntocero.com/wp-content/uploads/2020/04/mejores-bancos-de-imagenes-gratis.jpg"))
        albumes.add(Album("caver","2003","https://www.educaciontrespuntocero.com/wp-content/uploads/2020/04/mejores-bancos-de-imagenes-gratis.jpg"))*/
        return albumes
    }
}