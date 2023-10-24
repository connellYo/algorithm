public class Main {
    public static void main(String[] args) {

        ChickenMenu[] menus={
                new ChickenMenu("마늘갈릭",10000),
                new ChickenMenu("식초비니거",20000),
                new ChickenMenu("후라이드프라이",15000)
        };

        EeAllChicken store1=new EeAllChicken(1,"뉴욕",menus);

        ChickenMenu order1=store1.orderMenu("마늘갈릭"); // 마늘갈릭 return 될거임
        ChickenMenu order2=store1.orderMenu("양념갈릭"); // 없는 메뉴임으로 null
    }
}