import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class JasonMain {
    public static void main(String[] args) {

        /**How to convert object to json**/
        try {
            ObjectMapper objectMapper = new ObjectMapper();
           /* InputStream inputStream = new FileInputStream(new File("target/musicOut.json"));
            TypeReference<List<Music>> typeReference = new TypeReference<List<Music>>() {};
            List<Music> musics = objectMapper.readValue(inputStream,typeReference);
            for( Music m : musics) {
                System.out.println("MusicId :" + m.getMusicId() + " musicReleasedDate :" +
                        m.getMusicReleasedDate() + "musicPrice :" +
                        m.getMusicPrice() +"singer :" + m.getSinger() +"location :" + m.getLocation()
                        + " album :" +m.getAlbum());
            }*/
            String musicJson = " {\"musicId\":\"1\",\"musicReleasedDate\":\"2020-09-08\",\"musicPrice\":\"30Euro\",\"singer\":\"James White\",\"location\":\"Finland\",\"album\":\"Love is Good\",\"feature\":{\"name\":\"Kollin Tey\",\"age\":\" 23\",\"track\":\"Vol2\"}}" +
                    "";

            Music mus = objectMapper.readValue(musicJson,Music.class);
            System.out.println(mus);

            Music music = new Music();
            music.setMusicId("1");
            music.setMusicReleasedDate("2020-09-08");
            music.setMusicPrice("30Euro");
            music.setSinger("James White");
            music.setLocation("Finland");
            music.setAlbum("Love is Good");
            music.setFeature (new Feature("Kollin Tey", " 23", "Vol2"));
            objectMapper.writeValue(new File("target/musicOut.json"), music);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
