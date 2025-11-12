package dev.weitzsim.cluquiz

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json


class CluquizHTTPClient {

    suspend fun makeRequest(){
        val client = HttpClient(CIO){
            //configure the client
            // install logging plugin

            install(ContentNegotiation) {
                json(Json {
                    prettyPrint = true
                    isLenient = true
                })
            }
            // install(Logging){}
        }
        val response: HttpResponse = client.get("https://ktor.io/")

        if (response.status.value in 200..299) {
            println("Successful response!")
            println(response.status)
        }

        val jsonresponse: HttpResponse = client.post("http://localhost:8080/customer") {
            contentType(ContentType.Application.Json)
//            setBody(Question(
//
//            )
        }
        println(response.bodyAsText())

        client.close()
    }

}