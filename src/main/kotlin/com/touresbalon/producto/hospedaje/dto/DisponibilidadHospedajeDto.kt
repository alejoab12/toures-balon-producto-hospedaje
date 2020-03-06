package com.touresbalon.producto.hospedaje.dto

import com.touresbalon.producto.hospedaje.valueObject.FechaVo
import java.util.*

class DisponibilidadHospedajeDto {
    lateinit var idHospedaje: String
    var disponible: Boolean = false
    lateinit var fecha: FechaVo
    var disponibilidad: Int = 0
    lateinit var idTipoHospedaje: String
    var valorHabitacion: Float = 0f
}