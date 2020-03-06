package com.touresbalon.producto.hospedaje.entidad

import com.datastax.driver.core.LocalDate
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.cassandra.core.cql.PrimaryKeyType
import org.springframework.data.cassandra.core.mapping.Column
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn
import org.springframework.data.cassandra.core.mapping.Table
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.format.annotation.DateTimeFormat
import java.util.*

class DisponibilidadHospedaje {
    @Id
    lateinit var id: String
    lateinit var idHospedaje: ObjectId
    var disponible: Boolean = false
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    lateinit var fecha: Date
    var disponibilidad: Int = 0
    lateinit var idTipoHospedaje: ObjectId
    var valorHabitacion: Float = 0f
}