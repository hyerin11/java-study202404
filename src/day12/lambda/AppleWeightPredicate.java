package day12.lambda;

public class AppleWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>=100; //조건을 넣어줘서 이제는 구체적으로 변함

    }
}
