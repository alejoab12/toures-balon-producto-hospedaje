package com.touresbalon.producto.hospedaje.entidad

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import java.util.*

class TipoHospedaje {
    lateinit var id: ObjectId
    var nroPersona: Int = 0
    var orden: Int = 0
    lateinit var nombre: String
}