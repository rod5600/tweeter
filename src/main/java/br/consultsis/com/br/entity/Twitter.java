package br.consultsis.com.br.entity;

//import com.sun.javafx.beans.IDProperty;
//import com.sun.tools.javac.comp.Resolve;
//import com.sun.tools.javac.comp.Resolve;
//import com.sun.corba.se.spi.orb.ParserData;
//import com.sun.javafx.binding.StringFormatter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Document(collection = "tweeters")
public class Twitter {
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String createdAt;

    public void setCreatedAt(String createdAt)
    {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() {
      //  DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
       // format.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));
      //  String formatted = format.format(Integer.parseInt(createdAt));
        Date d = new Date(Long.parseLong(createdAt));
       // String formatted = format.format(Integer.parseInt(createdAt));
     SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String format1 = format.format(d);

        return format1;
    }


    private String languageCode;

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }


    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }




//    private String nome;
//    public String getNome() {
//        return nome;
//    }

 //   public void setNome(String nome) {
 //       this.nome = nome;
 //   }

 //   private double preco;
//    public double getPreco() {
//        return preco;
//    }

//    public void setPreco(double preco) {
//        this.preco = preco;
//   }



}
