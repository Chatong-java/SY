2,3 번 문제에서 인터페이스로 각각의 연산 부분을 인터페이스로 구현했는데,
인터페이스를 쓰는 이유를 다시 한번 생각해봐

인터페이스는 자바의 다형성을 이용해서 의존성을 줄이는 방법이라고 생각할 수 인
 
q2 에 컨트롤 하는 부분을 보면

            Add add = new Add();
            Sub sub = new Sub();
            Mul mul = new Mul();
            Div div = new Div();
            
이렇게 했는데 이러면 인터페이스를 쓰는 이유가 하나도 없어

            cal cal = new Add();

인터페이스 부분이 구현되는 부분보다 상위 개념이라고 생각할 수 있기 때문에  이렇게도 쓸 수있는데 이건 내가 나중에 다시 한번 제대로 설명해 줄겡 

그리고 왠만하면 `static` 은 쓰지 않는게 좋아 
저번에 말했듯 메모리를 잡아먹어서 효율이 좋지 않아
마찬가지로 `main`메소드 안에서는 연산을 하지 않는게 좋아 그냥 `main`은 실행만 한다고 생각해
 
 ```{.java}
 class Main{
    public static void main(String[] args){
        Main main = new Main();
        main.controller();
    }

    public void conrtoller(){
        ...
    }
}

```


이런식으로 쓰는게 더 좋을거 같다 
