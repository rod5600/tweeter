package br.consultsis.com.br.resource;

import br.consultsis.com.br.entity.Twitter;
import br.consultsis.com.br.service.TwitterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//import sun.awt.SunHints;

@RestController
@Api(value = "API de Listagem de Tweeters")

@RequestMapping("/twitter")
public class IndexResource {
    @Autowired
    TwitterService twitterService;

    @ApiOperation(value = "Retorna a lista de Todos  os Twitters")
    @GetMapping
    public List<Twitter> listTwitter() {
        return this.twitterService.listTwitter();

    }
    @ApiOperation(value = "Retorna a lista dos top5 Numero de seguidores")
    @GetMapping("/top5")
    public List<Twitter> top5Twitter(String name) {
        return this.twitterService.topTwitter(name);

    }

    @ApiOperation(value = "Retorna a lista dos Twitters agrupados por data")
    @GetMapping("/data")
    public List<Twitter> dataTwitter(String name) {
        return this.twitterService.dataTwitter(name);

    }

    @ApiOperation(value = "Retorna a lista  total de postagens, agrupadas por hora do dia")
    @GetMapping("/totalGroup")
    public List<Twitter> totalGroupTwitter(@RequestParam String name) {
        List<Twitter> twitters = this.twitterService.groupTwitter(name);
        return twitters;

    }


 //       @ApiOperation(value = "Salva uma novo Twitter")
//    @PostMapping
//    public Twitter salvarTwitter(@RequestBody Twitter twitter) {
//        return this.twitterService.salvarTwitter(twitter);


//    }

//    @ApiOperation(value = "Edita parametros de uma Twitter existente")
//    @PutMapping(value = "/{id}")
//    public Twitter editarTwitter(@PathVariable String id, @RequestBody Twitter twitter) {
//        return this.twitterService.editarTwitter(id, twitter);

//    }

 //   @ApiOperation(value = "Deleta uma Twiiter existente pelo ID")
//    @DeleteMapping(value = "/{id}")
//    public void deletarTwitter(@PathVariable String id) {
//        this.twitterService.deletarTwitter(id);
//    }

 //   @ApiOperation(value = "Consulta uma Pizza pelo ID, se não existir ID, retorna  null")
//    @GetMapping(value = "/{id}")
//    public Twitter consultarTwitter(@PathVariable String id) {
//        return this.twitterService.consultarTwitter(id);
//    }
}
