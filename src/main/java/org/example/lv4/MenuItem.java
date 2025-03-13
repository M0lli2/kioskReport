package org.example.lv4;

    public class MenuItem {

        // 속성
        private String name; // 이름
        private int price; // 가격
        private String info; // 설명

        // 생성자
        public MenuItem(String name, int price, String info) {
            this.name = name;
            this.price = price;
            this.info = info;
        }

        //  getter 메소드
        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public String getInfo() {
            return info;
        }

    }

