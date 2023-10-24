public class ChickenMenu {
    //이 코드는 ChickenMenu 클래스를 정의하고 시작합니다.
    String name;
    int price;
    String cook="fry";

    //이 부분은 클래스 내에서 사용될 멤버 변수를 선언합니다.
    // 여기에는 메뉴의 이름(name), 가격(price), 그리고 요리 방식(cook)이 있습니다.
    // cook 변수는 "fry"로 초기화됩니다.

    //생성자 만들기
    public ChickenMenu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //이 코드는 두 개의 매개변수를 받는 생성자를 정의합니다. 생성자는 클래스의 인스턴스를 초기화하는 역할을 합니다.
    // 이 생성자는 name과 price를 인자로 받아 인스턴스 변수 name과 price에 값을 할당합니다.
    // cook 변수는 기본적으로 "fry"로 설정됩니다.

    //생성자 만들기
    public ChickenMenu(String name, int price, String cook) {
        this.name = name;
        this.price = price;
        this.cook = cook;
    }

    //이 코드는 세 개의 매개변수를 받는 다른 생성자를 정의합니다. 이 생성자도 name과 price를 받고,
    // 추가로 cook 변수에 대한 값을 지정할 수 있습니다.
    // 따라서 이 생성자를 사용하면 요리 방식(cook)을 직접 설정할 수 있습니다.

}
