package com.additional;

public class Method {

    void method() {
        class Inner {
            private int id;
            private String field;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getField() {
                return field;
            }

            public void setField(String field) {
                this.field = field;
            }

            public void print() {
                System.out.println("Метод print -> class Inner -> void method -> class Method");
            }
        }
        Inner inner = new Inner();
        inner.setId(15);
        inner.setField("Додаткове завдання.");
        System.out.println(inner.getField() + " = private String field;");
        System.out.println("Урок №" + inner.getId() + " = private int id;");
        inner.print();
    }
}
