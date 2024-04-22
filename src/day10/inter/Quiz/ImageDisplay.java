package day10.inter.Quiz;

public class ImageDisplay implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("이미지 플레이어를 재생합니다.");
    }

    @Override
    public void pause() {
        System.out.println("이미지 플레이어를 재생합니다.");
    }

    @Override
    public void stop() {
        System.out.println("이미지 플레이어를 재생합니다.");
    }
}
