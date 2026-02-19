package com.in.cafe.rest;


import com.in.cafe.POJO.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping(path="/category")
public interface CategoryRest {

    @PostMapping(path="/addCategory")
    ResponseEntity<String> addNewCategory(@RequestBody(required = true)Map<String, String> requestMap);

    @GetMapping(path="/getCategory")
    ResponseEntity<List<Category>> getAllCategory(@RequestParam(required = false) String filterValue);

    @PostMapping(path = "/updateCategory")
    ResponseEntity<String> updateCategory(@RequestBody(required = true) Map<String, String> requestMap);
}
