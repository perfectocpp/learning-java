package inheritence;

// bitta class faqat bitta classdan extends olishi mumkin
public class Pixel extends Point {
    int color;

    // to'ridian to'g'ri object yaratish imkoniyati uchun
    Pixel(){
        this(0, 0);
    }

    Pixel(int x, int y, int color ) {
        // super classni constructorini chaqirish
        super(x, y);
        this.color = color;
    }

    Pixel(int x, int y){
        this(x, y, 0);
    }
}
