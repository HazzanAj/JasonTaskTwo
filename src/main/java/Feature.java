import lombok.Data;

@Data
public class Feature {
    private String name;
    private String age;
    private String track;

    public Feature(){
        super();
    }

    public Feature(String name, String age, String track) {
        this.name = name;
        this.age = age;
        this.track = track;
    }


}
