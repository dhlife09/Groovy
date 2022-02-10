def a = 20      //값 할당과 동시에 변수의 type 결정
a = "String"    //다른 값을 할당 시 변수의 type 변경
b = "String"    //변수 선언 시 def 생략 가능

int c = 22      //변수 a는 int로 고정됨
//c = "String"  //문자열 값을 할당하면 오류 발생

String d = "String" //변수 d는 String으로 고정됨
d = 20              //int(20)가 String("20")으로 변환후 변수할당