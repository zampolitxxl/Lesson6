
import java.util.HashSet;

public class OOPMain {

    public static void main(String[] args) {
        Cat murzik = new Cat("Murzik", 150, 7);
        Plate plate1 = new Plate(30);



        System.out.println(murzik);

        murzik.eat(plate1); //вызвали метод EAT для объекта MURZIK со своими полями(appetite, satiety)
        // . Аргумент в метод EAT
        // передали Plate1 c значеием поля food=150


        //murzik.eat(plate);
        System.out.println("plate= "+ plate1);
        System.out.println("new murzik"+ murzik);








        //Cat first = new Cat("Name", 150);
        //Cat second = new Cat("Name", 100);

        //System.out.println(first == second); // false
        //System.out.println(first.equals(second));

        //System.out.println(first.hashCode());
        //System.out.println(second.hashCode());

        //HashSet<Cat> cats = new HashSet<>();
        //cats.add(first);
        //cats.add(second);
        //System.out.println(cats);

    }

}
