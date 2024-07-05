package com.giuliano.gps.Controller;

import com.giuliano.gps.model.Coordenada;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class CoordenadaController {
    @MessageMapping("/taxi")
    @SendTo("/taxi/coordenada")
    public Coordenada envio (Coordenada coordenada){
        return coordenada;
    }
}
