# learning-java
Java 

## Java Dasturlash tilining boshqa dasturlash tilidan farqi

### Ustunligi:
* o'rtada virtual mashina(bu mashinani java o'rnatadi) turadi, biz kodni kompilyatsiya qilganimizda, kod shu mashina tushinadigan  (BAYTCODE)tilga o'tkaziladi,
bu BYTECODE ni hohlagan OS ni virtual mashinasiga bersak ishlaysi
* 
### tiplar
#### primitive tiplar (bo'lib(parchalab) bo'lmaydi)

```
      nomi       |       imkoniyatlar      | joyi (byte)
-----------------|--------------------------------------------
* butun sonlar   |  byte, short, int, long | 1, 2, 4, 8
* kasr sonlar    |  float, double          | 4, 8
* belgilar       |  char                   | 2 [hozirgi kunda]
* maniqiy tiplar |  boolean                | 1
``` 

### Nima uchun tiplashtirilgan: 
- byte
```
    1 ta katakchaga 1 ta 2^1, 
    2 ta katakchaga 3 ta 2^2,
    1 byte = 8 bit = 8 ta katakcha 
    (2^8)-1 = 255 gach son = [-128 0 127]
```
- char 
```
Dunyodagi harbir simvllarni oz ko'di mavjud va kelishilgan(CODIROVKA)
Eng birinchi kelishuv ASCKII
    ASCII ga 256 ta eng ko'p ishlatiladigan belgilar tanlangan va A-65, B-67 kabi kelishilgan
Hozirgi kunda yuqoridagi jadvaldan kop belgilarni o'z ichiga oladi
    Masalan UNICODE 65536 ta belgini o'z ichiga oladi
```
- boolean
```
    1 bit, true, false (tok bor yoki yo'q)
```

#### reference tiplar
```
                 |
-----------------|--------------------------------------
* 
* 
* 
* 
```
Array n ta birhil tipdagi ma'lumotlar to'plamidan iborat bo'lgan ko=antainer
* primitive tiplarda hardoim *int a = 4;* deyilganda (istalgan bo'sh koyga)xotiraga yoziladi, shuningdek *int b = a;* dahaman yangi joy ajratiladi!
* reference typelarda *String s = new String("salom);* 

##  OOP

### Class doim 2 ta qismdan iborat bo'ladi

* xotirasida nimadir saqlab turish uchun o'zida atributlar saqlaydi(propertylar deyiladi)

```
    public class Student {
        // property, fieldlar, attribute:
        String name;
        int point;
        int age;  
    }
```

* xar bitta clasni ozining xususiyatlari bo'ladi (methods deyiladi)   
   methodlarni minimum yozish qoidasi tip qayataradigan bo'ishi kerak
```
    public class Student {
        String name;
        int point;
        int age;

        // method:
        boolean isPassed(int standard) {
            return point >= standard;
        }

        void printStatus(int standard){
            System.out.printf("%s - %s\n", name, isPassed(standard) ? "passed" : "not passed");
        }
    }
```
* method overloading
```
    class MyMath {
        // method Overloading
        int max(int num1, int num2) {
            return num1 > num2 ? num1 : num2;
        }

        int max(long num1, long num2) {
            return num1 > num2 ? num1 : num2;
        }

        int max(int num1, int num2, int num3) {
            return this.max(num1, this.max(num2, num3));
        }
    }

    public class OverLoading  {
        public static void main(String[] args) {

            MyMath math = new MyMath();

            System.out.println(math.max(12, 23));
            System.out.println(math.max(12, 23, 34));

        }
    }
```

* constructor

constructor qandaydir klasdan obect yaratib beradigan metod! 
 faqat u obect yaratilayotgan vaqda chaqiriladi

 javada agar siz constructor yaratmasangiz default o'zining constructori bo'ladi

```
    class MyMath {
        int num (int n) {
            return n;
        }
    }

```

``` MyMath math = new MyMath(); //MyMath()
```
constructorni methoddan farqi
1-qoida
    uning qaytaradigan tipi bo'lmaydi!
2-qoida
    constructorni nomi class nomi bilan birhil bo'lishi kerak
```     // parametrsiz constructor
        MyMath () {

        }
```
agar biz constructor yasamasak default constructor yasaladi uning vazifasi yangi object yasash
```
    MyMayh () {}
``` 
va har safar object olganimizda har safar constructr ishga tushadi!

* make constructor
```
    class Point {
        int x;
        int y;

        // constructor overloading
        Point () {
            this.x = 0;
            this.y = 0;
        }

        Point (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public class Constructor {
        public static void main(String[] args) {
            Point point = new Point(0, 0);
            System.out.println(point.x+" "+point.y);
        }
    }
```
or
```
class Point {
        int x;
        int y;

        // constructor overloading
        Point () {
            this(0, 0);
        }

        Point (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
```
constructor mavhim tarzda yasalgan objectni o'zini qaytaradi

* meros