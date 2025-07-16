package com.example.navigationguide

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("/api/MostrarClases")
    suspend fun cargarClases(): Response<ClasesResponse>

    @GET("/api/buscarClases")
    suspend fun buscarClases(@Query("texto") texto: String): Response<ClasesResponse>

    @GET("/api/MostrarListaAsistencia/{id}/{fecha}")
    suspend fun mostrarListaAsistencia(
        @Path("id") id: Int,
        @Path("fecha") fecha: String
    ): Response<ListaResponse>
}
