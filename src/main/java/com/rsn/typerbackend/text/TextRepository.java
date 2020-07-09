package com.rsn.typerbackend.text;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TextRepository extends JpaRepository<Text, Long> {

    @Query(value = "SELECT * FROM text t WHERE t.language_code = :language_code ORDER BY RAND() LIMIT 1",
            nativeQuery = true)
    Text getRandomText(@Param("language_code") String languageCode);
}
