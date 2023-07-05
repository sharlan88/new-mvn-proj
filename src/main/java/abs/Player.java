package abs;

import lombok.Data;

@Data
public abstract class Player implements Playable {

    private String model;
    private int trackNumber;


}
