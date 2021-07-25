package javabystriystart.HF01strategy;
public class HF01strategy {
    public static void start() {
        (new MallardDuck()).functions();
        (new RedheadDuck()).functions();
        (new RubberDuck()).functions();
        (new DecoyDuck()).functions();
//        (new Duck()).functions();
/*,45 наследование нам не подошло, потому что утиноеповедение изменяется в субклассах,
      а некоторые аспекты поведения присутствуют не во всех субклассах.
Выделите то, что изменяется,и «инкапсулируйте» эти аспекты, 
чтобы они не влияли на работу остального кода.
Меньше непредвиденных последствий от изменения кода, большая гибкость!
поведение предоставлялось НЕ конкретной реализацией в суперклассе Duck,
а отдельным интерфейсом [классом] поведения, не привязанном к субклассу Duck.
*/
        Duck model = new ModelDuck();
        model.setFlyBehavior(new FlyRocketPowered());
        model.functions();
    }

}
