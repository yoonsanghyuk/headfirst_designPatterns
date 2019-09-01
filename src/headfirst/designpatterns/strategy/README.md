# Head First : Design Patterns

## Strategy Pattern 전략패턴.

### 요약 : 
변화가 생길 기능(행동:behavior)을 예상하여 이를 캡슐화(및 추상화) 한다.
캡슐화 후 각 기능별로 구현해두고(ex: fly 중 noWay, WithWing, Rocket 등)
각 객체별로 사용할 기능을 (쉽게) 교환 받는다.
각 기능들이 추상화되어 있어 재사용성이 좋고, 수정이 용이하다.



### 기억 추적 : 
서브클래스는 단순히 super 클래스를 상속받는식의 구현이 아닌,
interface, abstract 등을 이용하여 기능의 동작만 받음.
각 기능은 인터페이스를 구현하여 미리 정의해두고 모델은 이를 조합하여 기능을 만들어가는 방식.


### UML
![Alt uml](./strategy_uml.png?s=200 )

