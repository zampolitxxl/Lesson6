
import java.util.Objects;

public class Cat {

    // private недоступно никому
    // protected доступно внутри пакета + наследование
    // default доступно внутри пакета
    // public доступно всем

    private String name; // поле, содержащее имя кота
    private int appetite; // аппетит кота (столько он съедает за раз)
    private int satiety; // сытость (голодный или нет)

    private int eaten; // съедено (голодный или нет)


    //объект Cat
    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    // getter
    public String getName() {
        return name;
    }

    public void eat(Plate plate2) {
        if (satiety>9) {
            return;
        }
        //eaten=((appetite/10)*satiety);
        int foodTarelka= plate2.getFood();
        System.out.println("Еды было"+ foodTarelka);

        plate2.decreaseFood((appetite/10)*satiety);

        int foodTarelka2= plate2.getFood();
        System.out.println("Еды стало"+ foodTarelka2);
        int catEatenFood=foodTarelka-foodTarelka2;
        System.out.println("Мурзик съел"+ catEatenFood);

        int satietyIncrease=catEatenFood*10/appetite;
        System.out.println("сытость увеличилась на  "+ satietyIncrease);


        satiety=satiety+satietyIncrease;
        if (satiety>10){
            satiety=10;
        }
        System.out.println("новый уровень сытости"+ satiety);



        //satiety=satiety+(eaten/appetite);
    }

    //Переписываем метод ТУ стринг Satiety
    @Override
    public String toString() {
        return name + " [" + appetite + "]"  +  "[" + satiety + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj instanceof Cat anotherCat) {
//            Cat anotherCat = (Cat) obj; // cast
            return name.equals(anotherCat.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // if obj1.equals(obj2) => obj1.hashcode() == obj2.hashcode()

    //    // setter
//    public void setName(String catName) {
//        name = catName;
//    }


}
