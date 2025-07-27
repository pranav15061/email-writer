package com.example.email_writer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "*")
public class EmailGeneratorController {

    @Autowired
    private EmailGeneratorService emailGeneratorService;


    @GetMapping
    public ResponseEntity<String> Hello() {
        return ResponseEntity.ok("Hello World");
    }

    @PostMapping("/generate")
    public ResponseEntity<String>generateEmail(@RequestBody EmailRequest emailRequest)
    {
        String response = emailGeneratorService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }
}
