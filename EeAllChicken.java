public class EeAllChicken {
    int no;
    String name;
    ChickenMenu[] menus;

    //이 부분은 클래스 내에서 사용될 멤버 변수를 선언합니다. 여기에는 다음이 포함됩니다:
    //no: 순번을 나타내는 정수
    //name: 메뉴 가게의 이름을 나타내는 문자열
    //menus: ChickenMenu 객체 배열을 가리키는 변수


    public EeAllChicken(int no, String name, ChickenMenu[] menus) {
        this.no = no;
        this.name = name;
        this.menus = menus;
    }


    //이 코드는 세 개의 매개변수를 받는 생성자를 정의합니다. 생성자는 클래스의 인스턴스를 초기화하는 역할을 합니다.
    // 이 생성자는 no, name, 그리고 menus 변수에 값을 할당합니다.
    // menus 변수에는 여러 닭 메뉴(ChickenMenu)를 관리하는 데 사용되는 배열이 전달됩니다.

    ChickenMenu orderMenu(String name){
        for(ChickenMenu menu: menus){
            if(menu.name.equals(name)){
                return menu;
            }
        }
        return null;
    }

    //이 코드는 메뉴를 주문하는 메서드인 orderMenu를 정의합니다.
    // 이 메서드는 메뉴의 이름을 받아와서,
    // 주어진 이름과 일치하는 메뉴를 menus 배열에서 찾아 반환합니다.
    // 일치하는 메뉴가 없으면 null을 반환합니다.
}
