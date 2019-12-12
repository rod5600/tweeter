package br.consultsis.com.br.service;
import br.consultsis.com.br.entity.Twitter;
import br.consultsis.com.br.repository.TwitterRepository;
import org.apache.tomcat.jni.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TwitterService {
    @Autowired
    TwitterRepository twitterRepository;

    public List<Twitter> listTwitter(){

       return  twitterRepository.findAll();
    }

    public List<Twitter> topTwitter(String name){

        return  twitterRepository.findTop5UserFollowersCountByUserNameLikeOrderByUserFollowersCountDesc(name);
    }
    public List<Twitter> groupTwitter(String createdAt){

        return  twitterRepository.findByLanguageCodeLike(createdAt);
    }

    public List<Twitter> dataTwitter(String languageCode){

        return  twitterRepository.findByLanguageCodeLike(languageCode);
    }


//    public Twitter salvarTwitter(Twitter twitterAdd) {

 //       return twitterRepository.save(twitterAdd);
    }
 //   public Twitter editarTwitter(String id, Twitter twitter) {

//     Twitter twitterid = TwitterRepository.findById(id).orElse(null);


//        BeanUtils.copyProperties(twitter, twitterid, "id");

//         twitterRepository.save(twitterid);

//         return (twitter);

 //   }

//   public void deletarTwitter(String id) {
 //       twitterRepository.deleteById(id);
//   }
//public Twitter consultarTwitter(String id) {
//     return twitterRepository.findById(id).orElse(null);
//    }

//}
















































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































