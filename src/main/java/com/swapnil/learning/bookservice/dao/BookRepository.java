package com.swapnil.learning.bookservice.dao;

import com.swapnil.learning.bookservice.model.Books;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Books,Integer> {
}
