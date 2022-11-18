package com.plcoding.plugins

import com.plcoding.room.RoomController
import com.plcoding.routes.chatSocket
import com.plcoding.routes.getAllMessages
import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    install(Routing) {
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
