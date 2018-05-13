package co.jp.neo4jexample.controller;

import co.jp.neo4jexample.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class SampleController {

    @Autowired
    private SampleRepository repository;

    @GetMapping("/example/search/{word}")
    public ResponseEntity<List<Map<String, Object>>> search(@PathVariable String word) {
        List<Map<String, Object>> returnValue = repository.searchWord(word);
        return new ResponseEntity<>(returnValue, HttpStatus.OK);
    }
}
