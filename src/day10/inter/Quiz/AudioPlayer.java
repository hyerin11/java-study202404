package day10.inter.Quiz;

public class AudioPlayer implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("오디오 플레이어를 재생합니다.");
    }

    @Override
    public void pause() {
        System.out.println("오디오 플레이어를 일시정지 합니다.");
    }

    @Override
    public void stop() {
        System.out.println("오디오 플레이어를 멈춥니다.");
    }
}
