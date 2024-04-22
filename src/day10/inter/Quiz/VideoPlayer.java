package day10.inter.Quiz;

public class VideoPlayer implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("비디오 플레이어를 재생합니다.");
    }

    @Override
    public void pause() {
        System.out.println("비디오 플레이어를 일시정지 합니다.");
    }

    @Override
    public void stop() {
        System.out.println("비디오 플레이어를 멉춥니다.");
    }
}
