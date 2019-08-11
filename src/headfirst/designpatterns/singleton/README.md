# Head First : Design Patterns  
  
## Singleton Pattern 싱글 패턴.  
  
### 요약 :   
클래스의 인스턴스가 단 하나만 만들어지도록 하고, 대신 해당 인스턴스의 접근을 제공한다.
  

### 기억 추적 :   
생성자를 private으로 선언하여 new를 통한 객체생성을 못하게 한다.
클래스 내부에는 본인 스스로를 static으로 선언하여 접근을 제어시킨 후
해당 변수를 getInstance 함수등을 통해 제공한다.
```java
class Singleton{
	
	private static unique;
	
	private Singleton(){ }
	
	public static Singleton getInstance(){
		if(unique == null){
			unique = new Singleton();
		}
		return unique;
	}
}
```



### UML
![Alt uml](./singleton_uml.png?s=200 )

