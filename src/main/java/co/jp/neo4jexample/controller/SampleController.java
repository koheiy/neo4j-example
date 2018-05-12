package co.jp.neo4jexample.controller;

import co.jp.neo4jexample.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SampleController {

    @Autowired
    private SampleRepository repository;

    @GetMapping("/example/search/{word}")
    public String search(@PathVariable() String word) {
        Map<String, Object> map = repository.searchWord(word);
        System.out.println(repository.searchWord(word));
        return "";
    }
}
