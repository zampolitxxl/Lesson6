
public class Plate {  //создали класс как Воркек

    private int foodVtarelke;  //сделали поле(Еда)

    public Plate() {
        this(100);
    }

    public Plate(int food) {  // а это что за метод? Чтобы при создании можно было указать количество еда
        //в воркере мы через точку каждое поле наполняли, а тут можно сразу поля сдела нужные в скобки и вставлять
        //в конструкторе.
        if (food < 0) {
            throw new IllegalArgumentException("food must be positive");   //проверяет что еды не может быть меньше ноля
        }

        foodVtarelke = food; // а это что зачем ???? я не пойму почему у воркера такого не было
    }


    // getter
    public int getFood() {
        return foodVtarelke;
    }




    public void increaseFood(int food) {
        if (food > 0) {
            foodVtarelke += food;
        }
    }

    public int decreaseFood(int food) {


        if (foodVtarelke>= food) {     //если планируемое для поедание количество еды меньше чем есть в тарелке
            foodVtarelke -= food;

            return foodVtarelke;

        }
        foodVtarelke=0;
        return foodVtarelke;
    }




    @Override
    public String toString() {
        return "(" + foodVtarelke + ")";
    }
}
