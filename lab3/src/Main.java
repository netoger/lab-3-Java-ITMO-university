/*
Однажды Незнайка встретил Пончика и сказал: Вечером,
накануне назначенного для отлета дня, Незнайка и Пончик не легли спать.
Дождавшись, когда все коротышки уснут, они выбрались потихоньку из дома и отправились в Космический городок.
Ночь была темная, и у Пончика мороз подирал по коже от страха.
При мысли, что он скоро унесется в космическое пространство, душа у него уходила, как говорится, в пятки.
Он уже раскаивался, что ввязался в такое опасное предприятие, однако стыдился признаться Незнайке, что струсил.
 */

import classes.*;
import enums.*;

public class Main {
    public static void main(String[] args) {
        // начало истории
        System.out.println("************** Начало **************");
        Place gorod = new Place("город Коротышек");
        Place KosmGrad = new Place("Космический городок");
        Human DontKnower = new Human("Незнайка", Height.SHORT, Place.NOWHERE){
            @Override
            public void sleep() {
                System.out.println("Незнайка не будет засыпать");
            }
        };
        Human Donut = new Human("Пончик", Height.SHORT, Place.NOWHERE){
            @Override
            public void sleep() {
                System.out.println("ПОнчик не будет засыпать");
            }

            @Override
            public void tell(String phrase) {
                System.out.print("В мыслях у Пончика:\n");
            }
        };
        Human Shorts = new Human("Коротышки", Height.SHORT, Place.NOWHERE);
        DontKnower.move(Place.Home);
        Donut.move(Place.Home);
        Shorts.move(gorod);
        DontKnower.doingSmf("встретил", Donut.getName());
        DontKnower.tell(TimeOfDay.EVENING.getName() + "ом");
        Donut.move(Place.Home);
        while (Place.time != TimeOfDay.NIGHT){
            Place.setTime();
        }
        DontKnower.sleep();
        Donut.sleep();
        Shorts.sleep();
        if (Shorts.isSon()){
            DontKnower.move(KosmGrad);
            Donut.move(KosmGrad);
        }
        Donut.setCondition(Condition.FAIR);
        Subject moroz = new Subject("Мороз");
        Subject soul = new Subject("душа");
        Subject night = new Subject("ночь");
        night.setProperty("темная");
        Donut.showCondition(night.getName() + " " + night.getProperty());
        moroz.doingSmf("подирал", "по коже");
        Place pyatka = new Place("пятки");
        soul.move(pyatka);
        Donut.tell("");
        Donut.setCondition(Condition.SHAME);
        Donut.showCondition("струсил");
        System.out.println("************** The end... **************");
        //конец истории начало тестов
        Human clonDonut = new Human("Пончик", Height.SHORT);
        clonDonut.setCondition(Condition.SHAME);
        System.out.println(DontKnower.toString());
        System.out.println("Donut == CloneDonut? :" + Donut.equals(clonDonut) );
        System.out.println(Donut.hashCode());
        System.out.println(clonDonut.hashCode());
        Place.NOWHERE.setName("v");
    }
}