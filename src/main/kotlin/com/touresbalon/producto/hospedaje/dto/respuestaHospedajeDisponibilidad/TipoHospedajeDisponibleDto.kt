package com.touresbalon.producto.hospedaje.dto.respuestaHospedajeDisponibilidad

import org.bson.types.ObjectId
import java.util.*

class TipoHospedajeDisponibleDto {
    lateinit var idTipoHospedaje: String
    lateinit var nombre: String
    lateinit var fechaTipoHospedajeDisponibleDto: List<FechaTipoHospedajeDisponibleDto>
}