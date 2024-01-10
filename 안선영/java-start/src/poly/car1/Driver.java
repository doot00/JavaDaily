package poly.car1;

public class Driver {

    // 드라이버는 멤버 변수로 car를 가진다. k3 인스턴스를 참조하는 것이다.
    private Car car;

    // 멤버 변수에 자동차를 설정한다.
    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다: " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}



