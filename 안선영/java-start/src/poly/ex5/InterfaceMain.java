package poly.ex5;


public class InterfaceMain {
    public static void main(String[] args) {
        // 인터페이스는 완전 추상이기 때문에 생성이 불가능하다.
        //InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Cat cat = new Cat();
        Caw caw = new Caw();
        Dog dog = new Dog();

        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(dog);
    }
        private static void soundAnimal(InterfaceAnimal animal) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");

        }

        private static void moveAnimal(InterfaceAnimal animal) {
            System.out.println("동물 이동 테스트 시작");
            animal.move();
            System.out.println("동물 이동 테스트 종료");

        }
    }

