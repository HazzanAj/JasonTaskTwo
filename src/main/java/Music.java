import lombok.Data;

@Data
public class Music {
    private String musicId;
    private String musicReleasedDate;
    private String musicPrice;
    private String singer;
    private String location;
    private String album;
    Feature feature;


    public Music (){
        super();
    }

    public Music(String musicId, String musicReleasedDate, String musicPrice, String singer, String location, String album, Feature feature) {
        this.musicId = musicId;
        this.musicReleasedDate = musicReleasedDate;
        this.musicPrice = musicPrice;
        this.singer = singer;
        this.location = location;
        this.album = album;
        this.feature = feature;
    }




}
