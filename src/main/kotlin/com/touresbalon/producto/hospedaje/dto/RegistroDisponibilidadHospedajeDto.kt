package com.touresbalon.producto.hospedaje.dto




class RegistroDisponibilidadHospedajeDto {
    lateinit var idHospedaje: String
    var disponible: Boolean = false
    lateinit var fecha: String
    var disponibilidad: Int = 0
    lateinit var idTipoHospedaje: String
    var valorHabitacion: Float = 0f
}