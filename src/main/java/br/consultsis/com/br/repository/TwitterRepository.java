package br.consultsis.com.br.repository;
import br.consultsis.com.br.entity.Twitter;
import br.consultsis.com.br.entity.User;
import com.mongodb.BasicDBObject;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public  interface TwitterRepository extends MongoRepository<Twitter, String> {
 //@Query(value = "{ 'user' : ?0, 'name' : ?1 }", fields = "{ 'user.name' : 1 }")

 //List<Twitter> findFirst10ByUserFollowersCount(int followersCount );


 List<Twitter> findTop5UserFollowersCountByUserNameLikeOrderByUserFollowersCountDesc(String name);
 //{
  //  public List<StudentResults> findStudentsGroupByFirstName() {
 // TypedAggregation<Twitter> twiiterAggregation = Aggregation.newAggregation(User.class,
 //         Aggregation.group("firstName").
 //                 push(new BasicDBObject
  //                        ("_id", "$_id").append
 //                         ("firstName", "$firstName").append
 //                         ("lastName", "$lastName")).as("students"));
 //}

// List<Twitter>  findByTop10LanguageCodeLike(String languageCode);

 List<Twitter> findByLanguageCodeLike(String languageCode);




}


