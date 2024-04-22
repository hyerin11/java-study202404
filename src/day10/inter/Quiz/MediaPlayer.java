package day10.inter.Quiz;

import day10.inter.Galaxy;
import day10.inter.SmartPhone;

public class MediaPlayer {

    private MediaPlayable[] mediaList = new MediaPlayable[0];

    public void addMedia(MediaPlayable media) {
        // 주어진 media를 mediaList배열에 추가

        MediaPlayable[] newMediaPlayable = new MediaPlayable[mediaList.length+1];
        for(int i = 0; i<this.mediaList.length; i++){
            newMediaPlayable[i] = this.mediaList[i];
        }
        newMediaPlayable[newMediaPlayable.length-1] = media;
        this.mediaList = newMediaPlayable;
    }

    public void playAll() {
        // 반복문을 통해 mediaList에 있는 모든 미디어들을 재생시킴

        for(MediaPlayable media : mediaList){
            media.play();
        }

    }

}
