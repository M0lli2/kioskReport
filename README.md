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

## 2025-03-00 Lv4
