package com.kafka.DataReceiver.Controller;

import com.kafka.DataReceiver.Entity.DataClass;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/Data")
public class DataController {
@PostMapping("/receive")
    public DataClass getdata(@RequestBody DataClass dataobj){

    return dataobj;
}
}
