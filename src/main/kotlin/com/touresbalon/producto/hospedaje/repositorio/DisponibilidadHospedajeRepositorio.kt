package com.touresbalon.producto.hospedaje.repositorio

import com.datastax.driver.core.LocalDate
import com.touresbalon.producto.hospedaje.entidad.DisponibilidadHospedaje
import org.bson.types.ObjectId
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.data.cassandra.repository.Query
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface DisponibilidadHospedajeRepositorio: MongoRepository<DisponibilidadHospedaje, String> {

    //@Query("SELECT  * FROM disponibilidad_hospedaje WHERE id_tipo_hospedaje = :idTipoHospedaje AND fecha = :fecha AND disponible = true")
    fun findByIdTipoHospedajeAndFecha(idTipoHospedaje: ObjectId, fecha: Date): List<DisponibilidadHospedaje>

}