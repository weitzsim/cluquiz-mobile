package dev.weitzsim.cluquiz

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse


class CluquizHTTPClient {

    suspend fun makeRequest(){
        val client = HttpClient(CIO)
        val response: HttpResponse = client.get("https://ktor.io/")
        println(response.status)
        client.close()
    }

}