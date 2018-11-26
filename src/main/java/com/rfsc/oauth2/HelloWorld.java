package com.rfsc.oauth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorld {

  @GetMapping(value = "/api/hello")
  public Map<String, String> hello() {
    HashMap<String, String> result = new HashMap<>();
    result.put("Hola", "Mundo");
    return result;
  }

  @GetMapping(value = "/anon")
  public Map<String, String> anon() {
    HashMap<String, String> result = new HashMap<>();
    result.put("Hola", "Anon");
    return result;
  }


}
