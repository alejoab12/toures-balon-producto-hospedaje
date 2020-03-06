package com.touresbalon.producto.hospedaje.entidad

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import java.util.*

class Hospedaje {
    @Id
    lateinit var id: ObjectId
    @Indexed
    lateinit var idCiudad: String
    var estrellas: Int = 0
    lateinit var nombre: String
    lateinit var tipoHospedaje: List<TipoHospedaje>
}