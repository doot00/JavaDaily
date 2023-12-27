package pack;

import pack.Data;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지에 있을 때
        pack.a.User user = new pack.a.User(); // 다른 패키지에 있는 것을 불러올 때

    }
}
