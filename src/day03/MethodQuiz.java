public class MethodQuiz {

    static String[] foods = {"떡볶이", "치킨", "파스타"};
    static String[] userNames = {"홍길동", "고길동"};

    public static void main(String[] args) {
        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

        remove("치킨");
        printFoods();

        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);

        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);

        insert(3, "파인애플");
        printFoods();

        modify(2, "닭갈비");
        printFoods();
    }

    // 배열에 저장된 음식을 출력하는 메서드
    public static void printFoods() {
        System.out.print("음식 목록: ");
        for (String food : foods) {
            System.out.print(food + " ");
        }
        System.out.println();
    }

    // 배열에 음식을 추가하는 메서드
    public static void push(String food) {
        // 새로운 음식을 추가하기 위해 배열의 크기를 증가시킴
        foods = Arrays.copyOf(foods, foods.length + 1);
        // 배열의 마지막 위치에 새로운 음식을 추가
        foods[foods.length - 1] = food;
    }

    // 배열에서 음식의 인덱스를 찾는 메서드
    public static int indexOf(String food) {
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(food)) {
                return i;
            }
        }
        return -1;
    }

    // 배열에서 음식을 제거하는 메서드
    public static void remove(String food) {
        int index = indexOf(food);
        if (index != -1) {
            // 배열에서 해당 음식을 제외한 새로운 배열 생성
            String[] newFoods = new String[foods.length - 1];
            for (int i = 0, j = 0; i < foods.length; i++) {
                if (i != index) {
                    newFoods[j++] = foods[i];
                }
            }
            // 기존 배열을 새로운 배열로 대체
            foods = newFoods;
        } else {
            System.out.println("해당 음식이 존재하지 않습니다.");
        }
    }

    // 배열에 특정 음식이 포함되어 있는지 확인하는 메서드
    public static boolean include(String food) {
        for (String item : foods) {
            if (item.equals(food)) {
                return true;
            }
        }
        return false;
    }

    // 배열에 특정 위치에 음식을 삽입하는 메서드
    public static void insert(int index, String food) {
        // 배열 크기를 확장하여 새로운 음식을 추가
        foods = Arrays.copyOf(foods, foods.length + 1);
        // index 위치에 새로운 음식 삽입을 위해 이후의 음식들을 뒤로 이동
        for (int i = foods.length - 1; i > index; i--) {
            foods[i] = foods[i - 1];
        }
        // 새로운 음식을 index 위치에 삽입
        foods[index] = food;
    }

    // 배열의 특정 위치의 음식을 변경하는 메서드
    public static void modify(int index, String food) {
        // 주어진 인덱스가 배열 범위를 벗어나면 수정하지 않음
        if (index < 0 || index >= foods.length) {
            System.out.println("인덱스 범위를 벗어납니다.");
            return;
        }
        foods[index] = food;
    }
}
