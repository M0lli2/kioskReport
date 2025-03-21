# kioskReport
## 25-03-07 Lv1 구현
![Image](https://github.com/user-attachments/assets/8a55ec4b-0bcb-48b1-a118-c4dde622cdd5)

---

### 구현 내용
**1. 실행 시 메뉴 표시**
```java
package org.example.lv1;

import java.util.Scanner; // 스캐너 사용

public class ChickenMenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 치킨 메뉴 출력
        System.out.println("[ CHICKEN MENU }");
        System.out.println("1. Fried Chicken       | W 18,000 | 크리스피한 후라이드");
        System.out.println("2. Oven bake Chicken   | W 22,000 | 담백한 오븐구이");
        System.out.println("3. Seasoned Chicken    | W 21,000 | 매콤달콤한 양념");
        System.out.println("4. Soy sauce Chicken   | W 21,000 | 달콤짭짤한 간장");
        System.out.println("0. 종료                 | 종료");
    }
}
```
**2. 반복문 이용**
```java
// 반복문
boolean running = true;

while (running) {}
```
**3. 메뉴 선택 입력 & 선택 메뉴에 따라 다른 로직**
```java
// 메뉴 선택 입력 받기
System.out.println("메뉴를 골라주세요(종료하려면 '0' 입력): ");
int choice = scanner.nextInt();

            // 선택 메뉴에 따른 로직
    switch (choice){
        case 0:
           System.out.println("메뉴선택을 종료합니다.");
           running = false; // 0 입력시 while 문 종료
           break;
        case 1:
           System.out.println("Fried Chicken 선택");
           break; // switch문을 탈출해서 while문으로 돌아가 반복
        case 2:
           System.out.println("Oven bake Chicken 선택");
           break; // switch문을 탈출해서 while문으로 돌아가 반복
        case 3:
           System.out.println("Seasoned Chicken 선택");
           break; // switch문을 탈출해서 while문으로 돌아가 반복
        case 4:
           System.out.println("Soy sauce Chicken 선택");
           break; // switch문을 탈출해서 while문으로 돌아가 반복
        default:   // 예외처리
        System.out.println("옳바르지 않은 선택입니다. 다시 선택해주세요.");
}
```
---

## 25-03-11 Lv 2 구현

### 구현 내용

 **1. MenuItem 클래스 생성**

   `이름`, `가격`, `설명`  세팅
```java
public class MenuItem {
    // 속성
    private String name; // 이름
    private int price; // 가격
    private String info; // 설명

    //생성자
    public MenuItem(String name, int price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }

    //  getter 메소드
    public String getName() {
        return name;
    }
    public  int getPrice() {
        return price;
    }
    public String getInfo() {
        return info;
    }
}
```
 **2. main 함수에서 MenuItem 클래스 활용**

  `MenuItem` 객체 생성을 통해 `이름`, `가격`, `설명`을 세팅.

  `List`를 선언하여 여러 `MenuItem`을 추가.

```java
public class Main {
    public static void main(String[] args) { // Main 함수

        // 메뉴 아이템 생성
        MenuItem chicken1 = new MenuItem("Fried Chicken", 18000, "크리스피한 후라이드");
        MenuItem chicken2 = new MenuItem("Oven bake Chicken", 22000, "담백한 오븐구이");
        MenuItem chicken3 = new MenuItem("Seasoned Chicken", 21000, "매콤달콤한 양념");
        MenuItem chicken4 = new MenuItem("Soy sauce Chicken", 21000, "달콤짭짤한 간장");

        // add 함수 활용 리스트에 메뉴 아이템 추가
        List<MenuItem> menuItems = new ArrayList<>();// List 선언 chicken menuitem 추가
        menuItems.add(chicken1);
        menuItems.add(chicken2);
        menuItems.add(chicken3);
        menuItems.add(chicken4);
    }
}
```
 `Scanner` 선언, 반복문 활용(향상된 for문)하여 MenuItem 출력

  숫자를 통해 입력, 입력된 숫자에 따른 처리 & 프로그램 종료
  
(Lv1 while-switch문 차용)
  
  출력값 = "선택한 메뉴 : `이름`,`가격`, `설명`"
  
```java
// Scanner 선언
        Scanner scanner = new Scanner(System.in);

        // 메뉴 출력 - 향상된 for 문
        System.out.println("[ CHICKEN MENU ]");
        for (MenuItem item : menuItems) {
            System.out.println("치킨 메뉴 = " + "이름: " + item.getName() + " | W  " + item.getPrice() + " | " + item.getInfo());
        }

        boolean running = true;

        while (running) {

            // 숫자 입력 받기
            System.out.println("메뉴를 골라주세요(종료하려면 '0' 입력): ");
            int choice = scanner.nextInt();

            // 입력된 숫자에 따른 처리
            switch (choice) {
                case 0:
                    System.out.println("메뉴선택을 종료합니다.");
                    running = false; // 0 입력시 while 문 종료 (프로그램 종료)
                    break;
                case 1:
                    System.out.println("Fried Chicken 선택: " + menuItems.get(0).getName() + " | W " + menuItems.get(0).getPrice() + " | " + menuItems.get(0).getInfo());
                    break; // switch문을 탈출해서 while문으로 돌아가 반복
                case 2:
                    System.out.println("Oven bake Chicken 선택: " + menuItems.get(1).getName() + " | W " + menuItems.get(1).getPrice() + " | " + menuItems.get(1).getInfo());
                    break; // switch문을 탈출해서 while문으로 돌아가 반복
                case 3:
                    System.out.println("Seasoned Chicken 선택: " + menuItems.get(2).getName() + " | W " + menuItems.get(2).getPrice() + " | " + menuItems.get(2).getInfo());
                    break; // switch문을 탈출해서 while문으로 돌아가 반복
                case 4:
                    System.out.println("Soy sauce Chicken 선택: " + menuItems.get(3).getName() + " | W " + menuItems.get(3).getPrice() + " | " + menuItems.get(3).getInfo());
                    break; // switch문을 탈출해서 while문으로 돌아가 반복
                default:   // 예외처리
                    System.out.println("옳바르지 않은 선택입니다. 다시 선택해주세요.");
            }
            System.out.println();
```
---
## 25-03-12 Lv3 구현

### 구현 내용

 **1. 키오스크 클래스 생성**

 `MenuItem` 을 관리하는 리스트가 필드로 존재
 ```java
private List<MenuItem> menuItems;
```

`main` 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수를 만들어 관리
```java
public void start() { // main 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수를 만들어 관리
       // 프로그램 실행 상태 관리 변수
        boolean running = true;

        while (running) {
            System.out.println("[ Kiosk Menu ]"); // 메뉴목록 출력
            for(int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.println((i + 1) + ". " + item.getName()+" | W "+item.getPrice()+" | "+item.getInfo());
            }
            // 종료 출력
            System.out.println("메뉴를 골라주세요(종료하려면 '0' 입력): ");
            // 정수로 입력받기
            int choice = -1;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                // 정수가 이닐시 예외
                scanner.nextLine();
                System.out.println("잘못된 입력이빈다. 숫자를 입력하세요.");
                continue; // 반복문 처음으로 돌아감
            }
            // switch-case 문으로 기본 옵션 처리
            switch (choice) {
                case 0:  // 종료 옵션 선택
                    System.out.println("프로그램을 종료합니다.");
                    running = false; // 반복문 종료 조건
                    break;

                default:
                    // 메뉴 범위 내의 선택인지 확인
                    if (choice >= 1 && choice <= menuItems.size()) {
                        MenuItem selectItem = menuItems.get(choice - 1);
                        System.out.println(selectItem.getName() + " W " + selectItem.getPrice() +" | " +  selectItem.getInfo()); // 선택메뉴 출력
                    } else {
                        System.out.println("잘못된 입력이빈다. 다시 선택해주세요."); // 옳바르지 않은 메뉴 번호 입렧 시
                    }
                    break;
            }
            System.out.println();// 줄 바꿈
        }
        scanner.close();
        }
    
```
`List<MenuItem> menuItems` 는 `Kiosk` 클래스 생성자를 통해 값을 할당합니다.
```java
public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
```
많이 막히고 어려웠던 부분의 시작이었던것같다.
솔직히 말하면 타임라인이 많이 밀린 지금, 기간안에 과제를 전부 끝낼 수 있을지는 모르겠지만 모르고 어려웠던 부분들은
하나하나 오답노트에 적어 두었으니 Til등을 통해 다시 하나씩 풀어가는 시간을 가지며 오롯이 내 것으로 만들 수 있도록 해야겠다.
가장 어려웠던 부분은 for문의 구조, 예외처리, 그리고 각각의 클래스별로 기능분담과 연계과정인것 같다.
이때까진 두개의 클래스정도만 다뤄봤기에 더욱 그런것 같기도 하다.

---

## 2025-03-14 Lv4

### 구현 내용

1. 메뉴 아이템을 관리하는 메뉴 클래스 생성
   각각의 카테고리에 여러 메뉴아이템 포함
   간소화와 재사용성을 위해 카테고리 모든 메뉴 출력 기능 가져옴
   카테고리 이름을 반환하는 메서드 구현
   
```java
package org.example.lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String category; // 메뉴 카테고리
    private List<MenuItem> menuItems; // 카테고리별 메뉴 리스트

    // 생성자 카테고리명 초기화
    public Menu(String category)  {
        this.category = category;
        this.menuItems =new ArrayList<>();
    }
    //카테고리 이름 반환
    public String   getCategory() {
        return category;
    }
    // 메뉴 리스트 반환
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
    // 현재 카테고리 모든 메뉴 출력
    public void printMenu() {
        System.out.println("[ " + category + " ]");

        for(int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.println((i + 1) + ". " + item.getName()+" | W "+item.getPrice()+" | "+item.getInfo());
        }
    }

}
```
2. 효율적으로 관리하기위해 Main에 카테고리별 메뉴 객체 생성
   키오스크에 메뉴 추가

3. 메뉴아이템 클래스와 각각 의 메뉴 카테고리의 자식 클래스를 만들어 상속

처음에 생각을 잘못하여 요구사항 그대로가 아닌 리스트안의 리스트, 각각의 리스트를 따로 만들어 관리하려다 보니
너무 막막하여 피드백을 몇번 받았습니다. 튜터님께서 방향을 잡아주셔서 Menu클래스에 어떤 내용이 들어가야하고 어떤 구성이 되어야하는지
깨닫고 그제서야 진행할 수 있었습니다.
각각의 클래스를 리팩토링하고 일정부분 재구성 하는게 많이 어려웠던 것 같습니다.
이로 인해 저에게 부족한점이 무엇인지 다시 한번 깨닫게 되었고, 너무 어렵게 꼬아서 생각하지 않도록 해야할 것 같습니다.

해결하지 못한 것
 + 프로그램 실행 후 상위 카테고리는 표출되나 정수를 두번 입력해야 반응하는 문제 발생
 + 하위 카테고리가 나오지 않는 문제 발생

