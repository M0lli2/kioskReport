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

## 25-03-00 Lv 2 구현
