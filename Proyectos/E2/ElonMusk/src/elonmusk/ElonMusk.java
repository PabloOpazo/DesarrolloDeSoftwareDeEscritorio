package elonmusk;

import java.util.Date;

public class ElonMusk {

    public static void main(String[] args) {
        
        Date FEXA = new Date();
                
        Instagram historia1 = new Instagram(001, "hola jeje", true, "Trolencio 911", "trolencio911");
        Twitter noticia1 = new Twitter(001, "omg me estoy quemando", FEXA, "Trolencio 911", "trolencio911");
        
        System.out.println(historia1);
        System.out.println(noticia1);
    }
    
}
