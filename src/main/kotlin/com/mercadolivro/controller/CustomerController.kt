package com.mercadolivro.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.swing.text.html.HTML

@RestController
class CustomerController {

    @GetMapping
    fun helloWorld(): HTML {
        return 
    }
}