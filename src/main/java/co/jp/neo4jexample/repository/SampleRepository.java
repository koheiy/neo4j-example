package co.jp.neo4jexample.repository;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface SampleRepository extends Neo4jRepository<String, Long> {
    @Query("match (t:Tweet{tweet:{word}}) return t")
    Map<String, Object> searchWord(@Param("word") String word);
}
