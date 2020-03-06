package com.touresbalon.producto.hospedaje.repositorio

import com.touresbalon.producto.hospedaje.entidad.Hospedaje
import org.springframework.data.mongodb.repository.MongoRepository

interface HospedajeRepositorio : MongoRepository<Hospedaje, String> {

    fun findByIdCiudad(idCiudad: String): List<Hospedaje>

}