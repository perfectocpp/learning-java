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

* final 

agar finalni o'zgaruvchi oldiga qo'ysak o'zgarmas boladi
agar classni oldiga qo'ysak undan meros olib bo'lmaydi
agar mehodni oldiga qo'ysak uni override qilib bo'lmaydi

* har bitta klassni birinchi otasi object deyiladi, 
bu shaqa klasski uni ichidagi bazi metodlar barcha obetlarda bo'ladi!

masalan:
    equals();
    hashcode();
    gatClass();
    toString();
    ...
    .
    .

* static methods

nega main static bo'lgan
 main java tomonidan to'g'ridan to'g'ri chaqiriladi

 staticdan turub static bo'lmaganni chaqirib bo'lmaydi

* recursive

### Polimarfizm


### exeption
    * Exeption
    * polimorfizm
    * multicache

### encapsulation

javada har bitta klassni (fields or) metodini oz visiblitysi (qayerdan qanday korinishi) bor 
Access Modifier

1. public {hamma joyda ko'rinadi}
2. private {e'lon qilingan blockni ichida ko'rinadi}
3. protected {e'lon qilinga pasket ni ichida ko'rinadi, lekinmeros bo'lib otadi}
4. no access modifier (pakage levelda)

* **public**
```

```
nimaga kerak

## Interface

interface ham huddi classga o'xshab o'z nomiga ega va judaham abstrct narsa
interface ichida field e'lon qilish mumkin emas!
interface lar odatdda class ni structurasini doim biril ushlab turish uchun kerak
Javada interfacelar classda impement olib ishlatish uchun yaslagan

interface o'zining bolalariga qanday metodlari bo'lishini aytadi

ex:
```

```

## abstract class

## enum

ma'lum bir class bor va uning aniq fieldlari mavjud ex:(season, week, month ...)
shunday xolatlarda enum tavsiya etiladi

enumning constructori private bo'ladi! va u final bo'ladi
shu sababli undan volris olib bo'lmaydi!!!

## generics


## coll

har-bita priitive tipni class ko'rinishidagi alternivlari bor
* autobox
```

```

* unbox

java.util

## java.util
### collection

collection - abstract interface
collection - bir-nechta obectlarni to'plami,(qanday obektligini biz xal qilamiz)
* unga qo'shish, undan o'hirib tashlash , qidirish, ochirish, tozalash ... mumkin

uni ishlatish:
    uni bolalari ikkita katta kategoriyaga bo'lingan!
    Ular:
        * setlar
        * listlar

#### set
    * set bu interface, bu collectiondan extend olgani uchun undaham colection ichidaga barcha methodlar bor
    - setning o'ziga hosligi - bitta setta hechqachon doublikat obekt saqlash mumkinmas!
   
    - eng kop ishlatiladingan 2 ta set implemitatiyasi bor
        1. HashSet
            HashSet bu stringlarni saqlash uchun top'lam yaratib beradi!
            *  tartib saqlamaydi, tezroq yozadi

        2. LinkedHashSet 
            * tartib saqlaydi, nisbatan sekinroq yozadi

        3. TreeSet
            * barchasini solishtirib chiqib keyin o'rnini topib yozadi!

### list
    * listham interface va collection dan extend olgan lekin unga o'xshamagan va arrayni alternativi (itereble)
        - add bor
        - bir hil ma'lumot saqlaydi
        - remove qilish mumkin (index va obekt bo'yicha)
        - indexOf, lastIndexOf
        - subList
    
    - listing judaham mashxur ikkita implemitatiyasi bor

        1. ArrayList
            * kam yozib ko'p o'qish uchun arrayList zo'r
            - o'zining ichidagi qiymatlarinin arrayni =ng ichida saqlaydi
        
        2. LinkedList
            - bu obektni oz ichidagi structga qo'shb olib turli linklarda saqlaydi

### map
    * map - generic class va asatstic array: [key : value]

    HashMap
    LinkedHashMap
    TreeMap

## Concurrency

    PROTSESSOR  |   * protsessor ichida nechtadir yadro bo'ladi! yadroning bir sekundni ichida bajarilish chastotasi bor [2.4hz]
    _________   |       - bitta protsessor 1 core degani - 1 ta yadrosi bor degani
    |   |   |   |
    |---|---|   |
    |___|___|   |

OS operatorlari 1 tadan protsess(potok) degan narsani o'ylab topishgan, har bit protsessni oz priaryiteti bo'ladi va shunga qarab protsessga vaqt ajratiladi yani 1 ta core da parallel ish bajarilishi mumkin emas (ketma-ket juda tez bajariladi)

javada OS ni imkoniyatlaridan foydalanib bitta ishini qandaydir potoklarga bo'lib, bu orqali shu ishlarni parrallel bajarish mumkin

### Thread

    potok Thread degan class orqali yasaladi, uning constructoiga Runable Interface yoki undan implemet qilingan obektni vazida qilib berib yuorish mumkin va undan so'ng uni start qilganimdan so'ng u ishlashni boshlaydi

```// Runnable dan implements olgan class
    public class MyTask implements Runnable{
        private String threadName;
        private long sleepTime;

        public MyTask (String threadName, long sleepTime){
            this.threadName = threadName;
            this.sleepTime = sleepTime;
        }

        @Override
        public void run() {
            while (true){
                System.out.println(threadName);
                try {
                    Thread.sleep(sleepTime);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
```
``` // potok yasash va start berish
    public class Concurrency {
        public static void main(String[] args) {

            MyTask task1 = new MyTask("thread-1", 1000);

            Thread thread1 = new Thread(task1);
            Thread thread2 = new Thread(new MyTask("thread-2", 1000));

            thread1.start();
            thread2.start();

        }
    }

```



