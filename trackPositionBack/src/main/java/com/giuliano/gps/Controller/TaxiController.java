package com.giuliano.gps.Controller;

import com.giuliano.gps.model.Coordenada;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/taxiapp")
public class TaxiController {

    private final SimpMessagingTemplate template;

    public TaxiController(SimpMessagingTemplate template) {
        this.template = template;
    }

    @PostMapping("/send-coordenada")
    public void sendCoordenada(@RequestBody Coordenada coordenada){
        this.template.convertAndSend("/taxi/coordenada", coordenada);
    }
}
