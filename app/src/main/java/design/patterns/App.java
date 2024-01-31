package design.patterns;

import design.patterns.strategyPattern.duck.Duck;
import design.patterns.strategyPattern.duck.DuckPager;
import design.patterns.strategyPattern.duck.MallardDuck;
import design.patterns.strategyPattern.duck.ModelDuck;
import design.patterns.strategyPattern.duck.RubberDuck;
import design.patterns.strategyPattern.duck.interfaces.impl.fly.FlyWithWings;
import design.patterns.strategyPattern.duck.interfaces.impl.quack.MuteQuack;
import design.patterns.strategyPattern.duck.interfaces.impl.quack.Squeak;
import design.patterns.strategyPattern.gameCharacter.Character;
import design.patterns.strategyPattern.gameCharacter.King;
import design.patterns.strategyPattern.gameCharacter.Knight;
import design.patterns.strategyPattern.gameCharacter.Troll;
import design.patterns.strategyPattern.gameCharacter.interfaces.impl.Axe;
import design.patterns.strategyPattern.gameCharacter.interfaces.impl.BowAndArrow;
import org.checkerframework.checker.units.qual.C;

public class App {

    /*
    * Strategy Pattern (스트래티지 패턴)
    * 알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용 가능하게 함
    * TODO 스트래티지를 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘 변경 가능
    * */
    public static void strategyPattern_Duck() {
        Duck duck = new RubberDuck();
        duck.performFly();
        duck.performQuack();

        duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();

        duck = new ModelDuck();
        duck.performFly();
        duck.performQuack();

        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new Squeak());
        duck.performFly();
        duck.performQuack();

        DuckPager duckPager = new DuckPager();
        duckPager.callDuckPager(new MuteQuack());
    }

    public static void strategyPattern_GameCharacter() {
        Character character = new King();
        character.performFight();

        character = new Troll();
        character.performFight();
        character.setWeaponBehavior(new BowAndArrow());
        character.performFight();

        character = new Knight();
        character.performFight();
        character.setWeaponBehavior(new Axe());
        character.performFight();
    }

    public static void main(String[] args) {
        strategyPattern_GameCharacter();
    }

}